import org.junit.jupiter.api.Test;
import java.awt.event.ActionEvent;
import static org.junit.jupiter.api.Assertions.*;
public class LoginTest {
    @Test
    public void testValidLogin() {
        // Create an instance of the Login class
        Login login = new Login();
        login.cardTextField.setText("validCardNumber");
        login.pinTextField.setText("validPinNumber");

        // Simulate a button click on the login button
        login.actionPerformed(new ActionEvent(login.login, ActionEvent.ACTION_PERFORMED, "login"));
        assertTrue(login.isVisible());

    }
    @Test
    public void testInvalidLogin() {
        // Create an instance of the Login class
        Login login = new Login();
        login.cardTextField.setText("invalidCardNumber");
        login.pinTextField.setText("invalidPinNumber");

        // Simulate a button click on the login button
        login.actionPerformed(new ActionEvent(login.login, ActionEvent.ACTION_PERFORMED, "login"));

        // Assert that the Login frame remains visible after an unsuccessful login
        assertTrue(login.isVisible());
}
    @Test
    public void testClearButton() {
        // Create an instance of the Login class
        Login login = new Login();

        login.cardTextField.setText("12344567890123456");
        login.pinTextField.setText("1234");

        // Simulate a button click on the clear button
        login.actionPerformed(new ActionEvent(login.clear, ActionEvent.ACTION_PERFORMED, "login"));
    }
    @Test
    public void testSignupButton() {
        // Create an instance of the Login class
        Login login = new Login();
        login.actionPerformed(new ActionEvent(login.login, ActionEvent.ACTION_PERFORMED, "login"));

    }
}