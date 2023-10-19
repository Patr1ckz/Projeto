package vegetacao;

public class Arvore extends Planta {
    public Arvore(String nome) {
        super(nome);
    }

    @Override
    public void crescer() {
        System.out.println("A árvore está crescendo e se tornando mais alta.");
    }

    @Override
    public void reproduzir() {
        System.out.println("As árvores estão produzindo sementes para reprodução.");
    }
}
