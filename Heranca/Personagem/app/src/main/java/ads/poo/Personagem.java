package ads.poo;

public abstract class Personagem {

    private int vida;
    private int ataque;
    private double velocidade;

    public Personagem() {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public Personagem(int vida, int ataque, double velocidade) {
        this();
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public abstract String mover();

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}







