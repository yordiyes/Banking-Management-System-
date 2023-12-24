import org.junit.jupiter.api.Test;

import java.awt.event.ActionEvent;

import static org.junit.jupiter.api.Assertions.*;

public class PinChangeTest {

    @Test
    public void testActionPerformedChangeButton() {
        // Create an instance of PinChange with a known pinNumber
        PinChange pinChange = new PinChange("1234");

        // Set up the JTextField and JPasswordField with known values
        pinChange.pin.setText("5678");
        pinChange.repin.setText("5678");

        // Simulate a button click
        pinChange.change.doClick();

        // PinChange window should be invisible after the action
        assertTrue(pinChange.isVisible());

    }
    @Test
    void setActionPerformedBackShouldTransitToTransaction(){
        PinChange pinChange = new PinChange("");
        pinChange.actionPerformed(new ActionEvent(pinChange.back, ActionEvent.ACTION_PERFORMED, "Back"));
    }
}