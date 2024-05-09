public class Conta {
  String nome = "";
  int	numero =	1021;
  String agencia = "067-8";
  Double saldo = 237.48;

  void imprimirDadosConta(){
    System.out.println("Olá "+ nome+", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+", conta " + numero + " e seu saldo "+ saldo +" já está disponível para saque");
  }

}