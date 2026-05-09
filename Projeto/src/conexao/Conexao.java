package conexao.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_vendas";
    private static final String USER = "root";
    private static final String PASS = "Sua_senha";

    public static Connection getConexao() {
        try{
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }
}
