import java.util.Scanner;

public class ComandosBasicos {
    // static == const
    static Scanner sc = new Scanner(System.in); // pronpt -recebe a mensagem
    public static void main(String[] args) {
        // Variaveis de tipos primitivos
        boolean trueOrFalse = true;
        int numerosReias = 0; // 100000000 a -10000000
        double decimais = 0.2; // 100.2000 a -1000.400
        char letra = 'A';


        // varievais tipo Objeto

        String texto = "texto";
        Integer numerosReais = 2; // Inteiro do tipo Objeto
        Double decimaisReais = 0.2; // Decimal do tipo Objeto

        String nome = null; // nulo == " "
        String sexo = "";


        System.out.println("Qual é o seu nome?"); // Escreva no terminal - para o usuário
        nome = sc.nextLine(); // Leia - Escreva na variavel nome

        System.out.println("O seu nome é " + nome);
    }
}
