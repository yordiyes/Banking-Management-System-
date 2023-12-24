import org.junit.jupiter.api.Test;

import java.awt.event.ActionEvent;

import static org.junit.jupiter.api.Assertions.*;

class BalanceEnquiryTest {
    @Test
    void  setActionPerformedBackShouldTransitToTransaction(){
        BalanceEnquiry balanceEnquiry = new BalanceEnquiry("");
        balanceEnquiry.actionPerformed(new ActionEvent(balanceEnquiry.back, ActionEvent.ACTION_PERFORMED, "Back"));
        assertFalse(balanceEnquiry.isVisible());

    }

}