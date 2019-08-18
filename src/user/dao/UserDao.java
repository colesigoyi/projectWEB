package user.dao;

import user.User;
import user.db.DataBase;
import user.db.Find;


/**
 * @program: projectWEB
 * @author: TaoXueFeng
 * @create: 2019-08-16 20:24
 * @desc:
 **/

public class UserDao {
    DataBase dataBase = DataBase.getInstance();
    //public int save(User user) {
    //    return DataBase.save(user);
    //}

    public User findUserByUsername(String username) {

        User user = Find.findUser(username);
        return user;
    }

    public void addUser(String username, String password) {

        dataBase.saveUser(username, password);
    }
}
