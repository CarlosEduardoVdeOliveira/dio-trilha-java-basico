public class Conta {
  String name = "";
  int	conta =	1021;
  String agencia = "067-8";
  Double saldo = 237.48;

  void imprimirDadosConta(){
    System.out.println("Olá "+ name+", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+", conta " + conta + " e seu saldo "+ saldo +" já está disponível para saque");
  }

}