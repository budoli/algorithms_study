import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] sentHw = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int a = sc.nextInt();
            sentHw[a] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!sentHw[i]) {
                System.out.println(i);
            }
        }
    }
}