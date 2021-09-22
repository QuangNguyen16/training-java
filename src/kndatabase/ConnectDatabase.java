package kndatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Admin
 */
public class ConnectDatabase {

    public static Connection connection;
    private static String db_url = ("jdbc:mysql://localhost:3306/test");
    private static String db_user = "root";
    private static String db_pass = "";

    public static Connection open() throws Exception {
        if (connection == null) {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(db_url, db_user, db_pass);
        }
        return connection;
    }

    public static void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void deleteData(String ma,String sql){
        try{
        open();
        PreparedStatement ps = ConnectDatabase.connection.prepareStatement(sql);
        ps.setString(1,ma);
        ps.executeUpdate();
        
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
