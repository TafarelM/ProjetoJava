package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tafar
 */
public class ConnectionFactory {
    
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = "jdbc:sqlserver://TAFA-PC:1433;databaseName=JavaProjeto";
    private static final String USER = "sa";
    private static final String PASS = "123";
    
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
            
        }catch(ClassNotFoundException | SQLException exception) {
            throw new RuntimeException("ERRO AO TENTAR CONECTAR: ", exception);
        }
    }
    
    public static void closeConnection(Connection conn) {
        try {
            if(conn != null) {
                conn.close();
            }
        }catch(SQLException exception) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, exception);
        }
    }
    
    public static void closeConnection(Connection conn, PreparedStatement stmt) {
        
        closeConnection(conn);
        
        try {
            if(stmt != null) {
                stmt.close();
            }
        }catch(SQLException exception) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, exception);
        }
    }
    
    public static void closeConnection(Connection conn, PreparedStatement stmt, ResultSet rs) {
        
        closeConnection(conn, stmt);
        
        try {
            if(rs != null) {
                rs.close();
            }
        }catch(SQLException exception) {
           Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, exception);
        }
    }        
}
