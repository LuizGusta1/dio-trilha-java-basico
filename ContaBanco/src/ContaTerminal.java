import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome_cliente = input.nextLine();

        System.out.println("Digite o numero da conta: ");
        int numero_conta = input.nextInt();

        System.out.println("Digite o numero da Agência: ");
        String numero_agencia = input.next();

        System.out.println("Digite o valor do seu Saldo: ");
        double saldo = input.nextDouble();

        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numero_agencia + ", conta " + numero_conta + " e seu saldo " + saldo + " já está disponivel para saque.");
   
        input.close();
    }
}
