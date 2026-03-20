import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] array = new int[N];

        int max = array[0];
        int sum = 0;

        for (int i = 0; i< array.length; i++) {
            array[i] = sc.nextInt();

            if (max <= array[i]) {
                max = array[i];
            }
            sum += array[i];

        }

        double avg = (double)sum * 100 / max / N;

        System.out.println(avg);
    }
}