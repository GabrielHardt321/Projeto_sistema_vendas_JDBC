public class ItemPedido {
    private final int idProduto;
    private final int quantidade;
    private final double precoUnitario;

    // Construtor: o objeto nasce com os dados, sem precisar de set
    public ItemPedido(int idProduto, int quantidade, double precoUnitario) {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    // Getters para o DAO conseguir ler os valores
    public int getIdProduto() { return idProduto; }
    public int getQuantidade() { return quantidade; }
    public double getPrecoUnitario() { return precoUnitario; }
}