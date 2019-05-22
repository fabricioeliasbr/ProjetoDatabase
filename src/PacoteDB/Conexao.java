package PacoteDB;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    public static Connection abrirConexao() {
        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://127.0.0.1/estacionamento?";
            url += "user=root&password=etecia";

            con = DriverManager.getConnection(url);
            System.out.println("Conexão aberta!");
        } catch (SQLException e) {
        } catch(ClassNotFoundException e){
        } catch(Exception e){
        }
        return con;
    }
}