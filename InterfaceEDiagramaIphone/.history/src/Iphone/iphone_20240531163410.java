package iphone;

import iphone.apps.internet.Internet;
import iphone.apps.musicas.ReprodutorDeMusicas;
import iphone.apps.telefone.Telefone;

public class Iphone implements Telefone, ReprodutorDeMusicas, Internet {

    @Override
    public void atender() {
      System.out.println("ATENDENDO LIGAÇÃO...");
    }

    @Override
    public void desligar() {
      System.out.println("DESLIGANDO LIGAÇÃO...");
    }

    @Override
    public void ligar(String numero) {
      System.out.println("LIGANDO PARA"+numero+"...");
    }

  @Override
  public void tocarMusica(String musica) {
    System.out.println("OUVINDO "+musica+"...");
  }

    @Override
    public void pausarMusica() {
      System.out.println("MUSICA PAUSADA...");
    }

    @Override
    public void selecionarMusica(String musica) {
      System.out.println("SELECIONAR "+musica);
    }

    @Override
    public void exibirPagina() {
      System.out.println("");
    }

    @Override
    public void abrirNovaPagina() {
      System.out.println("");
    }

    @Override
    public void atualizarPagina() {
      System.out.println("");
    }

}
