//ler o premio da loteria, calcular 46% para o primeiro jogador,32% para o segundo e o restante para o 3o
import java.util.Scanner;
public class Loteria {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //entrada
        System.out.println ("digite o valor do premio: ");     
        double premio = scanner.nextDouble();
        double primeiro = 46 * premio / 100; 
        double segundo = 32 * premio / 100;
        double terceiro = premio - primeiro - segundo;
        System.out.println("o primeiro leva: " + primeiro + "\n o segundo leva: " + segundo + "\n e no terceiro" + " " + terceiro);
        scanner.close();
        


    }
}