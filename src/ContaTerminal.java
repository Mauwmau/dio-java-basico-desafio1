import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o número da Conta");
        int numeroDaConta = scanner.nextInt();
        
        System.out.println("Digite o número da Agência");
        String agencia = scanner.next();
        scanner.nextLine(); 
        // Pulando uma linha para evitar problemas com delimitador de linha
        // e fazer a leitura correta da proxima
        
        System.out.println("Digite o Nome do cliente");
        String nomeDoCliente = scanner.nextLine();
        
        System.out.println("Digite o Saldo da conta");
        double saldo = scanner.nextDouble();

        scanner.close();

        String mensagemFinal = "Olá " + nomeDoCliente + ", " +
        "obrigado por criar uma conta em nosso banco, " +
        "sua agência é "+ agencia + ", " +
        "sua conta é " + numeroDaConta +
        " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagemFinal);
    }
}
