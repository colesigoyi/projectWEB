package user.service;

import user.User;
import user.dao.UserDao;
import user.dao.impl.UserDaoImpl;

/**
 * @program: projectWEB
 * @author: TaoXueFeng
 * @create: 2019-08-16 20:23
 * @desc:
 **/

public class UserService {
    private static UserDao userDao = new UserDaoImpl();

    //public static boolean regist(User user) {
    //    //    int save = userDao.save(user);
    //    //    return save == 1 ? true : false;
    //    //}

    public boolean checkUsername(String username) {
        if (userDao.findUserByUsername(username) != null) {
            return false;
        }
        return true;
    }

    public void regist(String username, String password) {
        userDao.addUser(username, password);
    }

    public User login(String username, String password) {
        User user = userDao.findUserByUsername(username);
        if (user != null) {
            if (user.getPass().equals(password)) {
                return user;
            }else {
                return null;
            }
        }
        return null;
    }
}
