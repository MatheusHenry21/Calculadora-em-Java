
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nBem-vindo a CALCULADORA\n");

        while (true){
            System.out.println("---MENU---");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão\n");

            System.out.print("Digite o índice da opção que deseja utilizar: ");
            int opcao = sc.nextInt();
        }
    }
}