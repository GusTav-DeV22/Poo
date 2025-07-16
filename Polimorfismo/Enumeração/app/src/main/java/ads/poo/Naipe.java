package ads.poo;

public enum Naipe {

    OUROS("Ouros",1),
    ESPADAS("Espadas", 2),
    COPAS("Copas", 3),
    PAUS("Paus",4);
    public String nome;
    public int valor;

    Naipe(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
