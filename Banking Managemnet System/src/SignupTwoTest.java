import org.junit.Test;
import java.awt.event.ActionEvent;
import static junit.framework.Assert.assertFalse;

public class SignupTwoTest {
@Test
public void testActionPerformed(){
        // Manually set values for the JComboBox components (religion, category, income, education, occupation)
        SignupTwo signupTwo=new SignupTwo("");
        signupTwo.religion.setSelectedItem("Muslim");
        signupTwo.Catagory.setSelectedItem("OBC");
        signupTwo.income.setSelectedItem("<50000");
        signupTwo.education.setSelectedItem("Under Graduate");
        signupTwo.Occupation.setSelectedItem("Student");
        // Manually set values for radio buttons and text fields
        signupTwo.syes.setSelected(true);
        signupTwo.sno.setSelected(false);
        signupTwo.eyes.setSelected(true);
        signupTwo.eno.setSelected(false);
        signupTwo.passNumbTextField.setText("AB1234567");
        signupTwo.phoneTextField.setText("1234567890");

        signupTwo.actionPerformed(null);
        assertFalse(signupTwo.isVisible());


    }
@Test
public void testActionPerformedNextShouldTransferToSignUpThree(){
        SignupTwo signupTwo=new SignupTwo("");
        signupTwo.next.setSelected(true);
        signupTwo.actionPerformed(new ActionEvent(signupTwo.next, ActionEvent.ACTION_PERFORMED, "next"));
       // assertFalse(signupTwo.isVisible());

}
}