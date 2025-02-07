import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 237.48;
        System.out.print("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();
        System.out.print("Por favor, digite o número da Ágencia: ");
        String agencia = scanner.next();
        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
   

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+" , conta "+numero+ " e seu saldo "+saldo+" já está disponível para saque.");


        scanner.close();

    }
}
