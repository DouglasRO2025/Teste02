public class Carro extends Veiculo {
    private int portaMalas;

    public Carro(String marca, String motor,float potencia, int portaMalas) {
        super(marca, motor, potencia);
        this.portaMalas = portaMalas;

    }

    public void setPortaMalas(int portaMalas) {
        this.portaMalas = portaMalas;
    }

    public int getPortaMalas() {
        return portaMalas;
    }

    public String imprimir() {
        return "Marca: " + getMarca() + ", Motor: " + getMotor() +
                " Porta-malas: " + getPortaMalas() + " litros: " + getPotencia() + " potencia ";
    }
}
