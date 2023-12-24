//importing the necessary libraries
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;
// Declaring the FastCash class that extends JFrame and implements ActionListener interface
public class FastCash extends JFrame implements ActionListener {

    JLabel label1, label3;
    JButton button1, button2, button3, button4, button5, button6, button7;
    String pin;

// Constructor for the FastCash class that takes a pin as a parameter

    FastCash(String pin) {

        this.pin = pin;
        setLayout(null);

// Creating an ImageIcon object with the image file "atm.jpg"
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        label3 = new JLabel(i3);
        label3.setBounds(0, 0, 960, 1080);
        add(label3);

// Creating a JLabel for displaying the text "SELECT WITHDRAWAL AMOUNT"
        label1 = new JLabel("SELECT WITHDRAWAL AMOUNT");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));

// Creating JButtons for different withdrawal amounts and setting their positions and sizes
        button1 = new JButton("100");
        button1.setBounds(170, 499, 150, 35);
        button1.addActionListener(this);
        label3.add(button1);

        button2 = new JButton("1000");
        button2.setBounds(390, 499, 150, 35);
        button2.addActionListener(this);
        label3.add(button2);

        button3 = new JButton("200");
        button3.setBounds(170, 543, 150, 35);
        button3.addActionListener(this);
        label3.add(button3);

        button4 = new JButton("2000");
        button4.setBounds(390, 543, 150, 35);
        button4.addActionListener(this);
        label3.add(button4);

        button5 = new JButton("500");
        button5.setBounds(170, 588, 150, 35);
        button5.addActionListener(this);
        label3.add(button5);

        button6 = new JButton("5000");
        button6.setBounds(390, 588, 150, 35);
        button6.addActionListener(this);
        label3.add(button6);

        button7 = new JButton("BACK");
        button7.setBounds(390, 633, 150, 35);
        button7.addActionListener(this);
        label3.add(button7);

        setLayout(null);

// Setting the position and size of the label1
        label1.setBounds(235, 400, 700, 35);
        label3.add(label1);

        setSize(960, 1080);
        setLocation(350, 0);
        setUndecorated(true);
        setVisible(true);

    }

// ActionListener implementation for handling button clicks
    public void actionPerformed(ActionEvent ae) {
        try {
            Conn connection  = new Conn();
            
// Getting the text of the clicked button
            String amount = ((JButton)ae.getSource()).getText();
            ResultSet resultSets = connection.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            int balance = 0;

            while (resultSets.next()) {
                if (resultSets.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSets.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSets.getString("amount"));
                }
            }
            
//Checking if there is sufficient balance for withdrawal
            if (ae.getSource() != button7 && balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null, "Insufficient Balance");
                return;
            }
            if (ae.getSource() == button7) {
                this.setVisible(false);
                new Transactions(pin).setVisible(true);
            }else{
                Conn connection1 = new Conn();
                Date date = new Date();
                connection1.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdrawal', '"+amount+"')");
                JOptionPane.showMessageDialog(null, amount+" Birr Debited Successfully");

                setVisible(false);
                new Transactions(pin).setVisible(true);

                resultSets.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
// Creating an instance of the FastCash class with an empty pin and making it visible
        new FastCash("").setVisible(true);
    }
}