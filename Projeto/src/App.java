package conexao;

import conexao.Menu.Menuadd;
import conexao.entidades.Produto;

public class App {
    static void main(String[] args) {
        Produto produto = new Produto();
        System.out.println("Adicionando um Produto");
        System.out.println("=========================================");
        new Menuadd().Produtoadd(produto);

    }
}
