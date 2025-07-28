package ads.poo;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rouds;
    private boolean aprovada;





    public void lutar(Lutador v1, Lutador v2){
        Random  roudVencido = new Random();
        int winOrLose = roudVencido.nextInt(3);
        switch (winOrLose){
            case 1:
                System.out.println("Vitória do "+v1.getNome());
                v1.ganharLuta();
                v2.perderLuta();
                break;
            case 2:
                System.out.println("Vitoria do "+v2.getNome());
                v2.ganharLuta();
                v1.perderLuta();
                break;
            case 0:
                System.out.println("Empate");
                v1.empatarLuta();
                v2.empatarLuta();
        }


    }
    public void lutar(){
    Lutador v1 = this.getDesafiado();
    Lutador v2 = this.getDesafiante();

        Random  roudVencido = new Random();
        int winOrLose = roudVencido.nextInt(3);
        switch (winOrLose){
            case 1:
                System.out.println("Vitória do "+v1.getNome());
                v1.ganharLuta();
                v2.perderLuta();
                break;
            case 2:
                System.out.println("Vitoria do "+v2.getNome());
                v2.ganharLuta();
                v1.perderLuta();
                break;
            case 0:
                System.out.println("Empate");
                v1.empatarLuta();
                v2.empatarLuta();
        }
    }




    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRouds() {
        return rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
