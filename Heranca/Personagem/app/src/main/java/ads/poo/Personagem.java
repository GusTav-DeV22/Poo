package ads.poo;

public class Personagem {

    private int vida;
    private int ataque;
    private double velocidade;

    public Personagem(int vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public String atacar(){
        String nomeClasse = this.getClass().getSimpleName();
        return nomeClasse +" atacando com %d de dano" .formatted(ataque);
    }
    public String mover(){
        String nomeClasse = this.getClass().getSimpleName();
        return nomeClasse +" movendo com velocida %.1f " .formatted(velocidade);
    }
}
