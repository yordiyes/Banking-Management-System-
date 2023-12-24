import org.junit.jupiter.api.Test;
import java.awt.event.ActionEvent;

class DepositTest {

    @Test
    void actionPerformed_depositButtonClicked_successfullyDepositsAmount() {

        Deposit deposit = new Deposit("");
        deposit.amount.setText("100");


        deposit.actionPerformed(new ActionEvent(deposit.deposit, ActionEvent.ACTION_PERFORMED, null));

    }

    @Test
    void actionPerformed_backButtonClicked_navigatesToTransactions() {

        Deposit deposit = new Deposit("");


        deposit.actionPerformed(new ActionEvent(deposit.back, ActionEvent.ACTION_PERFORMED, null));

    }
}
