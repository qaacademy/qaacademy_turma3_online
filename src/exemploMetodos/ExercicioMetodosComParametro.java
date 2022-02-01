package exemploMetodos;

public class ExercicioMetodosComParametro {

    public static void main(String[] args) {
        // Com retorno
        System.out.println(exibirNomeEIdade(33, "Flavio")); 
        System.out.println(retornarPalavra("Teste")); 
        System.out.println(retornarDobro(10));
        System.out.println(retornarNomeSobrenome("Flavio", "Dias"));
        System.out.println(retornarSalario("Flavio"));
        
        //Sem Retorno
        exibirNomeEIdadeSemRetorno(33, "Flavio");
        retornarPalavraSemRetorno("Teste");
        retornarDobroSemRetorno(10);
        retornarNomeSobrenomeSemRetorno("Flavio", "Dias");
        retornarSalarioSemRetorno("Flavio");


    }

    public static String exibirNomeEIdade(int idade, String nome){
        return "Nome: "+nome +" - Idade: "+ idade;
    }
    public static String retornarPalavra(String palavra){
        return palavra;
    }

    public static int retornarDobro(int numero){
        return numero * 2;
    }

    public static String retornarNomeSobrenome(String nome, String sobreNome){
        return nome + " "+ sobreNome;
    }

    public static double retornarSalario(String nome){
        return 2000.00;
    }


    // mais 5 sem retorno
    public static void exibirNomeEIdadeSemRetorno(int idade, String nome){
        System.out.println( "Nome: "+nome +" - Idade: "+ idade);
    }
    public static void retornarPalavraSemRetorno(String palavra){
        System.out.println(palavra);
    }

    public static void retornarDobroSemRetorno(int numero){
        System.out.println(numero * 2);
    }

    public static void retornarNomeSobrenomeSemRetorno(String nome, String sobreNome){
        System.out.println(nome + " "+ sobreNome);
    }

    public static void retornarSalarioSemRetorno(String nome){
        System.out.println(2000.00);
    }
    
}
