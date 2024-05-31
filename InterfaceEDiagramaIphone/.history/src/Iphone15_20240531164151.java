
import iphone.Iphone;
import iphone.apps.internet.Internet;

public class Iphone15 {
  public static void main(String[] args) {
    String musica = "Lonely day - SOAD";
    String numero = "33999635953";

    Iphone iphone15 = new Iphone();
    Internet safari = new Internet();

    safari.abrirNovaPagina();
    

    iphone15.ligar(numero);
    iphone15.tocarMusica(musica);
    iphone15.abrirNovaPagina();
  }
}
