package vegetacao;

public class Arbusto extends Planta {
    public Arbusto(String nome) {
        super(nome);
    }

    @Override
    public void crescer() {
        System.out.println("O arbusto está crescendo e se tornando mais denso.");
    }

    @Override
    public void reproduzir() {
        System.out.println("Os arbustos estão produzindo sementes para reprodução.");
    }
}
