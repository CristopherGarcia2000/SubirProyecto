package vehiculos.camiones;

import vehiculos.Vehiculo;

public class Camion extends Vehiculo {

    private double capacidadCarga;
    public Camion(String marca, double peso, int potencia, int numPuertas, int velocidad,double capacidadCarga) {
        super(marca, peso, potencia, numPuertas, velocidad);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void acelerar() {
        this.velocidad = this.velocidad+5;
    }

    @Override
    public String toString() {
        return  "-------------------------------------------------------------------------------------------------\n" +
                "* Tipo de vehículo: Camión.\n" +
                "* Marca: "+ this.marca+"\n" +
                "* Peso: "+ this.peso+"Kg"+"\n" +
                "* Potencia: "+ this.potencia+"kW"+"\n" +
                "* Número de puertas: "+this.numPuertas +"\n"+
                "* Capacidad de carga: "+this.capacidadCarga+"Kg"+"\n" +
                "* Velocidad actual: "+this.velocidad+"km/h"+ "\n" +
                "-------------------------------------------------------------------------------------------------";
    }
}
