package ads.poo;

public class Aldeao extends Personagem implements Guerreiro, Coletador  {


    public Aldeao() {
        super(25,1,0.8);
    }

    @Override
    public String mover() {
        return "Aldeao se movendo em velocidade "+ getVelocidade();
    }

    @Override
    public String coletarMadeira() {
        return "Aldeao coletando madeira";
    }

    @Override
    public String coletarOuro() {
        return "Aldeao coletando ouro";
    }

    @Override
    public String atacar() {
        return "Aldeao atacando com "+getAtaque()+" de Dano ";
    }
}