import org.junit.Test;
import java.awt.event.ActionEvent;
import static junit.framework.Assert.assertFalse;

public class WithdrawalTest {
    @Test
    public void testActionPerformedNextShouldTransferToWithdrawal(){
        Withdrawal witdraw = new Withdrawal("");
        witdraw.back.setSelected(true);
        witdraw.actionPerformed(new ActionEvent(witdraw.back, ActionEvent.ACTION_PERFORMED, "next"));
    }
    @Test
    public void testActionPerformedNextShouldTransferToWithdrawalToTransaction(){
        Withdrawal witdraw1 = new Withdrawal("");
        witdraw1.withdraw.setSelected(true);
        witdraw1.actionPerformed(new ActionEvent(witdraw1.withdraw, ActionEvent.ACTION_PERFORMED, "next"));
    }
}