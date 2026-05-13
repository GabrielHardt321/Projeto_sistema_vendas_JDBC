package Conexao.Servicos;


import Conexao.DAO.ProdutoDAO;
import Conexao.entidades.Produto;

public class Produtoser {
    public void  adicionar(Produto produto) {
        if (produto.getNome_Produtos() != null) {
            ProdutoDAO.addProduto(produto);
            System.out.println("Produto cadastrado");
        }
    }
    public void mostrar(Produto produto){
        ProdutoDAO.addProduto(produto);
    }
    }

