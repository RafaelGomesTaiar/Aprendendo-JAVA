//ler a quantidade de produtos comprados. Se a quantidade < 10, o preço é 5,00, se nâo 4,50. Calcular e mostrar o total da compra

import java.util.Scanner;

public class Produtos {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite qunatos produtos voce comprou");
        int quantidade = scanner.nextInt();
        double produtos;


    if(quantidade < 10){
        produtos = quantidade* 5;
        System.out.println("o preco total da compra foi: " + produtos);  
    }
    else{
        produtos = quantidade* 4.50;
        System.out.println("o preco total da compra foi: " + produtos);
    }
    scanner.close();
    }
}