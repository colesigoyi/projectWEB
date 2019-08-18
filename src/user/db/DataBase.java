package user.db;

import user.User;
import user.dao.DBConnection;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: projectWEB
 * @author: TaoXueFeng
 * @create: 2019-08-16 20:23
 * @desc:
 **/

public class DataBase {

    private static List<User> userList = new ArrayList<>();

    private static DataBase instance = new DataBase();

    public DataBase() {}

    public static DataBase getInstance() {
        //饿汉式
        return instance;
    }

    //public static int save(User user) {
    //    try {
    //        if (user != null) {
    //            userList.add(user);
    //            return 1;
    //        }
    //    }catch (Exception e) {
    //        e.printStackTrace();
    //    }
    //    return 0;
    //}


    //public static User findUser(String username) {
        //Connection conn = null;
        //Statement st = null;
        //ResultSet rs = null;
        //try {
        //    conn = DBConnection.getConnection();
        //    String sql = "select name from User where name =" + "'" + username + "'";
        //
        //    st = conn.createStatement();
        //    rs = st.executeQuery(sql);
        //    while (rs.next()) {
        //        User user = new User();
        //        user.setName(rs.getString("name"));
        //        user.setPass(rs.getString("password"));
        //        //list.add(user);
        //        System.out.println(user.getName());
        //        System.out.println(user.getPass());
        //        return user;
        //    }
        //} catch (SQLException e) {
        //    e.printStackTrace();
        //} finally {
        //    DBConnection.close(rs, st, conn);
        //}
        //return null;
        //try {
        //    ObjectInputStream ois = new ObjectInputStream(
        //            new FileInputStream(
        //                    "/Users/taoxuefeng/Documents/02_StudyCoding" +
        //                            "/01_Java/projectWEB/src/user/db/User.txt"));
        //    userList = (ArrayList<User>) ois.readObject();
        //    for (User value : userList) {
        //        if ((value).getName().equals(username)) {
        //            //System.out.println(value);
        //            return value;
        //        }
        //        ois.close();
        //    }
        //} catch (ClassNotFoundException | IOException e) {
        //    e.printStackTrace();
        //}
        //return null;
    //}

    public static void saveUser(String username, String password) {
        boolean flag = false;
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = DBConnection.getConnection();
            String  sql = "insert into UserDataBase (username, password) values(?,?)";
            pst = conn.prepareStatement(sql);
            User user = new User(username, password);
            pst.setString(1,user.getName());
            pst.setString(2,user.getPass());
            int rows = pst.executeUpdate();
            if (rows > 0) {
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.close(pst, conn);
        }
        //try {
        //    ObjectOutputStream oos = new ObjectOutputStream(
        //            new FileOutputStream(
        //                    "/Users/taoxuefeng/Documents/02_StudyCoding" +
        //                            "/01_Java/projectWEB/src/user/db/User.txt"));
        //    User user = new User(username, password);
        //    //System.out.println(user);
        //    userList.add(user);
        //    oos.writeObject(userList);
        //    oos.close();
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}
    }
}
//class Add {
//    public boolean add(User user) {
//        boolean flag = false;
//        Connection conn = null;
//        PreparedStatement pst = null;
//        /*
//        CREATE TABLE IF NOT EXISTS `teacherInfo`(
//        `number` INT UNSIGNED AUTO_INCREMENT,
//        `name` VARCHAR(40) NOT NULL,
//        `classname` VARCHAR(40) NOT NULL,
//        `address` VARCHAR(40) NOT NULL,
//        PRIMARY KEY ( `number` )
//        )ENGINE=InnoDB DEFAULT CHARSET=utf8;
//         */
//
//        try {
//            conn = DBConnection.getConnection();
//            String  sql = "insert into User (name, password) values(?,?)";
//            pst = conn.prepareStatement(sql);
//
//            pst.setString(1,user.getName());
//            pst.setString(1,user.getPass());
//            int rows = pst.executeUpdate();
//            if (rows > 0) {
//                flag = true;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            DBConnection.close(pst, conn);
//        }
//        return flag;
//    }
//}
//class GetInfo {
//    public List<User> getUsers() {
//        List<User> list = new ArrayList<User>();
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//        try {
//            conn = DBConnection.getConnection();
//            String sql = "select * from User";
//            st = conn.createStatement();
//            rs = st.executeQuery(sql);
//            while (rs.next()) {
//                User user = new User();
//                user.setName(rs.getString("name"));
//                user.setPass(rs.getString("password"));
//                list.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            DBConnection.close(rs, st, conn);
//        }
//        return list;
//    }
//}
//class Find {
//    public static User findUser(String username) {
//        Connection conn = null;
//        Statement st = null;
//        ResultSet rs = null;
//        try {
//            conn = DBConnection.getConnection();
//            String sql = "select name from User where name =" + "'" + username + "'";
//
//            st = conn.createStatement();
//            rs = st.executeQuery(sql);
//            while (rs.next()) {
//                User user = new User();
//                user.setName(rs.getString("name"));
//                user.setPass(rs.getString("password"));
//                //list.add(user);
//                System.out.println(user.getName());
//                System.out.println(user.getPass());
//                return user;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            DBConnection.close(rs, st, conn);
//        }
//        return null;
//    }
//}