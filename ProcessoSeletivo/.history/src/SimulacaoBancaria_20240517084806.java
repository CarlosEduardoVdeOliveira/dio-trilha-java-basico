import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0;
        double saque = 0;
        while (true) { 
            int opcao = scanner.nextInt(); 
            switch(opcao){
                case 1:
                    System.out.print("Digite o valor do deposito: ");
                    saldo = scanner.nextDouble();
                    break;
                case 2:
                    System.out.print("Digite o valor do deposito: ");
                    saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    }else{
                        saldo = saldo - saque;
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: %.1f"+ saldo);
                    break;
                case 0:
                    false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
        }
    }
}