import java.util.Scanner;

public class Main {
    static double SaldoUsuario = 800;
    public static void main(String[] args) {
        System.out.println("""
                -----------------------
                Gerenciador de financas
                -----------------------
                \n
                """);
        menu();


    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """);

        int decisao = sc.nextInt();
        sc.nextLine();

        switch (decisao){
            case 1:
                System.out.printf("Saldo do usuário: %.2f\n", SaldoUsuario);

                System.out.println("\n\nPressione qualquer tecla para voltar");
                sc.nextLine();
                menu();

            case 2:
                System.out.println("Digite o valor a receber:");
                SaldoUsuario += sc.nextDouble();
                sc.nextLine();
                System.out.printf("\nNovo saldo: %.2f", SaldoUsuario);
                System.out.println("\n\nPressione qualquer tecla para voltar");
                sc.nextLine();
                menu();

            case 3:
                System.out.println("Digite o valor que será transferido:");
                SaldoUsuario -= sc.nextDouble();
                sc.nextLine();
                System.out.printf("\nNovo saldo: %.2f", SaldoUsuario);
                System.out.println("\n\nPressione qualquer tecla para voltar");
                sc.nextLine();
                menu();

            case 4:
                System.out.println("Até mais....");
                System.exit(0);

            default:
                System.out.println("Opção inválida! Tente novamente.");
                menu();
        }

    }
}