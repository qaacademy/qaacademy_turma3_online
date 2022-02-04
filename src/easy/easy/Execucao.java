package easy;

import javax.swing.JOptionPane;

public class Execucao {

    public static void main(String[] args) {
        // Exercicio02_easy exercicio02_easy = new Exercicio02_easy();
        // String palavra = exercicio02_easy.retornaPalavra("Flavio Dias");
        // System.out.println(palavra);

        // String primeiroValor = JOptionPane.showInputDialog("Digite o primeiro
        // valor");
        // String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor");
        // Exercicio03_easy exercicio03_easy = new Exercicio03_easy();// Instanciando a
        // classe Exercicio03_easy
        // String valorTrocado = exercicio03_easy.retornaValorTrocado(primeiroValor,
        // segundoValor);
        // System.out.println(valorTrocado); //Faço a chamada e valor

        // String numeroDigitadoUsuario = JOptionPane.showInputDialog("Digite um numero");
        // int numeroDigitado = Integer.parseInt(numeroDigitadoUsuario);
        // Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
        // System.out.println("O dobro de "+ numeroDigitado +" = " +exercicio04_easy.calcularDobro(numeroDigitado));


        String primeiroDigitadoStg = JOptionPane.showInputDialog("Digite o primeiro número");
        String segundoDigitadoStg = JOptionPane.showInputDialog("Digite o segundo número");
        String terceiroDigitadoStg = JOptionPane.showInputDialog("Digite o terceiro número");

        int primeiroNumero = Integer.parseInt(primeiroDigitadoStg);
        int segundoNumero = Integer.parseInt(segundoDigitadoStg);
        int terceiroNumero = Integer.parseInt(terceiroDigitadoStg);

        Exercicio05_easy exercicio05_easy = new Exercicio05_easy();
        System.out.println("A Soma dos numeros digitados será: "+exercicio05_easy.soma(primeiroNumero, segundoNumero, terceiroNumero));
        System.out.println("A Subtração dos numeros digitados será: "+exercicio05_easy.subtracao(primeiroNumero, segundoNumero, terceiroNumero));
        System.out.println("A Multiplicação dos numeros digitados será: "+exercicio05_easy.multiplicacao(primeiroNumero, segundoNumero, terceiroNumero));
        int soma = exercicio05_easy.soma(primeiroNumero, segundoNumero, terceiroNumero);
        System.out.println("A Média dos numeros digitados será: "+exercicio05_easy.media(soma));

    
    
    }

}
