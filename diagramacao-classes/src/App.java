public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        ReprodutorMusical reprodutorMusical = iphone;
        AparelhoTelefonico aparelhoTelefonico = iphone;
        NavegadorInternet navegadorInternet = iphone;

        aparelhoTelefonico.ligar();
        reprodutorMusical.tocarMusica();
        navegadorInternet.atualizarPagina();
        iphone.atender();

    }
}
