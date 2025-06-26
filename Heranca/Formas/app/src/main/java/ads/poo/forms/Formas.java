package ads.poo.forms;

public class Formas {

    private String corDaLinha;
    private String corDoPreenchimento;
    private int coordenadas;


    public String desenhar(){
        return corDaLinha + corDoPreenchimento + coordenadas;
    }

}
