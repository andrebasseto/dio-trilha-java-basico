public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual ? " + smartTv.canal);
        System.out.println("Volume atual ? " + smartTv.volume
        );

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual -> Volume ? " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual -> Volume ? " + smartTv.volume);

        System.out.println("Canal atual " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Canal atual " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal atual " + smartTv.canal);
    }
}
