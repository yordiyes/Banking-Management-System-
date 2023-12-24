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

        // Creating a JLabel with the ImageIcon and setting its position and size
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

            // Executing a database query to retrieve the account details based on the entered pin
            ResultSet resultSets = connection.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            int balance = 0;

            // Calculating the balance based on the account transactions
            while (resultSets.next()) {
                if (resultSets.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSets.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSets.getString("amount"));
                }
            }

            // Checking if there is sufficient balance for withdrawal
            if (ae.getSource() != button7 && balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null, "Insufficient Balance");
                return;
            }

            if (ae.getSource() == button7) {
                // If the "BACK" button is clicked, hide the current frame and show the Transactions frame
                this.setVisible(false);
                new Transactions(pin).setVisible(true);
            } else {
                // If a withdrawal button is clicked, update the database with the withdrawal transaction and show a success message
                Conn connection1 = new Conn();
                Date date = new Date();
                connection1.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdrawal', '"+amount+"')");
                JOptionPane.showMessageDialog(null, amount+" Birr Debited Successfully");

                // Hide the current frame and show the Transactions frame
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














































































//importing the necessary libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    //Creating TextField called amount
    JTextField amount;
    //creating button called deposit, back
    JButton deposit, back;
    //Creating variable called pinNumber to store the string form of the pinNumber variable\
    String pinNumber;
    Deposit(String pinNumber){
        // Assigning pinNumber to the global variable pinNumber
        this.pinNumber = pinNumber;
        setLayout(null);

        //Adding an image called "atm.jpg" in to the window
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image image2 = image1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image = new JLabel(image3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Enter the amount you want to deposit");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(170, 300, 400, 20);
        image.add(text);

        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(170, 350,320, 30);
        image.add(amount);

        deposit = new JButton("Deposit");
        deposit.setBounds(355, 485, 150, 30);
        deposit.addActionListener(this);
        image.add(deposit);

        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        // Setting the size of the window to 900 by 900
        setSize(900, 900);
        setLocation(350, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent actionEvent){
        if(actionEvent.getSource() == deposit){
            String number = amount.getText();
            Date date = new Date();
             if(number.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
            }else{
                try{
                    // creating connection object
                    Conn connection = new Conn();

                    // inserting the data to the bank table
                    String query = "insert into bank VALUES ('" + pinNumber + "', '" + date + "', 'Deposit', '" + number + "')";
                    connection.statement.executeUpdate(query);

                    // a message to notify that the money have been succesfully deposited
                    JOptionPane.showMessageDialog(null, number +" Birr Deposited Successfully");

                    setVisible(false);
                    new Transactions(pinNumber).setVisible(true);

                }catch (Exception e){
                    System.out.println(e);
                }
            }
        }else if(actionEvent.getSource() == back){
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
