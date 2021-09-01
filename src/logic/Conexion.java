
package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static Connection conn;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "admin";
    private static final String url = "jdbc:mysql://localhost:3306/clientmanager?autoReconnect=true&useSSL=false";

    public Conexion() {
        conn = null;
        try {
            Class.forName(driver);
            conn =  DriverManager.getConnection(url,user,password);
            if(conn != null){
                System.out.println("Conexion Establecida...");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("error " + e);
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
    
}
