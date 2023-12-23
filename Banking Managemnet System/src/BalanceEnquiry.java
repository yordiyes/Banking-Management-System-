// Import the swing, AWT, Event,and SQL packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

// Define a class named BalanceEnquiry that extends JFrame and implements ActionListener
public class BalanceEnquiry extends JFrame implements ActionListener {
    JButton back;
    String pinNumber;
    // Define a constructor that takes a pin number as parameter
    BalanceEnquiry(String pinnumber){

        this.pinNumber = pinnumber;
        // set the layout manager to null
        setLayout(null);

        // Load an image from the icons folder and scale it to fit the frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        // create a label with the image and set its bounds
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        // add the label to the frame
        add(image);

        // create a button with the text "Back" and set its bounds and action listener
        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        // add the back button to the image label
        image.add(back);

        Conn connection = new Conn();
        int balance = 0;

        try{
            ResultSet rs = connection.statement.executeQuery("select *from bank where pin = '"+ pinnumber+"'");
            while(rs.next()){
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }
                else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            // Ensure you close any resources (e.g., database connections) if needed
            connection.statement.close();
            rs.close();
        }catch(Exception e) {
            System.out.println(e);
        }

        JLabel text = new JLabel("Your Current Account Balance is "+balance + " Birr.");
        text.setForeground(Color.WHITE);
        text.setBounds(170,300,400,30);
        image.add(text);

        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transactions(pinNumber).setVisible(true);
    }
    public static void main(String[] args){
        new BalanceEnquiry("");
    }
}
