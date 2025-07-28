package ads.poo;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private CategoriaLuta categoria;
    private double altura;
    private double peso;
    private int idade;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        setCategoria();

    }


    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    };
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    };
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    };
    public void status(){};

    @Override
    public String toString() {
        return "Lutador\n" +
                "Nome:" + nome + '\'' +
                "\nNacionalidade" + nacionalidade + '\'' +
                "\nIdade" + idade +
                "\n Altura=" + altura +
                "\nPeso=" + peso +
                "\nCategoria=" + categoria +
                "\nVitorias=" + vitorias +
                "\nDerrotas=" + derrotas +
                "\nEmpates=" + empates
                ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public CategoriaLuta getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(getPeso()<52.5){
            this.categoria = CategoriaLuta.INVALIDO;
        } else if (getPeso()<72.5) {
            this.categoria = CategoriaLuta.LEVE;
        }else if (getPeso()<92.5) {
            this.categoria = CategoriaLuta.MEDIO;
        }else if (getPeso()<120.5) {
            this.categoria = CategoriaLuta.PESADO;
        }else categoria = CategoriaLuta.INVALIDO;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
