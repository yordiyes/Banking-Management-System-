//importing the necessary libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.sql.*;

// Declaring the login class that extends JFrame and implements ActionListener interface

public class Login extends JFrame implements ActionListener {
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {
        setTitle("Banking System");
        setLayout(null);

// Creating and scaling the logo image
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image image2 = image1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel label = new JLabel(image3);
        add(label);

         
        JLabel text = new JLabel("Welcome TO SWE Bank ");
        text.setFont(new Font("Osward", Font.BOLD, 35));
        text.setBounds(200, 40, 600, 40);
        add(text);

// Creating and setting the card number label
        JLabel cardNo = new JLabel("Account Number:");
        cardNo.setFont(new Font("Raleway", Font.BOLD, 20));
        cardNo.setBounds(120, 150, 600, 40);
        add(cardNo);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 250, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);

        JLabel pin = new JLabel("Pin code:");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(120, 220, 600, 40);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 250, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 20));
        add(pinTextField);

// Creating and setting the signin button       
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setForeground(Color.WHITE);
        login.setBackground(Color.BLACK);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(450, 300, 100, 30);
        clear.setForeground(Color.WHITE);
        clear.setBackground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);

// Creating and setting the signup button
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 250, 30);
        signup.setForeground(Color.WHITE);
        signup.setBackground(Color.BLACK);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.white);
        setSize(700, 600);
        setLocation(350, 0);
        setVisible(true);
        label.setBounds(70, 10, 100, 100);

    }

// ActionListener implementation for handling button clicks

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            // Clearing the text fields
            cardTextField.setText(" ");
            pinTextField.setText("");
        }else if (e.getSource() == login) {
            // creating connection object
            Conn connection = new Conn();
            String cardNumber = cardTextField.getText();
            String pinNumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '" + cardNumber + "'and pin = '"+ pinNumber +"'";
           
            // Executing the query and Checking the result set and if it is not correct generating a message
            try{
                ResultSet rs = conection.statement.executeQuery(query);

                if(rs.next()) {
                    setVisible(false);
                    new Transactions(pinNumber).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                }
            }
            catch(Exception exception){
                System.out.println(e);
            }
        }else if (e.getSource() == signup) {
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    
    //Calling the constructor login to excute the whole code
    public static void main(String[] args)
    {
        new Login();
    }
}