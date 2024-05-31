package iphone.apps.internet;

public class Safari implements Internet {
  
  @Override
  public void exibirPagina() {
    System.out.println("EXIBINDO PAGINA WEB COM O SAFARI...");
  }

  @Override
  public void abrirNovaPagina() {
    System.out.println("ABRINDO NOVA PAGINA WEB COM O SAFARI...");

  }

  @Override
  public void atualizarPagina() {
    System.out.println("ATUALIZANDO PAGINA WEB NO SAFARI...");
  } 
}
