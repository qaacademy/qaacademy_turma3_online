import javax.swing.JOptionPane;

public class Execucao {

    public static void main(String[] args) {
        // Exercicio1_medium exercicio1_medium = new Exercicio1_medium();
        // exercicio1_medium.exibeParOuImpar();

        // Exercicio 02
        String valorInvestimentoStg = JOptionPane.showInputDialog("Digite um valor de investimento: ");
        double valorInvestimento = Double.parseDouble(valorInvestimentoStg);

        Exercicio02_medium exercicio02_medium = new Exercicio02_medium();

        double valorJuros = exercicio02_medium.calculaInvestimentoJurosCompostos(valorInvestimento);
        double valorTotal = exercicio02_medium.calculaValorTotalInvestimento(valorInvestimento, valorJuros);

        System.out.println("O valor do investimento são: "
                + valorInvestimento);

        System.out.println("O valor do Juros são: " + valorJuros);

        System.out.println("O valor total do investimento: " + valorTotal);

    }

}
