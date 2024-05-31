package iphone.apps.telefone;

public class Contato implements Telefone {
  @Override
  public void atender() {
    System.out.println("ATENDENDO LIGAÇÃO.");
  }

    @Override
    public void desligar() {
      System.out.println("DESLIGANDO LIGAÇÃO.");
    }

    @Override
    public void ligar(String numero) {
      System.out.println("LIGANDO PARA "+numero);
    }
    

}
