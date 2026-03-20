import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int x = sc.nextInt();

            array[x % 42] = 1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count ++;
            }
        }
        System.out.println(count);
    }
}