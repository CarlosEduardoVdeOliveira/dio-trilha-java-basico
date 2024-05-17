import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        double limiteDiario = scanner.nextDouble();
        double saque = 0;
        for (int i = 0; i <= limiteDiario; i++) {
          saque = scanner.nextDouble();
          if (saque == 0) {
            System.out.println("Transacoes encerradas.");
            break;
          }
        }

        scanner.close(); 
    }
}