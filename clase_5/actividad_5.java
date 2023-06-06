package clase_5;

import java.util.Scanner;

public class actividad_5 {
    public static void main (String[] args){

        System.out.print("Ingrese un numero del 1 al 100: ");
        Scanner datos = new Scanner(System.in);
        double numero = datos.nextDouble();

        double numeroRandom = Math.round(Math.random() * 100);

        if( numero == numeroRandom ){
            System.out.println("Felicidades!!! acertaste " + numeroRandom);
        }else {
            System.out.println("El numero es: " + numeroRandom);
        }

    }
}
