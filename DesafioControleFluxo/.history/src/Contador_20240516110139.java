
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o inicio do forloop");
        int initForLoop = scanner.nextInt();
        System.out.println("Digite o fim do forloop");
        int endForLoop = scanner.nextInt();
        try {
            if(initForLoop > endForLoop) throw new ParametrosInvalidosException();
        } catch (ParametrosInvalidosException e) {
            System.out.println("Numero pequeno.");
        }
    }
    static void contar(int init, int end) throws ParametrosInvalidosException{

    }
}
