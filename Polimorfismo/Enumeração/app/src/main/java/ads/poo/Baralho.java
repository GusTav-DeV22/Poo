package ads.poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {


    protected   List<Carta> cartas;

    public List<Carta> getCartas() {
        return cartas;
    }


    public Baralho() {

            this.cartas = new ArrayList<>();
            for (Naipe n : Naipe.values()) {
                for (Valor v : Valor.values()) {
                    this.cartas.add(new Carta(n, v));
                }
            }

    }



    public void embaralhar(){
        Collections.shuffle(this.cartas);
    }
}
