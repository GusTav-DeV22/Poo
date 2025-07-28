package ads.poo;

public enum CategoriaLuta {
    INVALIDO("Inválido"),
    LEVE("Leve"),
    MEDIO("Medio"),
    PESADO("Pesado"),;

    private String nome;

     CategoriaLuta(String no){
        this.nome = no;
    }

    @Override
    public String toString() {
        return  this.nome;
    }
}
