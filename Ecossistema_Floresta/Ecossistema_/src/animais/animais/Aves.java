package animais;

public class Aves {
    protected String nome;
    protected int idade;
    
    public Aves(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void voar() {
        System.out.println("A ave está voando no céu.");
    }
    
    public void comer() {
        System.out.println("A ave está se alimentando de insetos.");
    }
    
    public void reproduzir() {
        System.out.println("As aves estão construindo ninhos para reprodução.");
    }
}
