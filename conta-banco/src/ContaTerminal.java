import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
        System.out.println("Por favor, digite o número da conta !");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o numero da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente !");
        String   nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo da conta !");
        double saldo = scanner.nextDouble();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + conta + " e seu saldo "+saldo+" já esta disponivel para saque.");
    }
}
