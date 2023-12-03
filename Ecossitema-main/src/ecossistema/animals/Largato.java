package ecossistema.animals;

public class Largato extends Reptil {
    public Largato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void comer(Animal presa) {
        System.out.println(nome + " está caçando " + presa.nome + " no solo.");
    }

    @Override
    public void acaoEspecial() {
        defender();
    }

    private void defender() {
        System.out.println(nome + " está se defendendo contra um predador.");
    }
}
