//Importing the Test class from the org.junit.jupiter.api package.
//Importing the ActionEvent class from the java.awt.event package.
import org.junit.jupiter.api.Test;
import java.awt.event.ActionEvent;

// Declaring the FastCashTest class.
public class FastCashTest {

//Defining a test method named actionPerformed buttons_Clicked_successfully.
//This method tests the functionality of buttons from button 1 to button 7 being clicked successfully it is the same for.
// From line 16-20 ,Creating an instance of the FastCash class with an empty string parameter.
// Setting the text of button1 to "100".
// Invoking the actionPerformed method of the fastCash instance with an ActionEvent object as a parameter.

    @Test
    void actionPerformed_button1_Clicked_successfully() {
        FastCash fastCash = new FastCash("");
        fastCash.button1.setText("100");
        fastCash.actionPerformed(new ActionEvent(fastCash.button1,ActionEvent.ACTION_PERFORMED,"withdraw"));
    }

// Line 24-63: Similar to lines 16-20 but different in setting the text amount.
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
        // Invoking the actionPerformed method of the fastCash instance 
        // with an ActionEvent object representing a back button click as a parameter.
        fastCash.actionPerformed(new ActionEvent(fastCash.button7,ActionEvent.ACTION_PERFORMED,"back"));
    }

}

