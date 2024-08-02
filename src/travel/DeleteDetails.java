package travel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteDetails  extends JFrame implements ActionListener {
    JLabel text, username,usernameAns,id,idAns,number ,numberAns,name,nameAns,gender,genderAns,country,countryAns,address,addressAns,phone,phoneAns,email,emailAns ;
    JButton dltbtn ;
    static String user ;
    DeleteDetails(String user)
    {
        this.user = user ;
        setBounds(300,130,850,600);
        getContentPane().setBackground(new Color(3, 102, 102));

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Face1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(170,200,Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2) ;
        JLabel image1 = new JLabel(i3) ;
        image1.setBounds(0,370,170,200);

        ImageIcon image2i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Face2.jpg"));
        Image image2i2 = image2i1.getImage().getScaledInstance(170,200,Image.SCALE_SMOOTH);
        ImageIcon image2i3 = new ImageIcon(image2i2) ;
        JLabel image2=  new JLabel(image2i3) ;
        image2.setBounds(170,370,170,200);

        ImageIcon image3i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Face3.jpg"));
        Image image3i2 = image3i1.getImage().getScaledInstance(170,200,Image.SCALE_SMOOTH);
        ImageIcon image3i3 = new ImageIcon(image3i2) ;
        JLabel image3=  new JLabel(image3i3) ;
        image3.setBounds(340,370,170,200);


        ImageIcon image4i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Face4.jpg"));
        Image image4i2 = image4i1.getImage().getScaledInstance(170,250,Image.SCALE_SMOOTH);
        ImageIcon image4i3 = new ImageIcon(image4i2) ;
        JLabel image4=  new JLabel(image4i3) ;
        image4.setBounds(510,370,170,200);

        ImageIcon image5i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Face5.jpg"));
        Image image5i2 = image5i1.getImage().getScaledInstance(170,200,Image.SCALE_SMOOTH);
        ImageIcon image5i3 = new ImageIcon(image5i2) ;
        JLabel image5=  new JLabel(image5i3) ;
        image5.setBounds(680,370,170,200);


        text  = new JLabel("Delete Details");
        text.setFont(new Font("Times New Roman",Font.BOLD,30));
        text.setBounds(290,10,300,50);
        text.setForeground(Color.white);


        username = new JLabel("Username : ") ;
        username.setBounds(30,90,150,25);
        username.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        username.setForeground(Color.white);

        usernameAns = new JLabel() ;
        usernameAns.setBounds(220,90,150,25);
        usernameAns.setForeground(new Color(255, 184, 0));
        usernameAns.setFont(new Font("Tahoma",Font.PLAIN,16));



        id  = new JLabel("ID :") ;
        id.setBounds(30,140,150,25);
        id.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        id.setForeground(Color.white);

        idAns = new JLabel() ;
        idAns.setBounds(220,140,150,25);
        idAns.setForeground(new Color(255, 184, 0));
        idAns.setFont(new Font("Tahoma",Font.PLAIN,16));



        number = new JLabel("Number :") ;
        number.setBounds(30,190,150,25);
        number.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        number.setForeground(Color.white);

        numberAns = new JLabel();
        numberAns.setBounds(220,190,150,25);
        numberAns.setFont(new Font("Tahoma",Font.PLAIN,16));
        numberAns.setForeground(new Color(255, 184, 0));



        name = new JLabel("Name :") ;
        name.setBounds(30,240,150,25);
        name.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        name.setForeground(Color.white);

        nameAns = new JLabel() ;
        nameAns.setBounds(220,240,150,25);
        nameAns.setForeground(new Color(255, 184, 0));
        nameAns.setFont(new Font("Tahoma",Font.PLAIN,16));



        gender = new JLabel("Gender :");
        gender.setBounds(30,290,150,25);
        gender.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        gender.setForeground(Color.white);

        genderAns = new JLabel();
        genderAns.setBounds(220,290,150,25);
        genderAns.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        genderAns.setForeground(new Color(255, 184, 0));



        country = new JLabel("Country :") ;
        country.setBounds(420,90,150,25);
        country.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        country.setForeground(Color.white);

        countryAns = new JLabel();
        countryAns.setBounds(640,90,150,25);
        countryAns.setForeground(new Color(255, 184, 0));
        countryAns.setFont(new Font("Tahoma" ,Font.PLAIN,16));



        address = new JLabel("Address :") ;
        address.setBounds(420,140,150,25);
        address.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        address.setForeground(Color.white);

        addressAns = new JLabel() ;
        addressAns.setBounds(640,140,150,25);
        addressAns.setForeground(new Color(255, 184, 0));
        addressAns.setFont(new Font("Tahoma" ,Font.PLAIN,16));



        phone = new JLabel("Phone :") ;
        phone.setBounds(420,190,150,25);
        phone.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        phone.setForeground(Color.white);

        phoneAns = new JLabel() ;
        phoneAns.setBounds(640,190,150,25) ;
        phoneAns.setForeground(new Color(255, 184, 0));
        phoneAns.setFont(new Font("Tahoma" ,Font.PLAIN,16));



        email = new JLabel("Email :") ;
        email.setBounds(420,240,150,25);
        email.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        email.setForeground(Color.white);

        emailAns = new JLabel() ;
        emailAns.setBounds(630,240,150,25);
        emailAns.setForeground(new Color(255, 184, 0));
        emailAns.setFont(new Font("Tahoma" ,Font.PLAIN,16));

        dltbtn = new JButton("Back" );
        dltbtn.setBounds(330,330,120,35);
        dltbtn.setBorder(BorderFactory.createLineBorder(Color.white));
        dltbtn.setBackground(new Color(3, 92, 92));
        dltbtn.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        dltbtn.setFocusPainted(false);
        dltbtn.setForeground(Color.white);
        dltbtn.addActionListener(this);


        try
        {
            Conn c = new Conn();
            String query = "select * from customer where username = '"+user+"'" ;
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next())
            {
                usernameAns.setText(rs.getString("username"));
                idAns.setText(rs.getString("id"));
                numberAns.setText(rs.getString("number"));
                nameAns.setText(rs.getString("name"));
                genderAns.setText(rs.getString("gender"));
                countryAns.setText(rs.getString("country"));
                addressAns.setText(rs.getString("address"));
                phoneAns.setText(rs.getString("phone"));
                emailAns.setText(rs.getString("email"));

            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        add(text) ;
        add(username);
        add(usernameAns);
        add(id);
        add(idAns);
        add(number);
        add(numberAns);
        add(name);
        add(nameAns);
        add(gender);
        add(genderAns) ;
        add(country) ;
        add(countryAns) ;
        add(address) ;
        add(addressAns) ;
        add(phone);
        add(phoneAns);
        add(email);
        add(emailAns);
        add(dltbtn) ;



        add(image1) ;
        add(image2) ;
        add(image3);
        add(image4) ;
        add(image5) ;
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == dltbtn) {
            try {
                Conn c = new Conn();
                c.s.executeUpdate("delete from account where username = '" + user + "'");
                c.s.executeUpdate("delete from customer where username = '" + user + "'");
                c.s.executeUpdate("delete from bookpackage where username = '" + user + "'");
                c.s.executeUpdate("delete from bookhotel where username = '" + user + "'");
                JOptionPane.showMessageDialog(null, "Data Deleted Successfuly");
                System.exit(0);

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }
    public static void main(String[] args)
    {
        new DeleteDetails(user) ;
    }
}

