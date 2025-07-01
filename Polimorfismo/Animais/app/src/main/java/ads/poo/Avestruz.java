package ads.poo;

public class Avestruz extends Animal implements Terrestre {



    public Avestruz(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return "%s fala e %s ".formatted(nome,corre());
    }

    @Override
    public String corre() {
        return "corre";
    }
}
