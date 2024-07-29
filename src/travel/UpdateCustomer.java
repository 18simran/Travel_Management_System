package travel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateCustomer extends JFrame implements ActionListener
{
    static String user ;

    JLabel username,usernameAns, id,number,name,gender,country,address,phone,email,text;
    JTextField nameAns,numberTf,genderTF,idTF,countryTF, addressTf,phoneTF,emailTF ;
    JButton updatebtn, backbtn ;
    UpdateCustomer(String user)
    {
        this.user = user ;
        setBounds(400,180,850,550);
        getContentPane().setBackground(new Color(3, 102, 102));

        text  = new JLabel("Update Details");
        text.setFont(new Font("Times New Roman",Font.BOLD,30));
        text.setBounds(320,10,300,50);
        text.setForeground(Color.white);

        username = new JLabel("Username") ;
        username.setBounds(30,70,150,25);
        username.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        username.setForeground(Color.white);

        usernameAns = new JLabel() ;
        usernameAns.setBounds(220,70,150,25);
        usernameAns.setBackground(new Color(224, 245, 243));
        usernameAns.setForeground(new Color(255, 184, 0));
        usernameAns.setFont(new Font("Tahoma",Font.PLAIN,15));



        id  = new JLabel("ID") ;
        id.setBounds(30,110,150,25);
        id.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        id.setForeground(Color.white);

        idTF = new JTextField();
        idTF.setBounds(220,110,150,25);
        idTF.setBackground(new Color(224, 245, 243));



        number = new JLabel("Number") ;
        number.setBounds(30,150,150,25);
        number.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        number.setForeground(Color.white);

        numberTf = new JTextField();
        numberTf.setBounds(220,150,150,25);
        numberTf.setBackground(new Color(224, 245, 243));



        name = new JLabel("Name") ;
        name.setBounds(30,190,150,25);
        name.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        name.setForeground(Color.white);

        nameAns = new JTextField() ;
        nameAns.setBounds(220,190,150,25);
        nameAns.setFont(new Font("Tahoma",Font.PLAIN,15));




        gender = new JLabel("Gender");
        gender.setBounds(30,230,150,25);
        gender.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        gender.setForeground(Color.white);


        genderTF = new JTextField() ;
        genderTF.setBounds(220,230,150,25);
        genderTF.setFont(new Font("Tahoma",Font.PLAIN,15));
        genderTF.setBackground(new Color(224, 245, 243));




        country = new JLabel("Country") ;
        country.setBounds(30,270,150,25);
        country.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        country.setForeground(Color.white);

        countryTF = new JTextField();
        countryTF.setBounds(220,270,150,25);
        countryTF.setBackground(new Color(224, 245, 243));


        address = new JLabel("Address") ;
        address.setBounds(30,310,150,25);
        address.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        address.setForeground(Color.white);

        addressTf = new JTextField() ;
        addressTf.setBounds(220,310,150,25);
        addressTf.setBackground(new Color(224, 245, 243));


        phone = new JLabel("Phone") ;
        phone.setBounds(30,350,150,25);
        phone.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        phone.setForeground(Color.white);

        phoneTF = new JTextField() ;
        phoneTF.setBounds(220,350,150,25) ;
        phoneTF.setBackground(new Color(224, 245, 243));


        email = new JLabel("Email") ;
        email.setBounds(30,390,150,25);
        email.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        email.setForeground(Color.white);

        emailTF = new JTextField() ;
        emailTF.setBounds(220,390,150,25);
        emailTF.setBackground(new Color(224, 245, 243));


        updatebtn = new JButton("Update" );
        updatebtn.setBounds(70,450,100,30);
        updatebtn.setBackground(new Color(20, 116, 111));
        updatebtn.setBorder(BorderFactory.createLineBorder(Color.white));
        updatebtn.setForeground(Color.white);
        updatebtn.setFocusPainted(false);
        updatebtn.addActionListener(this);



        backbtn = new JButton("Back" );
        backbtn.setBounds(220,450,100,30);
        backbtn.setBorder(BorderFactory.createLineBorder(Color.white));
        backbtn.setBackground(new Color(20, 116, 111));
        backbtn.setFocusPainted(false);
        backbtn.setForeground(Color.white);
        backbtn.addActionListener(this);



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Update1.png"));
        Image i2 = i1.getImage().getScaledInstance(400,420,Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2) ;
        JLabel image = new JLabel(i3) ;
        image.setBounds(420,60,400,440);


        try {
            Conn c = new Conn() ;
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+user+"'");
            while (rs.next())
            {
                usernameAns.setText(rs.getString("username"));
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }


        add(username) ;
        add(usernameAns) ;
        add(number) ;
        add(numberTf);
        add(name) ;
        add(nameAns) ;
        add(gender);
        add(genderTF) ;
        add(id) ;
        add(idTF) ;
        add(country) ;
        add(countryTF) ;
        add(address) ;
        add(addressTf) ;
        add(phone) ;
        add(phoneTF) ;
        add(email) ;
        add(emailTF) ;
        add(updatebtn) ;
        add(backbtn);
        add(image) ;
        add(text) ;
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
      new UpdateCustomer(user) ;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource() == updatebtn)
       {
           String unamef = usernameAns.getText() ;
           String idf = idTF.getText();
           String numberf = numberTf.getText() ;
           String namef = nameAns.getText() ;
           String genderf = genderTF.getText() ;
           String countryf = countryTF.getText() ;
           String addressf = addressTf.getText() ;
           String phonef = phoneTF.getText() ;
           String emailf = emailTF.getText() ;

           try
           {
               Conn c = new Conn() ;
               String queryl = "update customer set username='"+unamef+"',id = '"+idf+"',number ='"+numberf+"', name = '"+namef+"',gender = '"+genderf+"',country = '"+countryf+"',address = '"+addressf+"',phone = '"+phonef+"',email = '"+emailf+"'" ;
               c.s.executeUpdate(queryl) ;
               JOptionPane.showMessageDialog(null,"Account Updated Successfully");
               setVisible(false);
           }
           catch (Exception ea)
           {
               ea.printStackTrace();
           }
       } else
       {
           new Dashboard(user);
           setVisible(false);
       }

       }

    }
