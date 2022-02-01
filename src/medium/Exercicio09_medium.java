package medium;

import javax.swing.JOptionPane;

public class Exercicio09_medium {
    public static void main(String[] args) {

        String[] alunosVetor = new String[5];
        int[] numeroAlunosVetor = new int[5];
        int i = 0;

        while (i < 5) {
            alunosVetor[i] = JOptionPane.showInputDialog("Digite o nome do Aluno");
            numeroAlunosVetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do Aluno"));
            i++;
        } // fim primeiro enquanto
        i = 0;

        while (i < 5) {
            System.out.println("Nome do Aluno: " + alunosVetor[i] + " - " + "Numero do aluno:" + numeroAlunosVetor[i]);
            i++;
        }

    }// fim main

}// fim Classe