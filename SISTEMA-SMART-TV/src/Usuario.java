public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarCanal();

        System.out.println(smartTv.volume);
        System.out.println(smartTv.canal);
    }
}
