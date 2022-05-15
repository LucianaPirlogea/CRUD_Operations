package produs;

import java.sql.ResultSet;
import java.sql.SQLException;

public class produs {
    public int id;
    public String nume;
    public double pret;

    public produs(ResultSet in) throws SQLException {
        read(in);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "produs{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                '}';
    }

    public void read(ResultSet in) throws SQLException {
        this.id = in.getInt("id");
        this.nume = in.getString("nume");
        this.pret = in.getDouble("pret");
    }
}

