package ads.poo;

public class Cavaleiro extends Personagem implements Guerreiro {


    public Cavaleiro() {
        super(50,3,2);
    }

    @Override
    public String atacar() {
        return "Guerreiro atacando com %d de dano".formatted(getAtaque());
    }

    @Override
    public String mover() {
        return "Cavaleiro movendo com velocidade "+getVelocidade();
    }
}
