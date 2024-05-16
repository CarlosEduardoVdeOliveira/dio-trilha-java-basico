public class Contador {
    public static void main(String[] args) throws Exception {
        int n = 0;
        try {
            if(n < 0) throw new ParametrosInvalidosException();
        } catch (ParametrosInvalidosException e) {
            // TODO: handle exception
            System.out.println("Numero pequeno.");
        }
    }
}
