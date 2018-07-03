package pwr.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getDBconnection() {

        Connection connection = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/films?useSSL=false&serverTimezone=UTC", "root", "trocheumrzyj1!Q");

            if (connection != null){
                System.out.printf("Connection established \n");
            }

        } catch (ClassNotFoundException e) {
            System.out.printf("Class not found");
        } catch (SQLException e) {
            System.out.printf("Couldn't estalish connection");
        }

        return connection;
    }
}
