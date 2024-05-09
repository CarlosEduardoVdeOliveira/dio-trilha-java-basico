public class Conta {
  String nome = "";
  int	numero =	0;
  String agencia = "";
  Double saldo = 0.0;

  void imprimirDadosConta(){
    System.out.println("Olá "+ nome+", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+", conta " + numero + " e seu saldo de R$"+ saldo +" já está disponível para saque");
  }

}