package ads.poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Batalha {

    private Jogadores jogador1;
    private Jogadores jogador2;

    public Batalha(Jogadores jogador1, Jogadores jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;

    }
    public void jogador1Venceu(int pontos, int pontos2){
        jogador1.venceu(pontos);
        jogador2.perdeu(pontos2);

    }

    @Override
    public String toString() {
        return "Batalha entre " +
                "jogador " + jogador1 +
                ", jogador " + jogador2 ;
    }
}
