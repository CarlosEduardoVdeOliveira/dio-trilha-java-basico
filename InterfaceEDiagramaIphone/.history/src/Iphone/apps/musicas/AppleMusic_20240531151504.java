package iphone.apps.musicas;

public class AppleMusic implements ReprodutorDeMusicas {

  @Override
  public void tocarMusica(String musica) {
      System.out.println("TOCANDO MUSICA COM O APPLEMUSIC"+ musica);
  }

  @Override
  public void pausarMusica() {
      System.out.println("TOCANDO MUSICA COM O APPLEMUSIC");
  }

  @Override
  public void selecionarMusica() {
      System.out.println("TOCANDO MUSICA COM O APPLEMUSIC");
  }

}
