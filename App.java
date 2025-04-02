public class App {
    
    public static void main(String[] args) {
        Garcom g = new Garcom();
        String pedido;
        double preco;

        g.fecheAJanela();

        pedido = g.tragaFritas();
        System.out.println("Recebido: " + pedido);

        pedido = g.tragaHamburguer();
        System.out.println("Recebido: " + pedido);
        
        preco = g.precoHambuerguer();
        System.out.println("Valor: R$" + preco);

        preco = g.qualPreco(2, 3);
        System.out.println("Preço: R$" + preco);
    }
}
