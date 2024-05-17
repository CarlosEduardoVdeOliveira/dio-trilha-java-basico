import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        Double saldo = 0.0;
        Double saque = 0.0; 
        while (true) { 
            int opcao = scanner.nextInt(); 
            switch(opcao){
                case 1:
                    System.out.print("Digite o valor do deposito: ");
                    saldo = scanner.nextDouble();
                case 2:

                case 3:
                case 0:
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
        }
    }
}