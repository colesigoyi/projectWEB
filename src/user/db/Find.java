package user.db;

import user.User;
import user.dao.DBConnection;

import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 * @program: projectWEB
 * @author: TaoXueFeng
 * @create: 2019-08-18 01:37
 * @desc:
 **/

public class Find {
        public static User findUser(String username) {
            Connection conn = null;
            Statement st = null;
            ResultSet rs = null;
            try {
                conn = DBConnection.getConnection();
                String sql = "SELECT username, password FROM UserDataBase WHERE username = '" + username + "'";
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    User user = new User();
                    user.setName(rs.getString("username"));
                    user.setPass(rs.getString("password"));
                    //list.add(user);
                    //System.out.println(user.getName());
                    //System.out.println(user.getPass());
                    System.out.println();
                    return user;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                DBConnection.close(rs, st, conn);
            }
            return null;
        }
    }

