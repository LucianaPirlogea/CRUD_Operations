package CRUDoperations;

import com.mysql.cj.result.Row;
import produs.produs;

import javax.swing.tree.RowMapper;
import java.sql.*;

public class READ {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/labtema";
        String username = "root";
        String password = "";

        try(Connection connection = DriverManager.getConnection(url, username, password)){
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM produse");
            while(result.next()) {
                produs produs = new produs(result);
                System.out.println(produs.toString());
            }
            statement.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
