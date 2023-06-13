package clase_8;

import java.util.Scanner;

public class actividad_8_1 {
    public static void main(String[] args) {
        //Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del cuadrado.
        System.out.println("Ingese el tamaño del lado: ");
        Scanner teclado = new Scanner(System.in);
        int lado = teclado.nextInt();
        System.out.println("El area del cuadrado es: " + areaCuadrado(lado));
    }

    private static int areaCuadrado (int lado) {
        return lado*lado;
    }
}
