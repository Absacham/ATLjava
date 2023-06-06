package clase_5;

import java.util.Scanner;

public class actividad_4 {

    public static void main (String[] args){
        Scanner datos = new Scanner(System.in);

        System.out.print("Ingrese el total de cuenta: ");
        double totalCuenta = datos.nextDouble();

        System.out.print("Ingrese el porcentaje de propina: ");
        double porcentajePropina = datos.nextDouble();

        double propina = totalCuenta * (porcentajePropina / 100);
        System.out.println("La propina es: " + propina);
    }

}
