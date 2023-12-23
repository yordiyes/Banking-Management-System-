import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
    JButton deposit, withdraw, pinChange, fastCash, balanceEnquiry, exit;
    String pinNumber;
    Transactions(String pinNumber) {

        this.pinNumber = pinNumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Please Select Your Transaction");
        text.setBounds(210, 310, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        deposit = new JButton("Deposit");
        deposit.setBounds(175, 420, 140, 30);
        deposit.addActionListener(this);
        image.add(deposit);

        withdraw = new JButton("Cash Withdrow");
        withdraw.setBounds(360, 420, 140, 30);
        withdraw.addActionListener(this);
        image.add(withdraw);

        fastCash = new JButton("Fast Cash");
        fastCash.setBounds(175, 455, 140, 30);
        fastCash.addActionListener(this);
        image.add(fastCash);

        pinChange = new JButton("Pin Change");
        pinChange.setBounds(175, 490, 140, 30);
        pinChange.addActionListener(this);
        image.add(pinChange);

        balanceEnquiry = new JButton("Balance Enquiry");
        balanceEnquiry.setBounds(360, 455, 140, 30);
        balanceEnquiry.addActionListener(this);
        image.add(balanceEnquiry);

        exit = new JButton("Exit");
        exit.setBounds(360, 525, 140, 27);
        exit.addActionListener(this);
        image.add(exit);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
        public void actionPerformed(ActionEvent ae) {
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

    public static void main(String[] args){
        new Transactions("");
    }
}
