package iphone;

import iphone.apps.internet.Internet;
import iphone.apps.musicas.ReprodutorDeMusicas;
import iphone.apps.telefone.Telefone;

public class Iphone implements Telefone, ReprodutorDeMusicas, Internet {
  @Override
  public void tocarMusica(String musica) {
      throw new UnsupportedOperationException("Not supported yet.");
  }

}
