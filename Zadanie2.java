import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Zadanie2 {
    public static void main(String[] args) {

        int x;
        int y;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x: ");
        x = scanner.nextInt();
        int min = 1;
        int max = 6;
        y = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println(y);

        if (x == y) {
            System.out.println("Lucky One!");
        } else System.out.println("YOU DIED");

    }
}
