import java.util.Scanner;
public class Valida {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero inteiro:");
        int numero = scan.nextInt();


        if (numero >0){
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo");
        }

        }
    }
