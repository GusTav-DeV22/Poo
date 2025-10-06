package ads.poo;

import java.util.Objects;

public class Jogadores {

    private String nome;
    private String apelido;
    private String pokemon;
    private String frase;
    private int vitorias;
    private int derrotas;
    private int pontos;


    public Jogadores(String nome, String apelido, String pokemon, String frase) {
        this.nome = nome;
        this.apelido = apelido;
        this.pokemon = pokemon;
        this.frase = frase;
    }



    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void venceu(int pontos) {
        this.vitorias++;
        this.pontos =+ pontos;

    }

    public void perdeu(int pontos) {
        this.derrotas++;
        this.pontos =+ pontos;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getPokemon() {
        return pokemon;
    }

    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jogadores jogadores = (Jogadores) o;
        return Objects.equals(apelido, jogadores.apelido) && Objects.equals(pokemon, jogadores.pokemon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apelido, pokemon);
    }

    @Override
    public String toString() {
        return "Jogadore " +
                "nome:'" + nome + '\'' +
                ", apelido:'" + apelido + '\'' +
                ", pokemon:'" + pokemon + '\'' +
                ", frase:'" + frase + '\'' +
                ", vitorias:" + vitorias +
                ", derrotas:" + derrotas +
                ", pontos:" + pontos
                ;
    }
}
