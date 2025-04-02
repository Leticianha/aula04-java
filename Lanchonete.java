public class Lanchonete {
    
    double qualPreco(int codItem, int qtde) {
        double preco;
        if(codItem == 1) {
            preco = 12.5;
        } else {
            if(codItem == 2){
                preco = 23.7;
            } else {
                preco = 19.8;
            }
        }

        return preco * qtde;
    }
}
