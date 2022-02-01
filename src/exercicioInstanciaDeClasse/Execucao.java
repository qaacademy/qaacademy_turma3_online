package exercicioInstanciaDeClasse;

public class Execucao {
    public static void main(String[] args) {
        Cachorro objCachorro = new Cachorro(); // instanciando. Criando na Memoria 

        System.out.println(objCachorro.nome); // Exibindo o valor das variaveis da classe Cachorro
        System.out.println(objCachorro.idade); // Exibindo o valor das variaveis da classe Cachorro
        objCachorro.latir();// executando os metodos da  classe Cachorro
        objCachorro.pular();// executando os metodos da  classe Cachorro
        objCachorro.deitar();// executando os metodos da  classe Cachorro
        objCachorro.latir();
        objCachorro.deitar();
    }

}
