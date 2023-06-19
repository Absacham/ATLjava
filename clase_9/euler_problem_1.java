package clase_9;

public class euler_problem_1 {
    public static void main(String[] args) {
        //suma de los multiplos de 3 o 5 menores a 1000
        int suma = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;

            }
        }
        System.out.println(suma);
    }
}
