package conexao.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import conexao.entidades.Clientes;

public class ClientesDAO {
    public static void addClientes(Clientes clientes){

        PreparedStatement asd = null;
        String sql = "INSERT INTO clientes(id_clientes, nome_clientes, CPF) VALUES(?,?,?)";

        

    }
}
