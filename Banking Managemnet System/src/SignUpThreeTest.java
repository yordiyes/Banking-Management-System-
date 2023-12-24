import org.junit.Test;

import java.awt.event.ActionEvent;

public class SignUpThreeTest {

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
    @Test
    public void testActionPerformedShouldNavigateToLogin() {
        SignUpThree signUpThree = new SignUpThree("");
        signUpThree.actionPerformed(new ActionEvent(signUpThree.cancel, ActionEvent.ACTION_PERFORMED, "cancel"));
    }

}

