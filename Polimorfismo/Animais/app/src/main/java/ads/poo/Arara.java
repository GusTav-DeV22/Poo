package ads.poo;

public class Arara extends Animal implements Voador{


    public Arara(String nome) {
        super(nome);
    }

    @Override
    public String habilidade() {
        return "%s fala e %s ".formatted(nome,voar());
    }


    @Override
    public String voar() {
        return "voa";

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
