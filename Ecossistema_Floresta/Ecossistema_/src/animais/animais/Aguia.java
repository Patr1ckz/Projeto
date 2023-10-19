package animais;

public class Aguia extends Aves {
    public Aguia(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void voar() {
        System.out.println("A águia está voando nas alturas em busca de presas.");
    }
    
    @Override
    public void comer() {
        System.out.println("A águia está se alimentando de sua presa capturada.");
    }
    
    @Override
    public void reproduzir() {
        System.out.println("As águias estão acasalando e construindo ninhos para reprodução.");
    }
}
