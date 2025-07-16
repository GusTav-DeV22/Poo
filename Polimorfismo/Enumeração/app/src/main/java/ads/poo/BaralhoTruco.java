package ads.poo;

import java.util.List;

public class BaralhoTruco extends Baralho {


    public BaralhoTruco() {
        super();
        this.cartas.removeIf(carta ->
                carta.getValor() == Valor.OITO ||
                        carta.getValor() == Valor.NOVE ||
                        carta.getValor() == Valor.DEZ);


        Valor.J.setValor(10);
        Valor.Q.setValor(11);
        Valor.K.setValor(12);
        Valor.AS.setValor(13);
        Valor.DOIS.setValor(14);
        Valor.TRES.setValor(15);
    }

    public Carta puxarCarta() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);
        } else {
            return null;
        }
    }
    @Override
    public void embaralhar() {
        super.embaralhar();
    }




    @Override
    public List<Carta> getCartas() {
        return super.getCartas();
    }
}
