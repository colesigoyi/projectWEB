package user.web.servlet;

import user.User;
import user.service.UserService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registServlet")
public class registServlet extends HttpServlet {
    private UserService userService = new UserService();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.isEmpty() || password.isEmpty()) {
            request.getRequestDispatcher("registError.jsp").forward(request, response);
        }else {
            User user = new User(username, password);
            boolean isSuccess = userService.checkUsername(username);
            if (isSuccess) {
                userService.regist(username, password);
                request.getSession().setAttribute("user", user);
                response.sendRedirect("index.jsp");
            }else {
                request.getRequestDispatcher("registError.jsp").forward(request, response);
            }
        }
    }
}
