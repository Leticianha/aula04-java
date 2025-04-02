public class Garcom {

    void fecheAJanela() {
        System.out.println("janela fechada");
    }

    String tragaFritas() {
        return "Batata fritas";
    }

    String tragaHamburguer() {
        return "Hambúrguer";
    }

    //traga o preço dp hamburguer
    double precoHambuerguer() {
        return 27.99;
    }
    
    //metodo e dentro do parentese coloca os parametros
    //pode ter so um return por metodo mas varios parametros
    double qualPreco(int codProduto, int qtde) {
        double preco;
        if(codProduto == 1) {
            preco = 12.5;
        } else {
            if(codProduto == 2){
                preco = 23.7;
            } else {
                preco = 19.8;
            }
        }

        return preco * qtde;
    }

}