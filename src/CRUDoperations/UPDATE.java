package CRUDoperations;

import produs.produs;

import java.sql.*;

public class UPDATE {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/labtema";
        String username = "root";
        String password = "";

        try(Connection connection = DriverManager.getConnection(url, username, password)){

            update(connection, "bicicleta", 1000.0, 18);
            update(connection, "tastatura", 70.0, 1);
            update(connection, "casti", 10.0, 10);
            update(connection, "masina de spalat", 1400.0, 12);
            update(connection, "uscator de par", 300.0, 13);
            update(connection, "zahar 1kg", 13.0, 14);
            update(connection, "faina 1kg", 8.0, 15);
            update(connection, "lapte", 9.0, 16);
            update(connection, "mouse", 70.0, 17);
            update(connection, "detergent de vase", 16.0, 19);

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void update(Connection connection, String nume, Double pret, int id) throws SQLException {
        String query = "UPDATE produse SET nume = ?, pret = ? WHERE id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1,nume);
        preparedStatement.setDouble(2, pret);
        preparedStatement.setInt(3, id);
        preparedStatement.executeUpdate();
    }
}
