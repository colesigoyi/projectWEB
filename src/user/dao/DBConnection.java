package user.dao;

import java.sql.*;

/**
 * @program: projectWEB
 * @author: TaoXueFeng
 * @create: 2019-08-18 00:46
 * @desc: JDBC查询数据库
 **/

public class DBConnection {
    /*
        硬编码：把外部变量值写死在程序中，需要修改时，要重新编译，对系统很不友好
         */
    //定义MySQL的数据库驱动程序
    public static final String DBDRIVER = "com.mysql.jdbc.Driver";
    //定义MySQL数据库链接地址
    public static final String DBDURL = "jdbc:mysql://localhost:3306/UserDataBase";
    //MySQL数据库的连接用户名
    public static final String DBUSER = "root";
    //MySQL数据库的连接密码
    public static final String DBPASS = "root";

    static {
        try {
            Class.forName(DBDRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /*
    获取数据库连接对象
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DBDURL,DBUSER,DBPASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void close(ResultSet rs, Statement st, Connection conn) {

        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    public static void close(Statement st, Connection conn) {
        close(null, st, conn);
    }
}
