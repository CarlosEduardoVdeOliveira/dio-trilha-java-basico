import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        double saldo = 0;
        double deposito = 0;
        double saque = 0;
        while (continuar) { 
            int opcao = scanner.nextInt(); 
            switch(opcao){
                case 1:
                    deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: "+saldo);
                    break;
                case 2:
                    saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    }else{
                        saldo -= saque;
                        System.out.println("Saldo atual: "+saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: "+ saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
        }
    }
}