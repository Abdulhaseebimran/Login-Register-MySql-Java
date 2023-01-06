/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABDUL HASEEB
 */
import java.sql.*;

public class DBConnection {

    static final String DB_URL = "jdbc:mysql://localhost/demo";
    static final String USER = "root";
    static final String PASS = "";

    public static Connection ConnectDB() {
        Connection con = null;
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            return con;
        } catch (Exception e) {
            System.err.println("There were error while connecting to DB..");
            return null;
        }
    }
}
