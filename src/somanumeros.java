import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Soma = 0;
        int numero;
        System.out.print("digite o numero positivo : ");
        numero=input.nextInt();
        while (numero>=0) {
            soma += numero;
            System.out.print("digite outro numero positivo: ");
            numero = input.nextInt();
        }
        System.out.println("A soma dos numeros foi : " + soma);




        }
    }