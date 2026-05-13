package conexao;

import conexao.Menu.Menuadd;
import conexao.entidades.Produto;

public class App {
    static void main(String[] args) {

        System.out.println("=============================================\t\tS Y S T E M A\t\t===================================================");
        System.out.println("||\t\t\t======= \t======= \t||      \t=======\t\t\t\t======== \t======= \t======= \t=======\t\t\t||");
        System.out.println("||\t\t\t    //  \t||      \t||===== \t||   ||\t\t\t\t||       \t||   || \t||      \t||   ||\t\t\t||");
        System.out.println("||\t\t\t  //    \t||====  \t||      \t||   ||\t\t\t\t======== \t||   || \t||      \t||   ||\t\t\t||");
        System.out.println("||\t\t\t//      \t||      \t||      \t||   ||\t\t\t\t||       \t||   || \t||      \t||   ||\t\t\t||");
        System.out.println("||\t\t\t======  \t======= \t||      \t=======\t\t\t\t||       \t======= \t======= \t=======\t\t\t||");
        System.out.println("=============================================\t\tS Y S T E M A\t\t==================================================");

        Produto produto = new Produto();
        System.out.println("Adicionando um Produto");
        System.out.println("=========================================");
        new Menuadd().Produtoadd(produto);

    }
}
