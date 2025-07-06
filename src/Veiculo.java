 public class  Veiculo {
    protected String marca;
    protected String motor;
    protected float potencia;

    public Veiculo(String marca ,String motor, float potencia) {
        this.marca = marca;
        this.motor = motor;
        this.potencia = potencia;
    }

     public String getMarca() {
         return marca;
     }

     public void setMarca(String marca) {
         this.marca = marca;
     }

     public String getMotor() {
         return motor;
     }

     public void setMotor(String motor) {
         this.motor = motor;
     }

     public float getPotencia() {
         return potencia;
     }

     public void setPotencia(float potencia) {
         this.potencia = potencia;
     }
 }
