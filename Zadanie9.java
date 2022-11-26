import javax.swing.*;

public class Zadanie9 {
    public static void main(String[] args) {


        String currency = JOptionPane.showInputDialog(null, "Enter currency: PLN or JPY ");
        String amount = JOptionPane.showInputDialog(null, "Enter amount of money: ");
        double doubleAmount = Integer.parseInt(amount);

        switch (currency) {

            case "PLN":
                changeToJPY(doubleAmount);
                break;


            case "JPY":
                changeToPLN(doubleAmount);
                break;


            default:
                JOptionPane.showMessageDialog(null,"You provided invalid currency!");
        }

    }

    public static void changeToPLN(double x) {
        double resultInPLN = x * 30.969466;
        JOptionPane.showMessageDialog(null, "You wiil get: " + resultInPLN + " PLN");
    }

    public static void changeToJPY(double x) {
        double resultInJPY = x * 0.32288264;
        JOptionPane.showMessageDialog(null, "You wiil get: " + resultInJPY + " ¥");

    }


}

