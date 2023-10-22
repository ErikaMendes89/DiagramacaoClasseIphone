public class iPhone {

    private String modelo;
    private int capacidade;
    private double bateria;
    private boolean ligado;

    public iPhone (String modelo, int capacidade){
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.bateria = 100.0;
        this.ligado = false;
    }

    public void Ligar (){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public void tocarMusica(ReprodutorMusica reprodutor){
        if(ligado){
            System.out.println("Tocando música...");
            reprodutor.play();
        } else {
            System.out.println("O iPhone está desligado. Não é possível tocar música.");
        }
    }

    public void fazerChamada(AparelhoTelefonico telefone,String numero){
        if (ligado) {
            System.out.println("Fazendo chamada para " + numero + "...");
            telefone.ligar(numero);
        } else {
            System.out.println("O iPhone está desligado. Não é possível fazer chamadas.");
        }
    
    }

    public void navegarInternet(NavegadorInternet navegador, String url) {
        if  (ligado) {
            System.out.println("Navegando na Internet para a URL: " + url + "...");
            navegador.abrirURL(url);
        } else {
            System.out.println("O iPhone está desligado. Não é possível navegar na Internet.");
        }
    }


}
