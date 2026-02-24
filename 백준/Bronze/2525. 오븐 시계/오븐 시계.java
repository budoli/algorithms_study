import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int min = sc.nextInt();
        int tm = sc.nextInt();

        int totalMin = min +tm;

        int sm = totalMin / 60;
        int um = totalMin % 60;

        int hour = (h + sm) % 24;

        System.out.println(hour + " " + um);
    }
}