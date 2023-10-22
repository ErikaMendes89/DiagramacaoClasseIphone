public class NavegadorInternetImplementacao implements NavegadorInternet {
    @Override
    public void abrirURL(String url) {
        System.out.println("Abrindo a URL: " + url);
    }

    @Override
    public void voltar() {
        System.out.println("Voltando para a página anterior.");
    }

}
