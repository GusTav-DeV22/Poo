package ads.poo;

public abstract class Animal {

    protected String nome;


    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract String habilidade();



    @Override
    public String toString() {
        String nomeclass = getClass().getSimpleName();
        return "%s é um %s".formatted(nome, nomeclass);
    }
}
