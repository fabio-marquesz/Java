import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double num1, num2;
        int tipoCalculo;


        System.out.println("Bem vindo ao programa Calculadora!");
        System.out.println("Digite o primeiro valor: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        num2 = sc.nextDouble();
        System.out.println("Digite o tipo de calculo: ");
        System.out.println("1- Adição");
        System.out.println("2- Subtracao");
        System.out.println("3- Multiplicacao");
        System.out.println("4- Divisao");
        tipoCalculo = sc.nextInt();

        if ( tipoCalculo == 1 ){
            System.out.println("A soma é " + num1 + " + " + num2 + " = " + (num1 + num2));
        } else if ( tipoCalculo == 2 ) {
            System.out.println("A subtração é " + num1 + " - " + num2 + " = " + (num1 - num2));
         } else if ( tipoCalculo == 3 ) {
            System.out.println("A multplicação é " + num1 + " * " + num2 + " = " + (num1 * num2));
        } else if ( tipoCalculo == 4 ) {
            System.out.println("A divisão é " + num1 + " / " + num2 + " = " + (num1 / num2));
        }
    }
}
