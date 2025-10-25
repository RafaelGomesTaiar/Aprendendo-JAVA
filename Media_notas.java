import javax.swing.JOptionPane;

public class Media_notas {
    public static void main(String[] args) {
     int nota1 = Integer.parseInt(
     JOptionPane.showInputDialog("digite a primeira nota")
     );
     int nota2 = Integer.parseInt(
        JOptionPane.showInputDialog("digite a segunda nota")
     );
     double media = (double)nota1 + (double)nota2 / 2;

     if(media >=70) {
        JOptionPane.showMessageDialog(null, "voce foi aprovado com" + media);

     }
     else{
        JOptionPane.showMessageDialog(null, "voce foi reprovado com" + media);


     }
     }



}