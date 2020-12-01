package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {


    public void enterInteger() {
        {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Ange en siffra: ");
                Integer input = scanner.nextInt();
                System.out.println(input);
            } catch (InputMismatchException ex) {
                throw new InputMismatchException("Det där är inte en siffra!");
            }
        }
    }

}
