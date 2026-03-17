import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] array = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            array[i] = i;
        }

        int M = sc.nextInt();

        for (int a = 0; a < M; a++) {

            int i = sc.nextInt();
            int j = sc.nextInt();

            int dlatl;

            dlatl = array[i];

            array[i] = array[j];
            array[j] = dlatl;
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(array[i] + " ");
        }
    }
}