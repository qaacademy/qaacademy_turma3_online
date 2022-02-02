package easy;
import javax.swing.JOptionPane;

public class Exercicio06_easy {// inicio classe

    public static void main(String[] args) {
        double nota1, nota2, resultado;
        String nota1Stg, nota2Stg;
        nota1Stg = JOptionPane.showInputDialog("Por favor, digite a primeira nota: ");
        nota2Stg = JOptionPane.showInputDialog("Por favor, digite a segunda nota: ");

        nota1 = Double.parseDouble(nota1Stg);
        nota2 = Double.parseDouble(nota2Stg);
        resultado = (nota1 + nota2) / 2;

        if (resultado > 5) { // incio
            System.out.println("Você está Aprovado! Parabéns!!!");
        } // fim se
        if (resultado < 5) {// inicio se
            System.out.println("Você está Reprovado!");
        } // fim se
        if (resultado == 5) { // inicio IF
            System.out.println("Você está de Exame");
        } // fim if
    }// fim metodo
}// fim classe
