package clase_7;

import java.util.Scanner;

public class actividad_7_1 {
    public static void main(String[] args) {
        Scanner boardKey = new Scanner(System.in);
        int[] arreglo = new int[5];


        //Ingreso de los numeros por teclado
        System.out.println("Ingrese 5 numeros");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = boardKey.nextInt();
        }

        //Mostrar los numeros del arreglo por pantalla
        System.out.print("Los elementos del arreglo son:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+" ");
        }

        //Mostrar el mayor y el menor menor del arreglo
        System.out.println("");
        int mayor = 0;
        int menor = 100;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]>=mayor){
                mayor = arreglo[i];
            }
            if (arreglo[i]<=menor ){
                menor = arreglo[i];
            }
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

        //Promedio de los numeros dentro del arreglo
        float sumatoria = 0;
        float promedio = 0;
        for (int i = 0; i < arreglo.length; i++) {
            sumatoria += arreglo[i];
        }
        promedio = sumatoria / arreglo.length;
        System.out.println("La sumatoria es: " + sumatoria);
        System.out.println("El promedio es: " + promedio);
    }
}
