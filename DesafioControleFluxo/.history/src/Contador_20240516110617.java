
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o inicio do forloop");
        int initForLoop = scanner.nextInt();
        System.out.println("Digite o fim do forloop");
        int endForLoop = scanner.nextInt();
        try {
            contar(initForLoop, endForLoop);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }
    static void contar(int initForLoop, int endForLoop) throws ParametrosInvalidosException{
        if(initForLoop > endForLoop) throw new ParametrosInvalidosException();

    }
}
