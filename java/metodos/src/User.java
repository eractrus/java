public class User {
    public static void main(String[] args) throws Exception {
        // propsta, tipo de retorno, parâmetros, visibilidade

        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.onTv());
        System.out.println(smartTv.startTv());
        System.out.println(smartTv.getChannel() + " Channel");
        System.out.println(smartTv.offTv());
        System.out.println(smartTv.startTv());
        
    }
}
