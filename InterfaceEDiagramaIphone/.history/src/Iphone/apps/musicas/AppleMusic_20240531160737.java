package iphone.apps.musicas;

public class AppleMusic implements ReprodutorDeMusicas {
  String musica = "Lonie day";
  @Override
  public void tocarMusica(String musica) {
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
