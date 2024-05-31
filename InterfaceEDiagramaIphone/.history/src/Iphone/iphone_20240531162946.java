package iphone;

import iphone.apps.internet.Internet;
import iphone.apps.musicas.ReprodutorDeMusicas;
import iphone.apps.telefone.Telefone;

public class Iphone implements Telefone, ReprodutorDeMusicas, Internet {

    @Override
    public void atender() {
      System.out.println("ATENDENDO IPHONE...");
    }

    @Override
    public void desligar() {
      System.out.println("DESLIGANDO IPHONE...");
    }

    @Override
    public void ligar(String numero) {
      System.out.println("LIGANDO PARA"+numero+"...");
    }

  @Override
  public void tocarMusica(String musica) {
    System.out.println("ATENDENDO TELEFONE...");
  }

    @Override
    public void pausarMusica() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void selecionarMusica(String musica) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void exibirPagina() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void abrirNovaPagina() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void atualizarPagina() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
