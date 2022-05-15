package CRUDoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DELETE {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/labtema";
        String username = "root";
        String password = "";

        try(Connection connection = DriverManager.getConnection(url, username, password)){

            delete(connection, 24);
            delete(connection, 30);

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void delete(Connection connection, int id) throws SQLException {
        String query = "DELETE FROM produse WHERE id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }
}
