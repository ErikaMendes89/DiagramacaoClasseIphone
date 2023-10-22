public class App{

    public static void main(String[] args) throws Exception {
     iPhone iphone = new iPhone("iPhone 7", 64);

    iphone.Ligar();
    
    iphone.tocarMusica(new ReprodutorDeMusicaImplementacao());
    iphone.fazerChamada(new AparelhoTelefonicoImplementacao(), "123-456-7890");
    iphone.navegarInternet(new NavegadorInternetImplementacao(), "https://www.google.com");

    }
}
