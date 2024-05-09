import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String nome = scanner.nextLine();
        String agencia = scanner.nextLine();
        int numero = scanner.nextInt();
        Double saldo = scanner.nextDouble();

        conta.nome = nome;
        conta.agencia = agencia;
        conta.numero = numero;
        conta.saldo = saldo;
        conta.imprimirDadosConta();

    }
}
