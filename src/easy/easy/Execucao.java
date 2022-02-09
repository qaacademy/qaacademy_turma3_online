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

        // String numeroDigitadoUsuario = JOptionPane.showInputDialog("Digite um
        // numero");
        // int numeroDigitado = Integer.parseInt(numeroDigitadoUsuario);
        // Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
        // System.out.println("O dobro de "+ numeroDigitado +" = "
        // +exercicio04_easy.calcularDobro(numeroDigitado));

        // String primeiroDigitadoStg = JOptionPane.showInputDialog("Digite o primeiro
        // número");
        // String segundoDigitadoStg = JOptionPane.showInputDialog("Digite o segundo
        // número");
        // String terceiroDigitadoStg = JOptionPane.showInputDialog("Digite o terceiro
        // número");

        // int primeiroNumero = Integer.parseInt(primeiroDigitadoStg);
        // int segundoNumero = Integer.parseInt(segundoDigitadoStg);
        // int terceiroNumero = Integer.parseInt(terceiroDigitadoStg);

        // Exercicio05_easy exercicio05_easy = new Exercicio05_easy();
        // System.out.println("A Soma dos numeros digitados será:
        // "+exercicio05_easy.soma(primeiroNumero, segundoNumero, terceiroNumero));
        // System.out.println("A Subtração dos numeros digitados será:
        // "+exercicio05_easy.subtracao(primeiroNumero, segundoNumero, terceiroNumero));
        // System.out.println("A Multiplicação dos numeros digitados será:
        // "+exercicio05_easy.multiplicacao(primeiroNumero, segundoNumero,
        // terceiroNumero));
        // int soma = exercicio05_easy.soma(primeiroNumero, segundoNumero,
        // terceiroNumero);
        // System.out.println("A Média dos numeros digitados será:
        // "+exercicio05_easy.media(soma));

        // String nota1Stg, nota2Stg;
        // nota1Stg = JOptionPane.showInputDialog("Por favor, digite a primeira nota:
        // ");
        // nota2Stg = JOptionPane.showInputDialog("Por favor, digite a segunda nota: ");

        // double nota1 = Double.parseDouble(nota1Stg);
        // double nota2 = Double.parseDouble(nota2Stg);

        // Exercicio06_easy exercicio06_easy = new Exercicio06_easy();
        // System.out.println(exercicio06_easy.verificaAprovacao(nota1, nota2));

        // String salarioStg = JOptionPane.showInputDialog("Por favor, digite um valor
        // de salario: "); // Leitura da digitação
        // double salario = Double.parseDouble(salarioStg);// Conversão e atribuição na
        // variavel salario
        // Exercicio07_easy exercicio07_easy = new Exercicio07_easy();
        // System.out.println("O valor do inss para um salario de : "+ salario +"Será de
        // : "+ exercicio07_easy.calculaInss(salario));

        // String salarioStg = JOptionPane.showInputDialog("Por favor, digite um valor de salario: ");
        // double salario = Double.parseDouble(salarioStg);

        // Exercicio08_easy exercicio08_easy = new Exercicio08_easy();
        // System.out.println("O Imposto de renda será: " + exercicio08_easy.calculaImpostoDeRenda(salario));
        // double impostoDeRenda = exercicio08_easy.calculaImpostoDeRenda(salario);
        // System.out.println("O Salario líquido será: " + exercicio08_easy.calculaSalarioLiquido(salario, impostoDeRenda));

        // String numeroDigitadoStg =  JOptionPane.showInputDialog("Por favor, digite um numero inteiro para calcula a tabuada: ");
        // int numeroDigitado = Integer.parseInt(numeroDigitadoStg);
        // Exercicio09_easy exercicio09_easy = new Exercicio09_easy();
        // exercicio09_easy.calculaTabuada(numeroDigitado);


        // double valorTotal,valorInvestimento, valorJuros ; 
        // valorInvestimento =  Double.parseDouble(JOptionPane.showInputDialog("Por favor, digite um valor de investimento"));
        // Exercicio10_2_easy exercicio10_2_easy = new Exercicio10_2_easy();
        // valorJuros = exercicio10_2_easy.calcularValorJuros(valorInvestimento);
        // valorTotal =  valorJuros + valorInvestimento;

        // System.out.println("Valor Investido: R$ " + valorInvestimento);
        // System.out.println("Valor Juros: R$ " +  valorJuros);
        // System.out.println("Valor Total com Juros: R$ " + valorTotal);


        String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um número inteiro");
        int numeroDigitado = Integer.parseInt(numeroDigitadoStg);

        Exercicio11_easy exercicio11_easy = new Exercicio11_easy();
        System.out.println(exercicio11_easy.somaDois(numeroDigitado)); 

    }

}
