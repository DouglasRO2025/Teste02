public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String marca, String motor, int cilindradas, float potencia) {
        super(marca, motor, potencia);
        this.marca = marca;
        this.motor = motor;
        this.cilindradas = cilindradas;
    }


    public int getCilindradas() {
        return cilindradas;
    }

    public String imprimir() {
        return "Marca: " + getMarca() + ", Motor: " + getMotor() +
                " de " + getCilindradas() + " cilindradas.";
    }
}
