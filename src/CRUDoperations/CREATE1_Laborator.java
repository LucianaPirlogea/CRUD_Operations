package CRUDoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CREATE1_Laborator {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/labtema";
        //protocolul = jdbc
        //numele vendorului
        //urlul nostru pentru schema din workbench

        String username = "root";
        String password = ""; //ori e goala ori este tot root

        try {
            //Statement ma constrange foarte tare si trebuie sa fiu foarte atent cum scriu query-ul
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            String query = "insert into produse values(null, 'tastatura', 50)";
            statement.executeUpdate(query);


            //se inchid in ordine inversa deschiderii
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
