import animais.*;
import vegetacao.*;


public class Simulador {
    public static void main(String[] args) {
        // Criando objetos de mamíferos
        Leao leao = new Leao("Simba", 5);
        Coelho coelho = new Coelho("Pernalonga", 2);

        // Criando objeto de ave
        Aguia aguia = new Aguia("Falcão", 3);

        // Criando objetos de plantas
        Arvore arvore = new Arvore("Carvalho");
        Arbusto arbusto = new Arbusto("Roseira");

        // Chamando os  métodos dos objetos
        System.out.println("Mamíferos:");
        System.out.println("------------");
        leao.mover();
        leao.comer();
        leao.reproduzir();
        System.out.println();
        coelho.mover();
        coelho.comer();
        coelho.reproduzir();

        System.out.println("\nAves:");
        System.out.println("------------");
        aguia.voar();
        aguia.comer();
        aguia.reproduzir();

        System.out.println("\nPlantas:");
        System.out.println("------------");
        arvore.crescer();
        arvore.reproduzir();
        System.out.println();
        arbusto.crescer();
        arbusto.reproduzir();
    }
}
