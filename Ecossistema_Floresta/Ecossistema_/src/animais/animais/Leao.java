package animais;

public class Leao extends Mamiferos {
    public Leao(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void mover() {
        System.out.println("O leão está caçando sua presa.");
    }
    
    @Override
    public void comer() {
        System.out.println("O leão está se alimentando de sua presa.");
    }
    
    @Override
    public void reproduzir() {
        System.out.println("O leão está acasalando para reprodução.");
    }
}
