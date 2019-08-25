package user.dao.impl;

import user.User;
import user.dao.UserDao;
import user.db.DataBase;
import user.db.Find;


/**
 * @ program: projectWEB
 * @ author: TaoXueFeng
 * @ create: 2019-08-16 20:24
 * @ desc:
 **/

public class UserDaoImpl implements UserDao {
    DataBase dataBase = DataBase.getInstance();
    //public int save(User user) {
    //    return DataBase.save(user);
    //}
    @Override
    public User findUserByUsername(String username) {

        User user = Find.findUser(username);
        return user;
    }
    @Override
    public void addUser(String username, String password) {

        dataBase.saveUser(username, password);
    }


}
