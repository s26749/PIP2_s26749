import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("currency exchange!\nenter your currency:\n1. PLN\n2. JPY");
        int action = scanner.nextInt();
        System.out.println("\nenter the amount of money you want to exchange: ");
        double amount = scanner.nextDouble();


        switch (action) {
            case 1:
                System.out.println("\nyou will get: " + (amount * 30.969466) + " ¥");
                break;
            case 2:
                System.out.println("\nyou will get: " + (amount * 0.32288264) + " PLN");
                break;
        }

        scanner.close();

    }
}

