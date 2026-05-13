import java.util.ArrayList;
import java.util.List;

public class Pedidos {
    private final int idCliente;
    private final List<ItemPedido> itens;

    public Pedidos(int idCliente){
        this.idCliente = idCliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        this.itens.add(item);
    }

    public int getIdCliente() { return idCliente; }
    public List<ItemPedido> getItens() { return itens; }
}