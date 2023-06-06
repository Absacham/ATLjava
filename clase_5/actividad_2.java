package clase_5;

import java.util.Scanner;

public class actividad_2 {
       public static void main (String[] args){
            System.out.print("Ingrese la distancia en millas: ");
            Scanner datos = new Scanner(System.in);
            double millas = datos.nextDouble();

            double kilometros = millas * 1.60934;
            System.out.println("La distancia en kilometros es: " + kilometros + "Km");
       }

}
