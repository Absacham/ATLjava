package clase_5;

import java.util.Scanner;

public class actividad_3 {
    public static void main (String[] args){
        Scanner datos = new Scanner(System.in);

        System.out.print("Ingrese el precio original del producto: ");
        double precioOriginal = datos.nextDouble();

        System.out.print("Ingrese el descuento del producto: ");
        Integer descuento = datos.nextInt();

        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
        System.out.println("El precio final del producto es: " + precioFinal);
    }
}
