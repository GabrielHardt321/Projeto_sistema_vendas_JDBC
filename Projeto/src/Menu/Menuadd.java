package conexao.Menu;

import conexao.entidades.Produto;

import java.util.Scanner;
import conexao.Servicos.Produtoser;

public class Menuadd {
    Scanner cin = new Scanner(System.in);
    public  void Produtoadd(Produto produto){
        System.out.print("Nome: ");
        produto.setNome(cin.nextLine());
        System.out.print("Preço: ");
        produto.setPreco(cin.nextFloat());
        System.out.println("Estoque: ");
        produto.setEstoque(cin.nextInt());
        new Produtoser().adicionar(produto);

    }

}
