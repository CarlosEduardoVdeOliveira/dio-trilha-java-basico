public class Contador {
    public static void main(String[] args) throws Exception {
        int n = -2;
        try {
            if(n < 0) throw new ParametrosInvalidosException("Numero pequeno.");
        } catch (ParametrosInvalidosException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
