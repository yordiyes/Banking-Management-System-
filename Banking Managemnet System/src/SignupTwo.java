// Importing necessary Java Swing and AWT libraries
import javax.swing.*;
import javax.swing.text.AbstractDocument;
import java.awt.*;
import java.awt.event.*;

// SignupTwo class extends JFrame and implements ActionListener interface

public class SignupTwo extends JFrame implements ActionListener {
    // Declaration of GUI components

    JTextField passNumbTextField, phoneTextField;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, Catagory, Occupation, education, income;
    String formno;

    // Constructor for SignupTwo class

    SignupTwo(String formno) {
        this.formno = formno;
        setLayout(null);

        // Set frame title

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        JLabel AdditionalDetails = new JLabel("Page 2: Additional Details");
        AdditionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        AdditionalDetails.setBounds(290, 80, 400, 30);
        add(AdditionalDetails);

        JLabel rel  = new JLabel("Religion:");
        rel.setFont(new Font("Raleway", Font.BOLD, 20));
        rel.setBounds(100, 140, 100, 30);
        add(rel);

        String[] valReigion = {"Christian", "Muslim", "Other"};
        religion = new JComboBox(valReigion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);


        JLabel cat = new JLabel("Catagory:");
        cat.setFont(new Font("Raleway", Font.BOLD, 20));
        cat.setBounds(100, 190, 200, 30);
        add(cat);

        String[] valCategory = {"Personal Use", "Business Use"};
        Catagory = new JComboBox(valCategory);
        Catagory.setBounds(300, 190, 400, 30);
        Catagory.setBackground(Color.WHITE);
        add(Catagory);

        JLabel inc = new JLabel("Income:");
        inc.setFont(new Font("Raleway", Font.BOLD, 20));
        inc.setBounds(100, 240, 200, 30);
        add(inc);

        String[] incomeCatagory = {"None","<5000", "<10000", "<20000", "<50000", "Other"};
        income = new JComboBox(incomeCatagory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);


        JLabel educ = new JLabel("Educational");
        educ.setFont(new Font("Raleway", Font.BOLD, 20));
        educ.setBounds(100, 290, 200, 30);
        add(educ);

        JLabel qual = new JLabel("Qualification:");
        qual.setFont(new Font("Raleway", Font.BOLD, 20));
        qual.setBounds(100, 315, 200, 30);
        add(qual);


        String[] educationValues = {"Under-Graduate", "Graduate", "Post-Graduate", "Others"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);


        JLabel occu = new JLabel("Occupation:");
        occu.setFont(new Font("Raleway", Font.BOLD, 20));
        occu.setBounds(100, 390, 200, 30);
        add(occu);

        String[] OccupationalValues = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        Occupation = new JComboBox(OccupationalValues);
        Occupation.setBounds(300, 390, 400, 30);
        Occupation.setBackground(Color.WHITE);
        add(Occupation);


        JLabel passno = new JLabel("Passport Number:");
        passno.setFont(new Font("Raleway", Font.BOLD, 20));
        passno.setBounds(100, 440, 200, 30);
        add(passno);

        passNumbTextField = new JTextField();
        passNumbTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        passNumbTextField.setBounds(300, 440, 400, 30);
        add(passNumbTextField);
        // Add document filter to passNumbTextField (accepts only numbers)
        ((AbstractDocument) passNumbTextField.getDocument()).setDocumentFilter(new NumericOnlyDocumentFilter());

        JLabel phone = new JLabel("Phone number:");
        phone.setFont(new Font("Raleway", Font.BOLD, 20));
        phone.setBounds(100, 490, 200, 30);
        add(phone);

        phoneTextField = new JTextField();
        phoneTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        phoneTextField.setBounds(300, 490, 400, 30);
        add(phoneTextField);
        // Add document filter to phoneTextField (accepts only numbers)
        ((AbstractDocument) phoneTextField.getDocument()).setDocumentFilter(new NumericOnlyDocumentFilter());

        JLabel sc = new JLabel("Senior Citizen:");
        sc.setFont(new Font("Raleway", Font.BOLD, 20));
        sc.setBounds(100, 540, 200, 30);
        add(sc);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.GREEN);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.RED);
        add(sno);
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(syes);
        maritalGroup.add(sno);

        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.GREEN);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.RED);
        add(eno);

        ButtonGroup emaritalGroup = new ButtonGroup();
        emaritalGroup.add(eyes);
        emaritalGroup.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        // Set background color
        getContentPane().setBackground(Color.white);

        setSize(850, 800);
        setLocation(350, 0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        String Religion = (String) religion.getSelectedItem();
        String Category = (String) Catagory.getSelectedItem();
        String Income = (String) income.getSelectedItem();
        String Education = (String) education.getSelectedItem();
        String inOccupation = (String) Occupation.getSelectedItem();

        String seniorcitizen = null;

        if (syes.isSelected()) {
            seniorcitizen = "Yes";
        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        }

            String existingaccount = null;
        if (eyes.isSelected()) {
            existingaccount = "Yes";
        } else if (eno.isSelected()) {
            existingaccount = "No";
        }

        String passPortNumber = passNumbTextField.getText();
        String phoneNumber = phoneTextField.getText();

         try {
            Conn connection = new Conn();
            String query = "insert into signupTwo values('" + formno + "','" + Religion + "','" + Category + "','" + Income + "','" + Education + "','" + inOccupation + "','" + passPortNumber + "','" + phoneNumber + "','" + seniorcitizen + "','" + existingaccount + "')";
            connection.statement.executeUpdate(query);

            setVisible(false);
            new SignUpThree(formno).setVisible(true);

        }catch(Exception e){
            System.out.println(e);
        }
    }

        public static void main (String args[]){
            new SignupTwo(" ");
        }
    }