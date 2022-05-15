package CRUDoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CREATE {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/labtema";
        String username = "root";
        String password = "";


        try (Connection connection = DriverManager.getConnection(url, username, password)) {

            create(connection, "masina de spalat", 1300.0);
            create(connection, "uscator de par", 200.0);
            create(connection, "zahar 1kg", 12.0);
            create(connection, "faina 1kg", 7.0);
            create(connection, "lapte", 8.0);
            create(connection, "mouse", 68.0);
            create(connection, "bicicleta", 1600.0);
            create(connection, "detergent de vase", 15.0);
            create(connection, "batiste nazale", 1.0);
            create(connection, "lichid de parbriz", 5.0);


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    private static void create(Connection connection, String nume, Double pret) throws SQLException {

        String query = "insert into produse values(null,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1,nume);
        preparedStatement.setDouble(2, pret);

        preparedStatement.executeUpdate();

    }
}
