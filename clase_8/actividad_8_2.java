package clase_8;

import java.util.Scanner;

public class actividad_8_2 {
    public static void main(String[] args) {
        //Hacer una función que calcule el área de un triángulo. Al llamarla debe devolver el área del triángulo.

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingese la altura del triangulo: ");
        float altura = teclado.nextFloat();
        System.out.println("Ingese la base del triangulo: ");
        float base = teclado.nextFloat();
        System.out.println("El area del cuadrado es: " + areaTriangulo(base, altura));

    }

    private static float areaTriangulo (float base, float altura) {
        return (base * altura)/2;
    }
}
