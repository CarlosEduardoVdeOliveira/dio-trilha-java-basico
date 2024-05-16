
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o inicio do forloop");
        int initForLoop = scanner.nextInt();
        System.out.println("Digite o fim do forloop");
        int endForLoop = scanner.nextInt();
        try {
            if(n < 0) throw new ParametrosInvalidosException();
        } catch (ParametrosInvalidosException e) {
            // TODO: handle exception
            System.out.println("Numero pequeno.");
        }
    }
}
