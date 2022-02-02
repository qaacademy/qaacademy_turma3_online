package easy;
import javax.swing.JOptionPane;

public class Exercicio09_easy {

    public static void main(String[] args) {
        int numeroDigitado, i = 1, resultado;
        String numeroDigitadoStg = "10";
        numeroDigitado = Integer.parseInt(numeroDigitadoStg);
        while (i <= 10) {
            resultado = numeroDigitado * i;
            System.out.println(numeroDigitado + " X " + i + " = " + resultado);
           i++; // soma do i +1 pra entrar em loop infinito
        }

        System.out.println("Fim do Algoritmo");
    }

}// fim da classe
