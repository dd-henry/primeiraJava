import java.io.Console;
import java.util.Scanner;

public class Main {
    double SaldoUsuario = 800;
    public static void main(String[] args) {


    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        String input = "";

        System.out.printf("""
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """);

        int decisao = sc.nextInt();

        switch (decisao){
            case 1:
                System.out.println("""
                        Saldo: %.2f
                        
                        
                        Pressione qualquer tecla para voltar . . .
                        """, SaldoUsuario);
                input = sc.nextLine();
                menu();

            case 2:
                System.out.println("Digite o valor a receber:");
                SaldoUsuario += sc.nextDouble();
                System.out.println("Novo saldo: %.f", SaldoUsuario);
                input = sc.nextLine();
                menu();
        }

    }
}