import org.junit.jupiter.api.Test;
import java.awt.event.ActionEvent;

class TransactionsTest {

    @Test
    void actionPerformed_depositButtonClicked_navigates_to_deposit() {
        Transactions transactions = new Transactions("");
        transactions.actionPerformed(new ActionEvent(transactions.deposit, ActionEvent.ACTION_PERFORMED, null));
    }
    @Test
    void actionPerformed_depositButtonClicked_navigates_to_withdraw() {
        Transactions transactions = new Transactions("");
        transactions.actionPerformed(new ActionEvent(transactions.withdraw, ActionEvent.ACTION_PERFORMED, null));
    }

    @Test
    void actionPerformed_depositButtonClicked_navigates_to_fastCash() {
        Transactions transactions = new Transactions("");
        transactions.actionPerformed(new ActionEvent(transactions.fastCash, ActionEvent.ACTION_PERFORMED, null));
    }
    @Test
    void actionPerformed_depositButtonClicked_navigates_to_balanceQuery() {
        Transactions transactions = new Transactions("");
        transactions.actionPerformed(new ActionEvent(transactions.balanceEnquiry, ActionEvent.ACTION_PERFORMED, null));
    }
    @Test
    void actionPerformed_depositButtonClicked_navigates_to_pinChange() {
        Transactions transactions = new Transactions("");
        transactions.actionPerformed(new ActionEvent(transactions.pinChange, ActionEvent.ACTION_PERFORMED, null));
    }
    @Test
    void actionPerformed_depositButtonClicked_navigates_to_exit() {
        Transactions transactions = new Transactions("");
        transactions.actionPerformed(new ActionEvent(transactions.exit, ActionEvent.ACTION_PERFORMED, null));
    }
}