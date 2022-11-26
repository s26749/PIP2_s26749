import java.util.Scanner;


public class Zadanie4 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();
        System.out.println("Enter: ADD / SUB / DIV / MUL");
        switch (scanner.next()) {
            case "ADD":
                System.out.println(add(x, y));
                break;
            case "SUB":
                System.out.println(sub(x, y));
                break;
            case "DIV":
                System.out.println(div(x, y));
                break;
            case "MUL":
                System.out.println(mul(x, y));
        }

        scanner.close();
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
        double result = (double) a / (double) b;
        return result;
    }

    private static int mul(int a, int b) {
        int result = a * b;
        return result;
    }
}


