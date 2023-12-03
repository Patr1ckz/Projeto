package ecossistema.animals;

public class Aguia extends Ave {
    public Aguia(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void comer(Animal presa) {
        System.out.println(nome + " está observando " + presa.nome + " no ar.");
    }

    @Override
    public void acaoEspecial() {
        System.out.println(nome + " está sobrevoando e observando a presa.");
    }
}
