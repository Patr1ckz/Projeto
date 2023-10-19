package vegetacao;

public class Planta {
    protected String nome;

    public Planta(String nome) {
        this.nome = nome;
    }

    public void crescer() {
        System.out.println("A planta está crescendo.");
    }

    public void reproduzir() {
        System.out.println("A planta está se reproduzindo.");
    }
}
