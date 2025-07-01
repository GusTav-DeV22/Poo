package ads.poo;

public class Baleia extends Animal implements Aquatico{

    public Baleia(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String habilidade() {
        return  "%s esquicha e %s ".formatted(nome,nadar());
    }

    @Override
    public String nadar() {
        return "nada";
    }
}
