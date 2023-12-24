// Importing necessary libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Define a class named Transactions that extends JFrame and implements ActionListener
public class Transactions extends JFrame implements ActionListener{
    JButton deposit, withdraw, pinChange, fastCash, balanceEnquiry, exit;
    String pinNumber;
    Transactions(String pinNumber) {
        this.pinNumber = pinNumber;
        setLayout(null);

        // Load an image from the icons folder and then scale it to fit the frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        // Create a label with the image and set its bounds, and add to the frame
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        // Create a label with the text "please select your transaction" and set its properties
        JLabel text = new JLabel("Please Select Your Transaction");
        text.setBounds(210, 310, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        // Create a button with the text "Deposit" and set its bounds and action listener
        deposit = new JButton("Deposit");
        deposit.setBounds(175, 420, 140, 30);
        deposit.addActionListener(this);
        image.add(deposit);

        // Create a button with the text "Cash Withdrow" and set its bounds and action listener
        withdraw = new JButton("Cash Withdrow");
        withdraw.setBounds(360, 420, 140, 30);
        withdraw.addActionListener(this);
        image.add(withdraw);

        // Create a button with the text "Fast Cash" and set its bounds and action listener
        fastCash = new JButton("Fast Cash");
        fastCash.setBounds(175, 455, 140, 30);
        fastCash.addActionListener(this);
        image.add(fastCash);

        // Create a button with the text "Pin Change" and set its bounds and action listener
        pinChange = new JButton("Pin Change");
        pinChange.setBounds(175, 490, 140, 30);
        pinChange.addActionListener(this);
        image.add(pinChange);

        // Create a button with the text "Balance Enquiry" and set its bounds and action listener
        balanceEnquiry = new JButton("Balance Enquiry");
        balanceEnquiry.setBounds(360, 455, 140, 30);
        balanceEnquiry.addActionListener(this);
        image.add(balanceEnquiry);

        // Create a button with the text "Exit" and set its bounds and action listener
        exit = new JButton("Exit");
        exit.setBounds(360, 525, 140, 27);
        exit.addActionListener(this);
        image.add(exit);

        // Set the size,location, and visibility of the frame
        setSize(900, 900);
        setLocation(350, 0);
        setUndecorated(true);
        setVisible(true);
    }

        // Define a method that handles the action events of the buttons
        public void actionPerformed(ActionEvent ae) {

            // Check the source of the action event and perform the corresponding action
            if (ae.getSource() == exit) {
                System.exit(0);
            } else if (ae.getSource() == deposit) {
                setVisible(false);
                new Deposit(pinNumber).setVisible(true);
            } else if (ae.getSource() == withdraw) {
                setVisible(false);
                new Withdrawal(pinNumber).setVisible(true);
            } else if (ae.getSource() == fastCash) {
                setVisible(false);
                new FastCash(pinNumber).setVisible(true);
            } else if (ae.getSource() == pinChange) {
                setVisible(false);
                new PinChange(pinNumber).setVisible(true);
            } else if (ae.getSource() == balanceEnquiry) {
                setVisible(false);
                new BalanceEnquiry(pinNumber).setVisible(true);
            }
        }

    // Define the main method that creates a new Transactions frame with an empty pin number
    public static void main(String[] args){
        new Transactions("");
    }
}
