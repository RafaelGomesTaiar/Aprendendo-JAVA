import javax.swing.JOptionPane;

public class PetShop {
    public static void main(String[] args) {
        //Animal a1 = new Animal("azeitona"); classe abstrata nao pode ser instanciada
        Gato bichano = new Gato();
        System.out.println("bichano: " + bichano);
        bichano.fazBarulho();
        String nome = JOptionPane.showInputDialog("digite o nome do gato");
        bichano.setNome(nome);
        System.out.println("bichano: " + bichano);
    }
}
