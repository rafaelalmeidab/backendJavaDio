import java.util.Scanner;

public class ContaTerminal{
    public static void main (String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da sua conta: ");
        int conta = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Digite o numero da sua agencia: ");
        String agencia = sc2.nextLine();
        sc2 = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc2.nextLine();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Digite o seu saldo: ");
        double saldo = sc3.nextDouble();

        sc.close();
        sc2.close();
        sc3.close();
        
        System.out.println();

        System.out.printf("Olá " + nome + ", obrigado por criar uma conta em nosso banco,");
        System.out.printf("sua agência e " + agencia + ", conta " + conta + " e seu saldo " + saldo);
        System.out.printf(" já está disponível para saque.");
    }
}