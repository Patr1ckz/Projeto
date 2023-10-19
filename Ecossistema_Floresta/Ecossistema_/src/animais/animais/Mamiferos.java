package animais;

public class Mamiferos {
    protected String nome;
    protected int idade;
    
    public Mamiferos(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void mover() {
        System.out.println("O mamífero está se movendo.");
    }
    
    public void comer() {
        System.out.println("O mamífero está se alimentando.");
    }
    
    public void reproduzir() {
        System.out.println("O mamífero está se reproduzindo.");
    }
}
