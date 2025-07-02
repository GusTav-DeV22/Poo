package ads.poo.pagamento;

public class MensalFixo extends Funcionario{

    public MensalFixo(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String folhaDePagamento() {
        return ("""
                ******************************
                CLASSIFICAÇÃO:%s
                NOME: %s
                SALÁRIO: R$ %.2f
                ******************************
                """).formatted(toString(),nome, salario);

    }



    @Override
    public String toString() {
        return super.toString();
    }

}
