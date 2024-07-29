package awtAndSwingBasics;
import javax.swing.*;
import java.awt.*;

public class SwingApp extends JFrame {

    SwingApp(){
        JFrame f = new JFrame();

        JLabel firstName = new JLabel("First Name");
        firstName.setBounds(20, 50, 80, 20);

        JLabel lastName = new JLabel("Last Name");
        lastName.setBounds(20, 80, 80, 20);

        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(20, 110, 80, 20);

        JTextField firstNameTF = new JTextField();
        firstNameTF.setBounds(120, 50, 100, 20);

        JTextField lastNameTF = new JTextField();
        lastNameTF.setBounds(120, 80, 100, 20);

        JTextField dobTF = new JTextField();
        dobTF.setBounds(120, 110, 100, 20);

        JButton sbmt = new JButton("Submit");
        sbmt.setBounds(20, 160, 100, 30);

        JButton reset = new JButton("Reset");
        reset.setBounds(120,160,100,30);

        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image icon2= icon1.getImage().getScaledInstance(500,300,Image.SCALE_SMOOTH) ;
        ImageIcon  icon3 = new ImageIcon(icon2) ;
        JLabel image = new JLabel(icon1) ;
        image.setBounds(50,200,500,300);


        f.add(firstName);
        f.add(lastName);
        f.add(dob);
        f.add(firstNameTF);
        f.add(lastNameTF);
        f.add(dobTF);
        f.add(sbmt);
        f.add(reset);
        f.add(image) ;
        f.setLayout(null);
        f.setLocation(300,200);
        f.setSize(800,500);
        f.setVisible(true);
    }


    public static void main(String[] args)

    {
        SwingApp s = new SwingApp();
    }



}