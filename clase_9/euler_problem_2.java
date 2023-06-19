package clase_9;

public class euler_problem_2 {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int sumEven = 0;

        while (a <= 4000000) {
            if (a % 2 == 0) {
                sumEven += a;
            }

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println(sumEven);

    }
}
