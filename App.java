//do garçom
// public class App {
    
//     public static void main(String[] args) {
//         Garcom g = new Garcom();
//         String pedido;
//         double preco;

//         g.fecheAJanela();

//         pedido = g.tragaFritas();
//         System.out.println("Recebido: " + pedido);

//         pedido = g.tragaHamburguer();
//         System.out.println("Recebido: " + pedido);
        
//         preco = g.precoHambuerguer();
//         System.out.println("Valor: R$" + preco);

//         preco = g.qualPreco(2, 3);
//         System.out.println("Preço: R$" + preco);
//     }
// }

//Atividade
import java.util.Scanner;

public class App {    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Lanchonete garcom = new Lanchonete();

        int codProduto, qtde;
        double preco;

        System.out.println("Digite o número do seu item \n[1 - Batata Frita\n2 - Hambúrguer\n3 - Nuggets]");
        codProduto = entrada.nextInt();

        System.out.println("Digite a quantidade você deseja: ");
        qtde = entrada.nextInt();

        preco = garcom.qualPreco(codProduto, qtde);
        System.out.println("Preço total: " + preco);

        entrada.close();
    }

}