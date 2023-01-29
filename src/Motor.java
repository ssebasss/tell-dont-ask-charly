public class Motor {
    private String numero;
    private double cilindrada;
    private String tipo;
    private int rpmActuales = 0;

    public Motor(String numero, double cilindrada, String tipo) {
        this.numero = numero;
        this.cilindrada = cilindrada;
        this.tipo = tipo;
        this.rpmActuales=0;
    }

    /*public void setCilindrada(double cilindrada) {
        if (cilindrada>0){
            this.cilindrada = cilindrada;
        }
    }*/

    /*public int getRpmActuales() {
        return rpmActuales;
    }

    public void setRpmActuales(int rpmActuales) {
        this.rpmActuales = rpmActuales;
    }*/

    public void acelerar(){
        this.rpmActuales+=1000;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "numero='" + numero + '\'' +
                ", cilindrada=" + cilindrada +
                ", tipo='" + tipo + '\'' +
                ", rpmActuales=" + rpmActuales +
                '}';
    }
}

