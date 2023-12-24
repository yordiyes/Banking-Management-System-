// Importing the required libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

//Defining a class called signup three that extends JFrame and implements the method action listner
public class SignUpThree extends JFrame implements ActionListener {
    //Defining radio buttons
    JRadioButton radioButton1,radioButton2,radioButton3,radioButton4;
    //Defining checkBox
    JCheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6;
    JButton submit,cancel;
    String formNo;
    private String cardNumber;
    // Constructor for SignUp Three class
    SignUpThree(String formno) {
        this.formNo = formno;
        setLayout(null);
        // Generate a random 16-digit card number
        cardNumber = Long.toString(5040936000000000L + (long) (Math.random() * 9000000000000000L));

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");

        // Creating and configuring GUI components
        JLabel eleven11 = new JLabel("Page 3: Account Details");
        eleven11.setFont(new Font("Raleway", Font.BOLD, 22));
        eleven11.setBounds(280,40,400,40);
        add(eleven11);

        JLabel type = new JLabel("Account type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100,140,200,30);
        add(type);

        radioButton1 = new JRadioButton("Saving account");
        radioButton1.setFont(new Font("Raleway",Font.BOLD,16));
        radioButton1.setBackground(Color.WHITE);
        radioButton1.setBounds(100,180,180,20);
        add(radioButton1);

        radioButton2 = new JRadioButton("Fixed deposit account");
        radioButton2.setFont(new Font("Raleway",Font.BOLD,16));
        radioButton2.setBackground(Color.WHITE);
        radioButton2.setBounds(350,180,250,20);
        add(radioButton2);

        radioButton3 = new JRadioButton("Current account");
        radioButton3.setFont(new Font("Raleway",Font.BOLD,16));
        radioButton3.setBackground(Color.WHITE);
        radioButton3.setBounds(100,220,250,20);
        add(radioButton3);

        radioButton4 = new JRadioButton("Reoccurring Deposit account");
        radioButton4.setFont(new Font("Raleway",Font.BOLD,18));
        radioButton4.setBackground(Color.WHITE);
        radioButton4.setBounds(350,220,300,20);
        add(radioButton4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(radioButton1);
        groupaccount.add(radioButton2);
        groupaccount.add(radioButton3);
        groupaccount.add(radioButton4);

        JLabel card = new JLabel("Account Number");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100,300,200,30);
        add(card);

        JLabel number = new JLabel(cardNumber);
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330,300,300,30);
        add(number);

        JLabel carddetail = new JLabel("Your 16 Digit Account Number: ");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100,330,300,30);
        add(carddetail);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100,370,200,30);
        add(pin);
        JLabel pinNumber = new JLabel("XXXX");
        pinNumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pinNumber.setBounds(330,370,300,30);
        add(pinNumber);

        JLabel pindetail = new JLabel("Your 4 digit password: ");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(100,400,300,20);
        add(pindetail);

        JLabel services = new JLabel("Services Required: ");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100,450,300,30);
        add(services);

        checkBox1 = new JCheckBox("ATM CARD");
        checkBox1.setBackground(Color.WHITE);
        checkBox1.setFont(new Font("Raleway",Font.BOLD,16));
        checkBox1.setBounds(100,500,200,30);
        add(checkBox1);

        checkBox2 = new JCheckBox("Internet Banking");
        checkBox2.setBackground(Color.WHITE);
        checkBox2.setFont(new Font("Raleway",Font.BOLD,16));
        checkBox2.setBounds(350,500,200,30);
        add(checkBox2);

        checkBox3 = new JCheckBox("Mobile Banking");
        checkBox3.setBackground(Color.WHITE);
        checkBox3.setFont(new Font("Raleway",Font.BOLD,16));
        checkBox3.setBounds(100,550,200,30);
        add(checkBox3);

        checkBox4 = new JCheckBox("EMAIL $ SMS Alerts");
        checkBox4.setBackground(Color.WHITE);
        checkBox4.setFont(new Font("Raleway",Font.BOLD,16));
        checkBox4.setBounds(350,550,200,30);
        add(checkBox4);

        checkBox5 = new JCheckBox("Cheque Book");
        checkBox5.setBackground(Color.WHITE);
        checkBox5.setFont(new Font("Raleway",Font.BOLD,16));
        checkBox5.setBounds(100,600,200,30);
        add(checkBox5);

        checkBox6 = new JCheckBox("I here by declares that the above entered details are correct to the best of my knowledge");
        checkBox6.setBackground(Color.WHITE);
        checkBox6.setFont(new Font("Raleway",Font.BOLD,13));
        checkBox6.setBounds(100,660,600,40);
        add(checkBox6);

        // ... (Additional GUI component configurations)
        submit = new JButton("Submit");
        submit.setBackground(Color.GREEN);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,710,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.RED);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,710,100,30);
        cancel.addActionListener(this);
        add(cancel);

        // Setting background color
        getContentPane().setBackground(Color.WHITE);

        // Setting frame size and visibility
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }
    // ActionListener method implementation
    public void actionPerformed(ActionEvent ae){
        // Handling button clicks
        if(ae.getSource() == submit){
            String accountType = "";
            // Check if any radio button is selected
            if (radioButton1.isSelected()) {
                accountType = "Saving Account";
            } else if (radioButton2.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if (radioButton3.isSelected()) {
                accountType = "Current Account";
            } else if (radioButton4.isSelected()) {
                accountType = "Reoccurring account";
            }
            // Check if any radio button is selected
            if (accountType.equals("")) {
                JOptionPane.showMessageDialog(null, "Please choose an account type");
                return;  // Exit the method without processing further
            }

            // Create a Random object
            Random random = new Random();

            // Generate a random number between 1000 (inclusive) and 10000 (exclusive)
            int pinNumber = random.nextInt(9000) + 1000;
            // Convert the pinNumber to a string
            String pinNumberString = String.valueOf(pinNumber);
            String facility = "";

            if (checkBox1.isSelected()){
                facility = facility + "ATM CARD";
            } else if (checkBox2.isSelected()) {
                facility = facility + "Internet Banking";
            } else if (checkBox3.isSelected()) {
                facility = facility + "Mobile Banking";
            } else if (checkBox4.isSelected()) {
                facility = facility + "EMAIL & SMS Alerts";
            } else if (checkBox5.isSelected()) {
                facility = facility + "Cheque Book";
            } else if (checkBox6.isSelected()) {
                facility = facility + "E-statement";
            }
            if (facility.isEmpty()) {
                // Exit the method without processing further
                JOptionPane.showMessageDialog(null, "Please choose at least one service");
                return;
            }
            if (!checkBox6.isSelected()) {
                // Stop further processing if the checkbox is not selected
                JOptionPane.showMessageDialog(null, "You must agree to the declaration.");
                return;
            }
            // ... (Additional form validation and processing logic)
            try{
                // Database connection and query execution
                Conn connection = new Conn();
                String query1 = "insert into signupThree values('"+formNo+"','"+accountType+"','"+this.cardNumber+"','"+pinNumberString+"','"+facility+"')";
                String query2 = "insert into login values('"+formNo+"','" +cardNumber+"','"+pinNumber+"')";

                connection.statement.executeUpdate(query1);
                connection.statement.executeUpdate(query2);
                JOptionPane.showMessageDialog(null, "Card Number: " +cardNumber + "\n pin:" + pinNumber);
                // Closing the current frame and opening a new frame
                setVisible(false);
                new Deposit(pinNumberString).setVisible(true);
            }catch (Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource()==cancel){
            // Handling cancel button click
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    // Main method to instantiate the SignUpThree class
    public static void main(String[] args) {
        new SignUpThree("");
    }
}
