package ads.poo.pagamento;

public class Comissionado extends Funcionario implements Vendas{

    protected double valorVendido;
    protected double percentualComissao;
    protected double valorComissao;


    public Comissionado(String nome, double percentualComissao) {
        super(nome);
        this.percentualComissao = percentualComissao;
    }

    @Override
    public void vender(double valor) {
        this.valorVendido = this.valorVendido + valor;
        this.valorComissao = valorVendido * percentualComissao/100;

    }

    @Override
    public String folhaDePagamento() {
        return ("""
                ******************************
                CLASSIFICAÇÃO:%s
                NOME: %s
                TOTAL VENDIDO: R$ %.2f
                PERCENTUAL COMISSÃO: %.1f%%
                _____________________________
                SALÁRIO TOTAL: R$ %.2f
                ******************************
                """).formatted(toString(),nome,valorVendido,percentualComissao,valorComissao);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double getValorVendido() {
        return valorVendido;
    }
}
