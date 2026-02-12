
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nBem-vindo a CALCULADORA");

        while (true){
            System.out.println("\n---MENU---");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair\n");

            System.out.print("Digite o índice da opção que deseja utilizar: ");
            int opcao = sc.nextInt();

            if (opcao==5){
                System.out.println("Saindo... até logo!");
                break;
            }

            int[] opcoes = {1,2,3,4};
            boolean opcaoValida = false;

            for (int op: opcoes){
                if (op == opcao){
                    opcaoValida = true;
                    break;
                }
            }

            if (!opcaoValida){
                System.out.println("\nOpção inexistente, tente novamente...");
            }
            else {
                double[] valores = Entrada.ler_numero();
                Operacoes op = new Operacoes();

                switch (opcao){
                    case 1:
                        System.out.println("\n" + valores[0] + " + " + valores[1] + " = " + op.somar(valores[0], valores[1]));
                        break;
                    case 2:
                        System.out.println("\n" + valores[0] + " - " + valores[1] + " = " + op.subtrair(valores[0], valores[1]));
                        break;
                    case 3:
                        System.out.println("\n" + valores[0] + " x " + valores[1] + " = " + op.multiplicar(valores[0], valores[1]));
                        break;
                    case 4:
                        System.out.println("\n" + valores[0] + " / " + valores[1] + " = " + op.dividir(valores[0], valores[1]));
                        break;
            }
            }
        }
    }
}

class Entrada{
    public static double[] ler_numero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        return new double[]{num1, num2};
    }
}

class Operacoes{
    public double somar(double a, double b){
        return a + b;
    }

    public double subtrair(double a, double b){
        return a - b;
    }

    public double multiplicar(double a, double b){
        return a * b;
    }

    public double dividir(double a, double b){
        if (b==0){
            System.out.println("Erro, impossivel a divisão por 0.");
            return 0;
        }
        return a / b;
    }
}