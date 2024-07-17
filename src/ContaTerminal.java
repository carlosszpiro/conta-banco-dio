import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da conta ::");
    int conta = scanner.nextInt();

    System.out.println("Por favor, digite o número da agência ::");
    String agencia = scanner.next();

    System.out.println("Por favor, digite o nome do cliente ::");
    String nomeCliente = scanner.next();

    System.out.println("Por favor, digite o saldo do cliente ::");
    double saldoCliente = scanner.nextDouble();

    System.out.println(
      "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
      agencia + ", conta " + conta + " e seu saldo " + saldoCliente + " já está disponível para saque!"
    );
  }
}
