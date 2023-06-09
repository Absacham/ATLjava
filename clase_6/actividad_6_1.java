package clase_6;

import java.util.Scanner;

public class actividad_6_1 {
    public static void main (String[] args){
        System.out.print("Ingrese el pais a buscar: ");
        Scanner data = new Scanner(System.in);
        String contry = data.nextLine();

        System.out.println("https://www.google.com/maps/search/" + contry);
    }
}
