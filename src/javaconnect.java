import java.sql.*;

public class javaconnect 
{   
    
    public static Connection ConnecrDb() 
    {
        Connection conn = null;
        try 
        {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "librarydb";
        //String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        
        
            //Class.forName(driver);
            conn = DriverManager.getConnection(url+dbName,userName,password);
            if (conn != null) {
               System.out.println("CONNECTION SUCCESSFUL!");
            } 
        }
        catch (SQLException ex) 
        {
            System.out.println("CONNECTION FAILED!");
            ex.printStackTrace();
        }
        return conn;  
    }
}
