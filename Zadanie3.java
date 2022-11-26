import javax.swing.*;

public class Zadanie3 {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(null, "Input Your name: ");
        String surname = JOptionPane.showInputDialog(null, "Input Your surname: ");

        String properName = "Jan";
        String properSurname = "Kowalski";
        String properPassword = "qwerty";

        if (name.equals(properName) && surname.equals(properSurname)) {
            String password = JOptionPane.showInputDialog(null, "Provide Password: ");


        }
    }
}
