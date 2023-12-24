//Importing the Test class from the org.junit.jupiter.api package.
//Importing the ActionEvent class from the java.awt.event package.
import org.junit.jupiter.api.Test;
import java.awt.event.ActionEvent;

// Declaring the FastCashTest class.
public class FastCashTest {

    @Test
    void actionPerformed_button1_Clicked_successfully() {
        FastCash fastCash = new FastCash("");
        fastCash.button1.setText("100");
        fastCash.actionPerformed(new ActionEvent(fastCash.button1,ActionEvent.ACTION_PERFORMED,"withdraw"));
    }

    @Test
    void actionPerformed_button2_Clicked_successfully() {
        FastCash fastCash = new FastCash(" ");
        fastCash.button2.setText("1000");
        fastCash.actionPerformed(new ActionEvent(fastCash.button2,ActionEvent.ACTION_PERFORMED,"withdraw"));
    }

    @Test
    void actionPerformed_button3_Clicked_successfully() {
        FastCash fastCash = new FastCash("");
        fastCash.button3.setText("200");
        fastCash.actionPerformed(new ActionEvent(fastCash.button3,ActionEvent.ACTION_PERFORMED,"withdraw"));
    }

    @Test
    void actionPerformed_button4_Clicked_successfully() {
        FastCash fastCash = new FastCash("");
        fastCash.button4.setText("2000");
        fastCash.actionPerformed(new ActionEvent(fastCash.button4,ActionEvent.ACTION_PERFORMED,"withdraw"));
    }

    @Test
    void actionPerformed_button5_Clicked_successfully() {
        FastCash fastCash = new FastCash("");
        fastCash.button5.setText("500");
        fastCash.actionPerformed(new ActionEvent(fastCash.button5,ActionEvent.ACTION_PERFORMED,"withdraw"));
    }

    @Test
    void actionPerformed_button6_Clicked_successfully() {
        FastCash fastCash = new FastCash("");
        fastCash.button6.setText("5000");
        fastCash.actionPerformed(new ActionEvent(fastCash.button6,ActionEvent.ACTION_PERFORMED,"withdraw"));
    }


    @Test
    void actionPerformed_button7_backButtonClicked_navigatesToTransactions() {
        FastCash fastCash = new FastCash("");
        fastCash.actionPerformed(new ActionEvent(fastCash.button7,ActionEvent.ACTION_PERFORMED,"back"));
    }

}


