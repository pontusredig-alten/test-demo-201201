import ui.UserInterface;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        boolean waitingForCorrectInput = true;

        while (waitingForCorrectInput) {
            UserInterface ui = new UserInterface();
            try {
                ui.enterInteger();
                waitingForCorrectInput = false;
            } catch (InputMismatchException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
