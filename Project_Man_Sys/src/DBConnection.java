
import java.sql.DriverManager;
import java.sql.Connection;

public class DBConnection {
    public static Connection connect(){
    Connection con=null;
    try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con=(Connection) DriverManager.getConnection("jdbc:sqlserver://localhost\\DESKTOP-RAU0A4D\\SQLEXPRESS:1433;databaseName=Airport Program;encrypt=true;trustServerCertificate=true","sa","1234");
        
    }
    
catch(Exception e){
    System.out.println("The error was: "+ e);  
}
    return con;
        }
}