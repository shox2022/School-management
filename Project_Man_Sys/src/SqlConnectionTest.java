

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnectionTest {

    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost\\DESKTOP-RAU0A4D\\SQLEXPRESS:1433;databaseName=Airport Program;encrypt=true;trustServerCertificate=true;";
        String user = "sa";
        String password = "1234";

        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");      
             

        } catch (SQLException e) {
            // Handle any SQL errors
            System.out.println("SQL Exception: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Error Code: " + e.getErrorCode());
            e.printStackTrace();
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    static Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}