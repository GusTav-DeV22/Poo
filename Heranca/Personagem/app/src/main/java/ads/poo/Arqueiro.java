package ads.poo;

public class Arqueiro extends Personagem implements Guerreiro {


    public Arqueiro() {
        super(35,2,1);
    }

    @Override
    public String atacar() {
        return "Arqueiro atacando com %d de dano".formatted(getAtaque());
    }

    @Override
    public String mover() {
        return "Arqueiro movendo com velocidade "+getVelocidade();
    }
}
