package easy;
import javax.swing.JOptionPane;

public class Exercicio05_easy {// inicio classe

    public static void main(String[] args) {
        int primeiroNumero, segundoNumero, terceiroNumero, soma, subtracao, multiplicacao,media;
        String primeiroDigitadoStg = JOptionPane.showInputDialog("Digite o primeiro número");
        String segundoDigitadoStg = JOptionPane.showInputDialog("Digite o segundo número");
        String terceiroDigitadoStg = JOptionPane.showInputDialog("Digite o terceiro número");

        primeiroNumero = Integer.parseInt(primeiroDigitadoStg);
        segundoNumero = Integer.parseInt(segundoDigitadoStg);
        terceiroNumero = Integer.parseInt(terceiroDigitadoStg);
        soma = primeiroNumero+ segundoNumero+ terceiroNumero; 
        subtracao = primeiroNumero- segundoNumero- terceiroNumero;
        multiplicacao = primeiroNumero* segundoNumero* terceiroNumero;
        media = soma/3;

        System.out.println("A soma dos três números digitados é: " + soma);
        System.out.println("A subtração dos três números digitados é: " +subtracao);
        System.out.println("A multiplicação dos três números digitados é: " +multiplicacao);
        System.out.println("A média dos três números digitados é: " +media);
        JOptionPane.showMessageDialog(null, "A média dos três números digitados é: " +media);
    }
}// fim classe