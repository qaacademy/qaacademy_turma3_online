package medium;

public class Exercicio10_medium {

    public static void main(String[] args) {

        int elemento = 20;
        int[] fibonacci;// forma
        fibonacci = new int[elemento]; // é um objeto
        int i = 2;
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        while (i < elemento) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }// fim while
        i = 0;
        while (i < elemento) {
            System.out.println("Termo: "+(i+1)+" - Valor: " +fibonacci[i]);
            i++;
        }
    }
}// fim classe


