package vehiculos.ciclomotores;

import vehiculos.Vehiculo;

public class Ciclomotor extends Vehiculo {

    private boolean habilitadoAutopista;

    public Ciclomotor(String marca, double peso, int potencia, int numPuertas, int velocidad, boolean habilitadoAutopista) {
        super(marca, peso, potencia, numPuertas, velocidad);
        this.habilitadoAutopista = habilitadoAutopista;
    }

    @Override
    public void acelerar() {
        this.velocidad = this.velocidad +7;
    }

    @Override
    public String toString() {
        String msg;
        msg = "-------------------------------------------------------------------------------------------------\n" +
                "* Tipo de vehículo: Ciclomotor.\n" +
                "* Marca: "+ this.marca+"\n" +
                "* Peso: "+ this.peso+"Kg"+"\n" +
                "* Potencia: "+ this.potencia+"kW"+"\n" +
                "* Número de puertas: "+this.numPuertas +"\n";
        if(habilitadoAutopista){
            msg += "* Puede ir por autopista: Si";
        }else {
            msg += "* Puede ir por autopista: No"+"\n";
        }
        msg = msg + "* Velocidad actual: "+this.velocidad+"Km/h"+ "\n" +
                "-------------------------------------------------------------------------------------------------";
        return msg;
    }
}
