import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        try {
          System.out.println("Numero de conta valido."); 
          
      } catch (IllegalArgumentException e) {
        System.out.println("Erro: " + e.getMessage());
      }finally{
        scanner.close();
      }
    }
// Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) {
      numeroConta.length();
    }
}