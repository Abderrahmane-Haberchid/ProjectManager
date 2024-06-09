package Controller;

import java.sql.*;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;
    private DatabaseConnection() {
        // Initialize the database connection
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projet_db", "postgres", "root123");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void executeQuery(String query) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while(rs.next())
            System.out.println("name : "+rs.getString(2));
    }
}
