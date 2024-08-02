package travel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookPackage extends JFrame implements ActionListener {
    JLabel text, username,usernameAns,selectPackage,totalPersons,id,idAns,number , numberAns,phone,phoneAns,totalPrice, totalPriceAns ;
    JTextField totalPersonsTF ;
    JComboBox  box ;
    JButton checkPackage,bookPackage,backbtn ;
    static String user ;
    BookPackage(String user)
    {
        this.user = user ;
        setBounds(250,150,1000,600);
        getContentPane().setBackground(new Color(230, 230, 250));


        text = new JLabel("Book  Package");
        text.setBounds(100,10,300,40);
        text.setForeground(new Color(0, 109, 111));
        text.setFont(new Font("Tahoma",Font.BOLD,30));


        username = new JLabel("Username ") ;
        username.setBounds(30,90,150,25);
        username.setFont(new Font("Poppins" ,Font.BOLD,16));
        username.setForeground(new Color(91, 50, 86));

        usernameAns = new JLabel() ;
        usernameAns.setBounds(250,90,150,25);
        usernameAns.setFont(new Font("Poppins",Font.PLAIN,16));

        selectPackage = new JLabel("Select Package ") ;
        selectPackage.setBounds(30,140,150,25);
        selectPackage.setFont(new Font("Poppins" ,Font.BOLD,16));
        selectPackage.setForeground(new Color(91, 50, 86));

        box  = new JComboBox(new String[] {"Gold Package","Silver Package","Bronze Package"}) ;
        box.setBounds(220,140,170, 23);
        box.setFont(new Font("Poppins" ,Font.PLAIN,16));
        box.setBackground(new Color(230, 230, 250));



        totalPersons = new JLabel("Total Persons ") ;
        totalPersons.setBounds(30,190,300,25);
        totalPersons.setFont(new Font("Poppins",Font.BOLD,16));
        totalPersons.setForeground(new Color(91, 50, 86));

        totalPersonsTF = new JTextField() ;
        totalPersonsTF.setBounds(220,190,180,25);
        totalPersonsTF.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        totalPersonsTF.setFont(new Font("Poppins",Font.PLAIN,18));


        id  = new JLabel("ID") ;
        id.setBounds(30,240,150,25);
        id.setFont(new Font("Poppins" ,Font.BOLD,16));
        id.setForeground(new Color(91, 50, 86));

        idAns  = new JLabel() ;
        idAns.setBounds(250,240,150,25);
        idAns.setFont(new Font("Tahoma" ,Font.PLAIN,16));



        number = new JLabel("Number") ;
        number.setBounds(30,290,150,25);
        number.setFont(new Font("Poppins" ,Font.BOLD,16));
        number.setForeground(new Color(91, 50, 86));

        numberAns = new JLabel() ;
        numberAns.setBounds(250,290,150,25);
        numberAns.setFont(new Font("Poppins",Font.PLAIN,15));


        phone = new JLabel("Phone") ;
        phone.setBounds(30,340,150,25);
        phone.setFont(new Font("Poppins" ,Font.BOLD,16));
        phone.setForeground(new Color(91, 50, 86));

        phoneAns = new JLabel() ;
        phoneAns.setBounds(250,340,150,25);
        phoneAns.setFont(new Font("Poppins",Font.PLAIN,15));


        totalPrice = new JLabel("Total Price") ;
        totalPrice.setBounds(30,390,150,25);
        totalPrice.setFont(new Font("Poppins" ,Font.BOLD,16));
        totalPrice.setForeground(new Color(91, 50, 86));

        totalPriceAns = new JLabel() ;
        totalPriceAns.setBounds(250,390,150,25);
        totalPriceAns.setFont(new Font("Poppins",Font.PLAIN,15));


        checkPackage = new JButton("Check Package" );
        checkPackage.setBounds(30,450,130,40);
        checkPackage.setBackground(new Color(20, 116, 111));
        checkPackage.setBorder(BorderFactory.createLineBorder(Color.white));
        checkPackage.setForeground(Color.white);
        checkPackage.setFocusPainted(false);
        checkPackage.addActionListener(this);


        bookPackage = new JButton("Book Package" );
        bookPackage.setBounds(180,450,130,40);
        bookPackage.setBackground(new Color(20, 116, 111));
        bookPackage.setBorder(BorderFactory.createLineBorder(Color.white));
        bookPackage.setForeground(Color.white);
        bookPackage.setFocusPainted(false);
        bookPackage.addActionListener(this);


        backbtn = new JButton("Back" );
        backbtn.setBounds(330,450,100,40);
        backbtn.setBorder(BorderFactory.createLineBorder(Color.white));
        backbtn.setBackground(new Color(20, 116, 111));
        backbtn.setFocusPainted(false);
        backbtn.setForeground(Color.white);
        backbtn.addActionListener(this);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookPackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,380,Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2) ;
        JLabel image = new JLabel(i3) ;
        image.setBounds(450 ,80,500,380);

        try
        {
            usernameAns.setText(user);
            Conn c = new Conn() ;
            String query = "select * from customer where username = '"+user+"'" ;
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next())
            {
                idAns.setText(rs.getString("id"));
                numberAns.setText(rs.getString("number"));
                phoneAns.setText(rs.getString("phone"));

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        add(image) ;add(text) ;
        add(username);
        add(usernameAns);
        add(selectPackage);
        add(box) ;
        add(totalPersons);
        add(totalPersonsTF);
        add(id);
        add(idAns);
        add(number);
        add(numberAns);
        add(id);
        add(idAns);
        add(phone);
        add(phoneAns);
        add(totalPrice);
        add(totalPriceAns);
        add(checkPackage);
        add(bookPackage);
        add(backbtn) ;


        setLayout(null);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == checkPackage)
        {
            String p = (String)box.getSelectedItem() ;
            int cost = 0 ;
            if (p.equals("Gold Package"))
            {
            cost += 50000 ;

            }else if (p.equals("Silver Package"))
            {
                cost += 32000 ;
            } else
            {
                cost += 24000 ;
            }
            int persons = Integer.parseInt(totalPersonsTF.getText());
            cost *= persons ;
            totalPriceAns.setText("Rs." +cost +" (For "+persons+")");

        } else if (e.getSource() == bookPackage)
        {
            String unamef = usernameAns.getText() ;
            String idf = idAns.getText();
            String pack = (String)box.getSelectedItem() ;
            String persons_T =totalPersonsTF.getText() ;
            String numberf =numberAns.getText();
            String phonef = phoneAns.getText();
            String price_T =totalPriceAns.getText();
            try {
                Conn c = new Conn();
                String query = "INSERT INTO bookpackage (Username, Package, Total_Persons, Id, Number, Phone, Total_Price) VALUES ('" + unamef + "', '" + pack + "', '" + persons_T + "', '" + idf + "', '" + numberf + "', '" + phonef + "', '" + price_T + "')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Account Created Successfully");
            }catch (Exception bookPackage)
            {
                bookPackage.printStackTrace();
            }

        }
        else if (e.getSource() == backbtn)
        {
            new Dashboard(user) ;
            setVisible(false);
        }
    }

    public static void main(String[] args)
    {
        new BookPackage(user) ;
    }
}
