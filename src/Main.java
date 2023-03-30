import vehiculos.camiones.Camion;
import vehiculos.ciclomotores.Ciclomotor;

import java.util.Scanner;

import static utilidades.Calculadora.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        Camion camion1 = new Camion("Chevrolet",800,50,2,45,100);
        Ciclomotor ciclomotor1 = new Ciclomotor("Audi",300,35,2,25,false);

        System.out.println("Introduce un número: ");
        numero = teclado.nextInt();
        System.out.println("-----------------");
        System.out.println(factorialDelN(numero));
        System.out.println("-----------------");
        System.out.println(mediaHastaN(numero));
        System.out.println("-----------------");
        obtenerPasosFibonacci(numero);
        System.out.println("-----------------");
        camion1.acelerar();
        ciclomotor1.acelerar();
        System.out.println(camion1);
        System.out.println("-----------------");
        System.out.println(ciclomotor1);



    }
}