import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int numero1 = scan.nextInt();
        System.out.println("Informe um numero:");
        int numero2 = scan.nextInt();

        int soma = numero1+numero2;

        System.out.println("Soma = "+soma);
        }
    }
