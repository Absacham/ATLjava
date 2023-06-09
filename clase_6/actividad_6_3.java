package clase_6;

import java.util.Scanner;

public class actividad_6_3 {
    public static void main (String[] args){
        System.out.print("Ingrese el numero de telefono(sin espacios): ");
        Scanner data = new Scanner(System.in);
        String telf = data.nextLine();

        System.out.println("https://api.whatsapp.com/send?phone=" + telf);
    }
}
