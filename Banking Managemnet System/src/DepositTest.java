//importing the junit module
import org.junit.jupiter.api.Test;
import java.awt.event.ActionEvent;

class DepositTest {
    //testing the deposit button

    @Test
    void actionPerformed_depositButtonClicked_successfullyDepositsAmount() {
        //instantiating object
        Deposit deposit = new Deposit("");
        deposit.amount.setText("100");

        deposit.actionPerformed(new ActionEvent(deposit.deposit, ActionEvent.ACTION_PERFORMED, null));

    }

    @Test
    //testing the transactions navigation
    void actionPerformed_backButtonClicked_navigatesToTransactions() {
        //instantiating object
        Deposit deposit = new Deposit("");


        deposit.actionPerformed(new ActionEvent(deposit.back, ActionEvent.ACTION_PERFORMED, null));

    }
}
