package vehiculos;

public class Vehiculo {

    protected String marca;
    protected double peso;
    protected int potencia;
    protected int numPuertas;
    protected int velocidad;

    public Vehiculo(String marca, double peso, int potencia, int numPuertas, int velocidad) {
        this.marca = marca;
        this.peso = peso;
        this.potencia = potencia;
        this.numPuertas = numPuertas;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    protected void acelerar(){
        this.velocidad = this.velocidad+10;
    }
}
