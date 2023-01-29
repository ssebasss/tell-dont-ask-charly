public class Main {
    public static void main(String[] args) {

    Motor m = new Motor("1234566",1.6, "nafta");
    Auto autito= new Auto("XYZ123", "fiat", 134126, "verde", m);




        /*m.setCilindrada(2.3);
        System.out.println("");
        System.out.println(m);
        System.out.println(autito);*/



       // System.out.println(m.getRpmActuales());

        System.out.println("auto ESTACIONADO!");
        System.out.println(autito);
        //autito.getMotor().setRpmActuales(autito.getMotor().getRpmActuales() + 1000);
        autito.acelerar();

        System.out.println("");
        System.out.println("acelerar!!!!");
        System.out.println(autito);





























    }
}