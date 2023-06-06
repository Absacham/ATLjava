package clase_5;

import java.util.Scanner;

public class actividad_1 {
    public static void main (String[] args){
        System.out.print("Ingrese la edad de tu perro: ");
        Scanner datos = new Scanner(System.in);
        Integer edadPerro = datos.nextInt();

        Integer edadHumano = edadPerro * 7;
        System.out.println("La edad de tu perro en edad humano es: " + edadHumano);
    }
}
