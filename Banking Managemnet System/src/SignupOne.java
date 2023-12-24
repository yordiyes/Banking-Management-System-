// Import necessary packages
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import javax.swing.text.AbstractDocument;

// Class declaration, extending JFrame and implementing ActionListener interface
public class SignupOne extends JFrame implements ActionListener{
    //Creating text fields in order to accept data
    JTextField nameTextField, fatherNameTextField, emailTextField, addressTextField, cityTextField, regionTextField, pinTextField;
    JRadioButton  male, female, married, unMarried, other ;
    JDateChooser dateChooser;
    JButton back, next;
    Random ran = new Random();
    // Generate a random form number
    long random = Math.abs((ran.nextLong() % 9000L) + 1000L);

    SignupOne (){
        setLayout(null);

        JLabel formNo = new JLabel("APPLICATION FORM NO. " + random);
        formNo.setFont(new Font("Raleway",Font.BOLD, 38));
        formNo.setBounds(140,20,600,40);
        add(formNo);

        JLabel personalDetail = new JLabel("Page 1: Personal Details");
        personalDetail.setFont(new Font("Raleway",Font.BOLD, 22));
        personalDetail.setBounds(290, 80,400,30);
        add(personalDetail);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD, 20));
        name.setBounds(100, 140,100,30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        // Add document filter to nameTextField
        ((AbstractDocument) nameTextField.getDocument()).setDocumentFilter(new CharOnlyDocumentFilter());


        JLabel fatherName = new JLabel("Father's Name:");
        fatherName.setFont(new Font("Raleway",Font.BOLD, 20));
        fatherName.setBounds(100, 190,180,30);
        add(fatherName);

        fatherNameTextField = new JTextField();
        fatherNameTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        fatherNameTextField.setBounds(300, 190, 400, 30);
        add(fatherNameTextField);
        // Add document filter to fatherNameTextField
        ((AbstractDocument) fatherNameTextField.getDocument()).setDocumentFilter(new CharOnlyDocumentFilter());


        JLabel dateOfBirth = new JLabel("Date Of Birth:");
        dateOfBirth.setFont(new Font("Raleway",Font.BOLD, 20));
        dateOfBirth.setBounds(100, 240,200,30);
        add(dateOfBirth);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD, 20));
        gender.setBounds(100, 290,200,30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.white);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 290, 90, 30);
        female.setBackground(Color.white);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD, 20));
        email.setBounds(100, 340,200,30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);

        JLabel maritalStatus = new JLabel("Marital Status:");
        maritalStatus.setFont(new Font("Raleway",Font.BOLD, 20));
        maritalStatus.setBounds(100, 390,200,30);
        add(maritalStatus);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.white);
        add(married);

        unMarried = new JRadioButton("UnMarried");
        unMarried.setBounds(450, 390, 100, 30);
        unMarried.setBackground(Color.white);
        add(unMarried);

        other = new JRadioButton("Other");
        other.setBounds(610, 390, 100, 30);
        other.setBackground(Color.white);
        add(other);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unMarried);
        maritalGroup.add(other);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD, 20));
        address.setBounds(100, 440,200,30);
        add(address);


        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);
        // Add document filter to addressTextField
        ((AbstractDocument) addressTextField.getDocument()).setDocumentFilter(new CharOnlyDocumentFilter());

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD, 20));
        city.setBounds(100, 490,200,30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);
        // Add document filter to cityTextField
        ((AbstractDocument) cityTextField.getDocument()).setDocumentFilter(new CharOnlyDocumentFilter());

        JLabel region = new JLabel("Region:");
        region.setFont(new Font("Raleway",Font.BOLD, 20));
        region.setBounds(100, 540,200,30);
        add(region);

        regionTextField = new JTextField();
        regionTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        regionTextField.setBounds(300, 540, 400, 30);
        add(regionTextField);
        // Add document filter to regionTextField
        ((AbstractDocument) regionTextField.getDocument()).setDocumentFilter(new CharOnlyDocumentFilter());

        JLabel idNumber = new JLabel("ID Number:");
        idNumber.setFont(new Font("Raleway",Font.BOLD, 20));
        idNumber.setBounds(100, 590,200,30);
        add(idNumber);

        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        pinTextField.setBounds(300, 590, 400, 30);
        add(pinTextField);
        // Add document filter to pinTextField (accepts only numbers)
        ((AbstractDocument) pinTextField.getDocument()).setDocumentFilter(new NumericOnlyDocumentFilter());

        // Create and add "Next" button
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont( new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 640, 80, 30);
        next.addActionListener(this);
        add(next);

        // Create and add "Back" button
        back = new JButton("BACK");
        back.setBounds(300, 640, 80, 30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        add(back);


        getContentPane().setBackground(Color.white);

        //seting the size of the window to 900 by 900
        setSize(900, 900);
        setLocation(350, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            this.setVisible(false);
            new Login().setVisible(true);
        } else if (ae.getSource() == next) {
            String formNo = String.valueOf(random);
            String name1 = nameTextField.getText();
            String fatherName1 = fatherNameTextField.getText();
            String dateOfBirth1 = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
            String gender1 = null;

            if (male.isSelected()) {
                gender1 = "Male";
            } else if (female.isSelected()) {
                gender1 = "Female";
            }
            String email1 = emailTextField.getText();
            String maritalStatus1;
            if (married.isSelected()) {
                maritalStatus1 = "Married";
            } else if (unMarried.isSelected()) {
                maritalStatus1 = "UnMarried";
            } else {
                maritalStatus1 = "Other";
            }
            String address1 = addressTextField.getText();
            String city1 = cityTextField.getText();
            String pinCode1 = pinTextField.getText();
            String region1 = regionTextField.getText();

            try {
                if (name1.isEmpty() || (fatherName1.isEmpty()) || dateOfBirth1.isEmpty() || (address1.isEmpty()) || city1.isEmpty() || email1.isEmpty() || pinCode1.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Fill The Whole Part Of The Form");
                } else {
                    Conn connection = new Conn();
                    String query = "insert into SignUpOne values('" + formNo + "','" + name1 + "','" + fatherName1 + "','" + dateOfBirth1 + "','" + gender1 + "','" + email1 + "','" + maritalStatus1 + "','" + address1 + "','" + city1 + "','" + pinCode1 + "','" + region1 + "')";
                    connection.statement.executeUpdate(query);

                    setVisible(false);
                    new SignupTwo(formNo).setVisible(true);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    // Main method to start the application
    public static void main(String args[]){
        new SignupOne();
    }
}
