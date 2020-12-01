package ui;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserInterfaceTest {

    @Test
    void verifyInputMismatchExceptionIsThrown() {

        UserInterface ui = new UserInterface();
        String input = "bad input";

        // Här fejkar vi användarinput genom att ändra inputstream från konsolen till variabeln input ovam
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertThrows(InputMismatchException.class, () -> {
            ui.enterInteger();
        });

    }


}
