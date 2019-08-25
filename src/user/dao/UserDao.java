package user.dao;

import user.User;

/**
 * @ program: projectWEB
 * @ author:  TaoXueFeng
 * @ create: 2019-08-24 16:59
 * @ desc:
 **/

public interface UserDao {
    User findUserByUsername(String username);

    void addUser(String username, String password);
}
