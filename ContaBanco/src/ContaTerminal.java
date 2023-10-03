import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            
            System.out.println("Olá, digite o seu nome: ");
                String nomeCliente = scanner.next();
            
            System.out.println("Por favor, digite o número da Agência !");
                String agencia = scanner.next();
            
            System.out.println("Por favor, digite o número da conta: ");
                int numero = scanner.nextInt();

            Double saldo = 237.48;
            
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +" e seu saldo de " + saldo + " já está disponível para saque.");
        }
    }
}