import org.junit.Test;
import java.awt.event.ActionEvent;

public class SignUpOneTest {
    @Test
    public void testActionPerformed(){
        // Manually set values for the JComboBox components (religion, category, income, education, occupation)
        SignupOne signupOne = new SignupOne();
        signupOne.nameTextField.setText("Yordanos");
        signupOne.fatherNameTextField.setText("Yeshitla");
        signupOne.dateChooser.getCalendar();
        signupOne.male.setSelected(true);
        signupOne.female.setSelected(false);
        signupOne.emailTextField.setText("yordiman614@gmmail.com");
        signupOne.unMarried.setSelected(true);
        signupOne.addressTextField.setText("Addis Ababa");
        signupOne.cityTextField.setText("Akaki");
        signupOne.regionTextField.setText("Addis");
        signupOne.pinTextField.setText("2323");
    }
    @Test
    public void testActionPerformedNextShouldTransferToSignUpTwo(){
        SignupOne signupOne2 = new SignupOne();
        signupOne2.next.setSelected(true);
        signupOne2.actionPerformed(new ActionEvent(signupOne2.next, ActionEvent.ACTION_PERFORMED, "next"));
    }
    @Test
    public void testActionPerformedNextShouldTransferToLogin(){
        SignupOne signupOne3 = new SignupOne();
        signupOne3.back.setSelected(true);
        signupOne3.actionPerformed(new ActionEvent(signupOne3.back, ActionEvent.ACTION_PERFORMED, "next"));
    }
}