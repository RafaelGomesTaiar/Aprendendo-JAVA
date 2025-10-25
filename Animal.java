public abstract class Animal {
    private String nome;
    //recriar o contrutor padrão

    public Animal() {
        nome = "nonononono";
    }
    public Animal (String nome) {
        this.nome = nome;
    }
    public String getNome () {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public abstract void fazBarulho ();
    public void dorme () {
        System.out.println("zzzzzzzzzz");
    }
    @Override
    public String toString () {
        return "nome: " + nome;
    }
}