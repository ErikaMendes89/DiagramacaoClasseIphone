public class ReprodutorDeMusicaImplementacao implements ReprodutorMusica {
    @Override
    public void play() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pause() {
        System.out.println("Pausando música.");
    }

    @Override
    public void proxima() {
        System.out.println("Próxima música.");
    }

    @Override
    public void anterior() {
        System.out.println("Música anterior.");
    } 
}
