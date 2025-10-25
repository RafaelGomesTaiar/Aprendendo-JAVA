//leu um numero inteiro, calcular e mostrar seu sucessor e antecessor 

import java.util.Scanner;

public class Sucessor_antecessor {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);   
        int sucessor, antecessor, numero1;
        System.out.println("digite o numero: ");
        numero1 = scanner.nextInt();
          

        sucessor = numero1 + 1;
        antecessor = numero1 - 1;

        System.out.println("o sucessor foi: " + sucessor);
        System.out.println("o antecessor foi: " + antecessor);
        scanner.close();

    }
}