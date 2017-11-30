package DAL;

import java.sql.*;


public class DBConnection {
    //Pytje -- URL ??
    private static final String URL = "jdbc:mysql://localhost:3306/dyqaniitelefonave3";
    private static final String User = "root";
    private static final String Password = "mysql";
    
    public static Connection getConnection()throws SQLException{
        try{
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            return DriverManager.getConnection(URL,User,Password);
            
        }catch(SQLException ex){
            throw new SQLException("DBConnection : Nuk mund te lidhet me baze te te dhenave!!");
        }
    } 
}
