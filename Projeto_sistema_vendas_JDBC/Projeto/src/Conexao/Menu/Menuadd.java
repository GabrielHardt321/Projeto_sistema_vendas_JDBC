package Conexao.Menu;

import Conexao.DAO.ProdutoDAO;
import Conexao.entidades.Produto;

import java.util.Scanner;
import Conexao.Servicos.Produtoser;

public class Menuadd {
    Scanner cin = new Scanner(System.in);
    public  void Produtoadd(Produto produto){
        System.out.print("Nome: ");
        produto.setNome_Produtos(cin.nextLine());
        System.out.print("Preço: ");
        produto.setPreco(cin.nextFloat());
        System.out.print("Estoque: ");
        produto.setEstoque(cin.nextInt());
        new Produtoser().adicionar(produto);
        new ProdutoDAO().mostrarProduts(produto);
    }

}
