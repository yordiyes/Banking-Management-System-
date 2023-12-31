// Importing some internal and external libraries that are used for unit test
import org.junit.Test;
import java.awt.event.ActionEvent;

public class WithdrawalTest {
    // This test is used to test back button of the withdrawal class
    @Test
    public void testActionPerformedNextShouldTransferToWithdrawal(){
        Withdrawal witdraw = new Withdrawal("");
        witdraw.back.setSelected(true);
        witdraw.actionPerformed(new ActionEvent(witdraw.back, ActionEvent.ACTION_PERFORMED, "next"));
    }
    // And this one test the withdraw button
    @Test
    public void testActionPerformedNextShouldTransferToWithdrawalToTransaction(){
        Withdrawal witdraw1 = new Withdrawal("");
        witdraw1.withdraw.setSelected(true);
        witdraw1.actionPerformed(new ActionEvent(witdraw1.withdraw, ActionEvent.ACTION_PERFORMED, "next"));
    }
}