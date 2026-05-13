package conexao.Menu;

import conexao.DAO.ProdutoDAO;
import conexao.entidades.Produto;

import java.util.Scanner;
import conexao.Servicos.Produtoser;

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
