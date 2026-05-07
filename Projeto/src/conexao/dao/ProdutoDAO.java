package conexao.dao;

import java.sql.PreparedStatement;

import conexao.entidades.Produto;

public class ProdutoDAO {
    

    public void addProduto(Produto produto){
        PreparedStatement ps = null;
        String sql = "INSERT INTO () VALUES()";

        try {
            ps = conexao.conexao.Conexao.getConexao().prepareStatement(sql);

            ps.execute();
            ps.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
