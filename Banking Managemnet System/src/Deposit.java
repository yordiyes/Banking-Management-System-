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
    //Creating variable called pinNumber to store the string form of the pinNumber variable
    String pinNumber;
    Deposit(String pinNumber){

        this.pinNumber = pinNumber;
        setLayout(null);

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image img2 = img1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image = new JLabel(img3);
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

        setSize(900, 900);
        setLocation(300, 0);
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
                    Conn connection = new Conn();
                    String query = "INSERT into bank VALUES ('" + pinNumber + "', '" + date + "', 'Deposit', '" + number + "')";
                    connection.statement.executeUpdate(query);
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
