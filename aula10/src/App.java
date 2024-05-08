public class App {
    public static void main(String[] args) throws Exception {
        Relogio g1 = new Relogio();
        g1.setHora(11);
        g1.setMinuto(15);
        g1.setSegundo(30);

        System.out.println(g1.getHora()+":"+g1.getMinuto()+":"+g1.getSegundo());

        Relogio g2 = new Relogio(11);
        g2.setHora(11);

        System.out.println(g2.getHora()+":"+g2.getMinuto()+":"+g2.getSegundo());

        Relogio g3 = new Relogio(11,15);

        System.out.println(g3.getHora()+":"+g3.getMinuto()+":"+g3.getSegundo());

        Relogio g4 = new Relogio(11,15,30);
        System.out.println(g4.getHora()+":"+g4.getMinuto()+":"+g4.getSegundo());

        Relogio g5  = new Relogio ();
        System.out.println(g5.getHora()+":"+g5.getMinuto()+":"+g5.getSegundo());




    }
}
