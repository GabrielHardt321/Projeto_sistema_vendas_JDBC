package conexao.DAO;

import java.sql.PreparedStatement;

import conexao.entidades.Produto;

public class ProdutoDAO {
    

    public static void addProduto(Produto produto){
        PreparedStatement ps = null;
        String sql = "INSERT INTO produtos (nome, preco , estoque) VALUES(?,?,?)";

        try {
            ps = conexao.conexao.Conexao.getConexao().prepareStatement(sql);

            ps.setString(1, produto.getNome());
            ps.setFloat(2,produto.getPreco());
            ps.setInt(3,produto.getEstoque());

            ps.execute();
            ps.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
