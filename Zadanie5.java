import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        int xAbsolute = absoluteValue(x);
        System.out.println("Enter y: ");
        int y = scanner.nextInt();
        int yAbsolute = absoluteValue(y);

        System.out.println("Enter: ADD / SUB / DIV / MUL");


        switch (scanner.next()) {

            case "ADD":
                System.out.println(add(xAbsolute, yAbsolute));
                break;
            case "SUB":
                System.out.println(sub(xAbsolute, yAbsolute));
                break;
            case "DIV":
                System.out.println(div(xAbsolute, yAbsolute));
                break;
            case "MUL":
                System.out.println(mul(xAbsolute, yAbsolute));
                break;

        }

        scanner.close();


    }

    private static int absoluteValue(int a) {
        return Math.abs(a);

    }

    private static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    private static int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    private static double div(int a, int b) {
        double result = (double) a / b;
        return result;
    }

    private static int mul(int a, int b) {
        int result = a * b;
        return result;
    }
}

