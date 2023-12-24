//importing all the necessary libraries
import org.junit.Test;

import java.awt.event.ActionEvent;
//create signup three class
public class SignUpThreeTest {
//creating an expressive method for submit button
    @Test
    public void testActionPerformedSubmitShouldTransferToDeposit() {
        SignUpThree signUpThree = new SignUpThree("");
        // Select an account type
        signUpThree.radioButton1.setSelected(true);
        // Select a service
        signUpThree.checkBox1.setSelected(true);
        signUpThree.checkBox6.setSelected(true);
        signUpThree.actionPerformed(new ActionEvent(signUpThree.submit, ActionEvent.ACTION_PERFORMED, "Submit"));

    }
    //creating an expressive method for the button cancel
    @Test
    public void testActionPerformedShouldNavigateToLogin() {
        SignUpThree signUpThree = new SignUpThree("");
        signUpThree.actionPerformed(new ActionEvent(signUpThree.cancel, ActionEvent.ACTION_PERFORMED, "cancel"));
    }

}

