package ads.poo.pagamento;

public class Horista extends Funcionario {

   private double valorHora;
   private  final int HORAS_SEMANAIS = 40;
   private int horaExtra;
   private double totalSalario = salario;


    public void fazerHoraExtra(int horas) {
        this.horaExtra = horas;
        totalSalario = (this.salario+(this.horaExtra * this.valorHora));
    }

    public Horista(String nome, double salario) {
        super(nome, salario);
        this.valorHora = (this.salario / (HORAS_SEMANAIS *4));

    }
    public Horista(String nome, double salario, double valorHora) {
        super(nome, salario);
        this.valorHora = valorHora;
    }


    @Override
    public String folhaDePagamento() {
        return("""
                ******************************
                CLASSIFICAÇÃO:%s
                NOME: %s
                SALÁRIO BASE: R$ %.2f
                HORAS EXTRA: %dH
                VALOR POR HORA EXTRA: %.2f
                _____________________________
                SALÁRIO TOTAL: R$ %.2f
                ******************************
                """).formatted(toString(),nome, salario, horaExtra,valorHora,totalSalario);
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return super.toString();

    }
}
