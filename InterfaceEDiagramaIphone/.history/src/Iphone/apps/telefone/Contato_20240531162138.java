package iphone.apps.telefone;

public class Contato implements Telefone {
  @Override
  public void atender() {
    System.out.println("ATENDENDO LIGAÇÃO...");
  }

    @Override
    public void desligar() {
      System.out.println("DESLIGANDO LIGAÇÃO...");
    }

}
