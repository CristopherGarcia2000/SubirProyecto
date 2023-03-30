package utilidades;

public class Calculadora {



    public static int factorialDelN(int num){
        final int INITIAL_VALUE = 1;
        int resultado = INITIAL_VALUE;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int mediaHastaN(int num){
        final int INITIAL_VALUE = 0;
        int total = INITIAL_VALUE;
        int media = INITIAL_VALUE;
        if(num < INITIAL_VALUE){
            System.out.println("Introduzca un valor positivo");
        }else{
            for (int i = 0; i <= num ; i++) {
                total += i;
                media = total/num;
            }
        }
        return media;
    }

    public static void obtenerPasosFibonacci(int num){
        int fibonacci = num;
        final int INITIAL_VALUE = 1;
        int num1 = INITIAL_VALUE;
        int num2 = INITIAL_VALUE;
        int suma = INITIAL_VALUE;
        if(num < 0){
            System.out.println("Introduzca un valor positivo.");
            return;
        }else{
            String cadenaFibonacci = "\"0,";

            for (int i = 0; i < fibonacci; i++) {
                if(i == 0){
                cadenaFibonacci += String.valueOf(suma);
                }

                cadenaFibonacci += ","+String.valueOf(suma);
                suma = num1+num2;
                num1 = num2;
                num2 = suma;
            }
            cadenaFibonacci += "\"";
            System.out.println(cadenaFibonacci);
        }
    }


}
