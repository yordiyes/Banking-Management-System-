//Importing the Test class from the org.junit.jupiter.api package.
//Importing the ActionEvent class from the java.awt.event package.
import org.junit.jupiter.api.Test;
import java.awt.event.ActionEvent;

// Declaring the FastCashTest class.
public class FastCashTest {
    
 //Defining a test method named actionPerformed buttons_Clicked_successfully.
 //This method tests the functionality of buttons being clicked successfully.
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


//        Line 10: Creating an instance of the FastCash class with an empty string parameter.
//        Line 11: Setting the text of button1 to "100".
//        Line 12: Invoking the actionPerformed method of the fastCash instance with an ActionEvent object as a parameter.
//        Line 19-27: Similar to lines 9-17, these test methods simulate button clicks with different values and test the corresponding functionality.
//        Line 30-36: Defining a test method named actionPerformed_backButtonClicked_navigatesToTransactions. This method tests the functionality ofthe back button being clicked and navigating to transactions.
//        Line 31: Creating an instance of the FastCash class with an empty string parameter.
//        Line 32: Invoking the actionPerformed method of the fastCash instance with an ActionEvent object representing a back button click as a parameter

