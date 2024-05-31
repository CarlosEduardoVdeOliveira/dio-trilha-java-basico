package iphone.apps.musicas;

public class AppleMusic implements ReprodutorDeMusicas {
  String minhaMusica = "Lonely day - SOAD";
  @Override
  public void tocarMusica(String musica) {
      musica = minhaMusica;
      System.out.println("TOCANDO MUSICA COM O APPLEMUSIC"+ musica);
  }

  @Override
  public void pausarMusica() {
      System.out.println("MUSICA PAUSADA...");
  }

  @Override
  public void selecionarMusica(String musica) {
      System.out.println("TOCAR MUSICA: "+ musica);
  }

}
