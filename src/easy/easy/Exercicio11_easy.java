package easy;
import javax.swing.JOptionPane;

public class Exercicio11_easy {

    public int somaDois(int numeroDigitado) {
        
        int i = 1;
        
        while (i <= 100) {
            numeroDigitado = numeroDigitado + 2;
            i++;
        }
        return numeroDigitado;
    }

}
