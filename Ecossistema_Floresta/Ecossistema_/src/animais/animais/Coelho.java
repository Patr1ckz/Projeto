package animais;

public class Coelho extends Mamiferos {
    public Coelho(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void mover() {
        System.out.println("O coelho está saltando pelos campos.");
    }
    
    @Override
    public void comer() {
        System.out.println("O coelho está se alimentando de vegetação.");
    }
    
    @Override
    public void reproduzir() {
        System.out.println("Os coelhos estão acasalando para reprodução.");
    }
}

