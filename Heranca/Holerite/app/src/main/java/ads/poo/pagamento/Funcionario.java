package ads.poo.pagamento;

public abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }
    public Funcionario(String nome, double salario) {
        this(nome);
        this.salario = salario;
    }

    public abstract String folhaDePagamento();


    @Override
    public String toString() {
        String nomeclass = getClass().getSimpleName();
        return nomeclass;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
