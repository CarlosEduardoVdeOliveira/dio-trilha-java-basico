
import iphone.Iphone;
import iphone.apps.internet.Internet;
import iphone.apps.internet.Safari;
import iphone.apps.musicas.ReprodutorDeMusicas;
import iphone.apps.telefone.Telefone;

public class Iphone15 {
  public static void main(String[] args) {
    String musica = "Lonely day - SOAD";
    String numero = "33999635953";

    Iphone iphone15 = new Iphone();
    Internet internet = iphone15;
    ReprodutorDeMusicas reproduzirMusicas = iphone15;
    Telefone telefone = iphone15;

    Safari safari = new Safari();

    safari.abrirNovaPagina();
    

    iphone15.ligar(numero);
    iphone15.tocarMusica(musica);
    iphone15.abrirNovaPagina();
    reproduzirMusicas.tocarMusica(musica);
  }
}
