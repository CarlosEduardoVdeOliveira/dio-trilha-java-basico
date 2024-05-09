import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua agencia: ");
        String agencia = scanner.nextLine();
        System.out.print("Digite o numero da conta: ");
        int numero = scanner.nextInt();
        System.out.print("Digite seu saldo: ");
        Double saldo = scanner.nextDouble();

        conta.nome = nome;
        conta.agencia = agencia;
        conta.numero = numero;
        conta.saldo = saldo;
        conta.imprimirDadosConta();

    }
}
