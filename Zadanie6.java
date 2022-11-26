import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = scanner.nextDouble();
        System.out.println("Enter y: ");
        double y = scanner.nextDouble();

        if (x > y) {
            double temp = x;
            x = y;
            y = temp;

        }

        System.out.println("Numerical range: " + "[ " + x + ", " + y + " ]\n");

        double min = x;
        double max = y;
        double z1 = (ThreadLocalRandom.current().nextDouble(min, max));
        double z2 = (ThreadLocalRandom.current().nextDouble(min, max));
        double z3 = (ThreadLocalRandom.current().nextDouble(min, max));

        System.out.println("Random generated values: \n" + z1 + "\n" + z2 + "\n" + z3);

        double[] array = {z1, z2, z3};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }


        }
        System.out.println("\nSorted values: " + Arrays.toString(array));

        scanner.close();


    }
}

