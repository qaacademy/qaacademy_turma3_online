package easy;

import javax.swing.JOptionPane;

public class Exercicio06_easy {// inicio classe

    public String verificaAprovacao(double nota1, double nota2) {
        double resultado;
        resultado = (nota1 + nota2) / 2;
        if (resultado > 5) { // incio
            return "Você está Aprovado! Parabéns!!!";
        } // fim se
        if (resultado < 5) {// inicio se
            return ("Você está Reprovado!");
        } // fim se
        if (resultado == 5) { // inicio IF
            return ("Você está de Exame");
        } // fim if
        return "Não foi possívl calcular sua nota";
    }// fim metodo
}// fim classe
