public class AparelhoTelefonicoImplementacao implements AparelhoTelefonico {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void desligar() {
        System.out.println("Chamada encerrada.");
    }

    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero);
    }
}
