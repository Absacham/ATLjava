package clase_6;

import java.util.Scanner;

public class actividad_6_2 {
    public static void main (String[] args){
        System.out.print("Ingrese el tweet(una sola palabra): ");
        Scanner data = new Scanner(System.in);
        String tweet = data.nextLine();

        System.out.println("https://twitter.com/search?q=" + tweet);
    }
}
