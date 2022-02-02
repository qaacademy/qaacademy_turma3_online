package easy;
import javax.swing.JOptionPane;

public class Exercicio10_2_easy {

    public static void main(String[] args) {
        double valorJuros = 0.0, taxaJuros = 0.05, valorInvestimento, valorTotal, ano = 1;
        valorInvestimento = 1000.00;

        while (ano <= 10) {
            valorJuros = valorJuros + (valorInvestimento * taxaJuros);
            ano = ano + 1;
        }

        valorTotal = valorJuros + valorInvestimento;

        System.out.println("Valor Investido: R$ " + valorInvestimento);
        System.out.println("Valor Juros: R$ " + valorJuros);
        System.out.println("Valor Total com Juros: R$ " + valorTotal);
    }

}
