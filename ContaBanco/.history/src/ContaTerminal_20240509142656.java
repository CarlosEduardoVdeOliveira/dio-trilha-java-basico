import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String nome = scanner.nextLine();
        String agencia = scanner.nextLine();
        int conta = scanner.nextInt();
        String saldo = scanner.nextLine();


    }
}
