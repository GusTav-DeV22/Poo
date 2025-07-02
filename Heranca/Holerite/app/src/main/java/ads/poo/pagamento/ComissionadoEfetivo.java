package ads.poo.pagamento;

public class ComissionadoEfetivo extends Comissionado{

    private double salarioTotal;
    public ComissionadoEfetivo(String nome, double salario, double percentualComissao) {
        super(nome, percentualComissao);
        this.salario = salario;

    }

    @Override
    public void vender(double valor) {
        super.vender(valor);

    }


    @Override
    public String folhaDePagamento() {
        this.salarioTotal = salario + valorComissao;
        return ("""
                ******************************
                CLASSIFICAÇÃO:%s
                NOME: %s
                TOTAL VENDIDO: R$ %.2f
                PERCENTUAL COMISSÃO: %.1f%%
                VALOR COMISSAO: R$ %.2f
                SALARIO: R$ %.2f
                _____________________________
                SALÁRIO TOTAL: R$ %.2f
                ******************************
                """).formatted(toString(),nome,valorVendido,percentualComissao,valorComissao,salario,salarioTotal);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
