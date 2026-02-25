import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();


        int sumNtoAB = 0;
        int total = 0;
        for (int i = 1; i <= N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            sumNtoAB = a * b;

            total += sumNtoAB;
        }

        if (X == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}