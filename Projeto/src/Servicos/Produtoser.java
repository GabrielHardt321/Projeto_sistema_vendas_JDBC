package conexao.Servicos;


import conexao.DAO.ProdutoDAO;
import conexao.entidades.Produto;

public class Produtoser {
    public void  adicionar(Produto produto) {
        if (produto.getNome() != null) {
            ProdutoDAO.addProduto(produto);
            System.out.println("Produto cadastrado");
        }
    }
    public void mostrar(Produto produto){
        ProdutoDAO.addProduto(produto);
    }
    }

