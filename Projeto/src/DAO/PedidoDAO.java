package conexao.DAO;

import java.sql.*;
import java.util.List;
import conexao.entidades.Pedidos;
import conexao.entidades.ItemPedido;
import conexao.Conexao;

public class PedidoDAO {
    public void finalizarVenda(Pedidos pedidos){
        String sqlPedido = "INSERT INTO pedidos (id_cliente, status) VALUES (?, ?)";
        String sqlItem = "INSERT INTO itens_pedido (id_pedido, id_produto, quantidade, preco_unitario) VALUES (?, ?, ?, ?)";

        Connection conn = null;

        try {
            conn = Conexao.getConexao();
            conn.setAutoCommit(false);

            PreparedStatement psPedido = conn.prepareStatement(sqlPedido, Statement.RETURN_GENERATED_KEYS);
            psPedido.setInt(1, pedidos.getIdCliente());
            psPedido.setString(2, pedidos.getStatus());
            psPedido.executeUpdate();

            ResultSet rs = psPedido.getGeneratedKeys(); 
            int idPedidoGerado = 0;
            if (rs.next()){
                idPedidoGerado = rs.getInt(1);
            }

            PreparedStatement psItem = conn.prepareStatement(sqlItem);
            for (ItemPedido item: pedidos.getItens()) {
                psItem.setInt(1, idPedidoGerado);
                psItem.setInt(2, item.getIdProduto());
                psItem.setInt(3, item.getQuantidade());
                psItem.setDouble(4, item.getPrecoUnitario());
                psItem.executeUpdate();
            }

            conn.commit();
            System.out.println("Venda Finalizada com sucesso!!! Pedido n°: " + idPedidoGerado);

        } catch(SQLException e){
            try {
                if(conn != null) conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("Erro ao finalizar venda: " + e.getMessage());
        } finally {
            try {
                if(conn != null) conn.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
