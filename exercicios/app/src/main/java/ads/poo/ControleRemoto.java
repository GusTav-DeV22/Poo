package ads.poo;

public class ControleRemoto implements Controlador {

    private boolean ligado;
    private int volume;
    private boolean tocando;

    public ControleRemoto() {
        this.ligado = false;
        this.volume = 10;
        this.tocando = false;
    }

    @Override
    public void ligar() {
    this.setLigado(true);
    }

    @Override
    public void desligar() {
    this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("---Menu---\n"+"Volume: "+this.getVolume());
    }

    @Override
    public void fecharMenu() {
        System.out.println("FECHANDO MENU ....");
    }

    @Override
    public void maisVolume() {
    this.setVolume(getVolume() + 2);
    }

    @Override
    public void menosVolume() {
        this.setVolume(getVolume() - 2);

    }

    @Override
    public void ligarMudo() {
        this.setVolume(0);

    }

    @Override
    public void desligarMudo() {
    this.setVolume(10);
    }

    @Override
    public void play() {
    if (this.isLigado() && !(this.isTocando())) {
        this.setTocando(true);
    }
    }

    @Override
    public void pause() {
    if (this.isLigado() && this.isTocando()) {
        this.setTocando(false);
    }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}
