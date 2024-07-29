package travel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class AddCustomer extends JFrame implements ActionListener
{
static String user ;
    JLabel username,usernameAns,nameAns, id,number,name,gender,country,address,phone,email ;
    JTextField numberTf,countryTF, addressTf,phoneTF,emailTF ;
    JRadioButton genderMale,genderFemale,genderOthers;
    JButton addbtn, backbtn ;
    JComboBox box ;
    AddCustomer(String user) {
        this.user = user ;
         setBounds(400,180,850,550);
         getContentPane().setBackground(new Color(3, 102, 102));

         username = new JLabel("Username") ;
         username.setBounds(30,50,150,25);
         username.setFont(new Font("Tahoma" ,Font.PLAIN,16));
         username.setForeground(Color.white);

         usernameAns = new JLabel() ;
        usernameAns.setBounds(220,50,150,25);
        usernameAns.setBackground(new Color(224, 245, 243));
        usernameAns.setForeground(new Color(255, 184, 0));
        usernameAns.setFont(new Font("Tahoma",Font.PLAIN,15));



         id  = new JLabel("ID") ;
         id.setBounds(30,90,150,25);
         id.setFont(new Font("Tahoma" ,Font.PLAIN,16));
         id.setForeground(Color.white);



         box  = new JComboBox(new String[] {"Passport","Adhaar Card","PAN Card","Ration Card"}) ;
         box.setBounds(220,90,150, 25);
         box.setBackground(new Color(224, 245, 243));
         box.setFont(new Font("Tahoma" ,Font.PLAIN,16));


         number = new JLabel("Number") ;
         number.setBounds(30,130,150,25);
         number.setFont(new Font("Tahoma" ,Font.PLAIN,16));
         number.setForeground(Color.white);


         numberTf = new JTextField();
         numberTf.setBounds(220,130,150,25);
         numberTf.setBackground(new Color(224, 245, 243));

         name = new JLabel("Name") ;
         name.setBounds(30,170,150,25);
         name.setFont(new Font("Tahoma" ,Font.PLAIN,16));
         name.setForeground(Color.white);


         nameAns = new JLabel() ;
        nameAns.setBounds(220,170,150,25);
        nameAns.setForeground(new Color(255, 184, 0));
        nameAns.setFont(new Font("Tahoma",Font.PLAIN,15));


         gender = new JLabel("Gender");
         gender.setBounds(30,210,150,25);
         gender.setFont(new Font("Tahoma" ,Font.PLAIN,16));
         gender.setForeground(Color.white);

         genderMale = new JRadioButton("Male") ;
         genderMale.setBounds(180,210,70,25);
         genderMale.setBackground(new Color(3, 102, 102));
         genderMale.setForeground(Color.white);
         genderMale.setFont(new Font("Tahoma" ,Font.BOLD,12));

         genderFemale = new JRadioButton("Female") ;
         genderFemale.setBounds(250,210,70,25);
         genderFemale.setBackground(new Color(3, 102, 102));
         genderFemale.setForeground(Color.white);
        genderFemale.setFont(new Font("Tahoma" ,Font.BOLD,12));


         genderOthers = new JRadioButton("Others") ;
         genderOthers.setBounds(320,210,70,25);
         genderOthers.setBackground(new Color(3, 102, 102));
         genderOthers.setForeground(Color.white);
        genderOthers.setFont(new Font("Tahoma" ,Font.BOLD,12));

         ButtonGroup bg = new ButtonGroup() ;


         country = new JLabel("Country") ;
         country.setBounds(30,250,150,25);
         country.setFont(new Font("Tahoma" ,Font.PLAIN,16));
         country.setForeground(Color.white);

         countryTF = new JTextField();
         countryTF.setBounds(220,250,150,25);
        countryTF.setBackground(new Color(224, 245, 243));


        address = new JLabel("Address") ;
         address.setBounds(30,290,150,25);
         address.setFont(new Font("Tahoma" ,Font.PLAIN,16));
         address.setForeground(Color.white);

         addressTf = new JTextField() ;
         addressTf.setBounds(220,290,150,25);
         addressTf.setBackground(new Color(224, 245, 243));


        phone = new JLabel("Phone") ;
        phone.setBounds(30,330,150,25);
        phone.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        phone.setForeground(Color.white);

        phoneTF = new JTextField() ;
        phoneTF.setBounds(220,330,150,25) ;
        phoneTF.setBackground(new Color(224, 245, 243));


        email = new JLabel("Email") ;
        email.setBounds(30,370,150,25);
        email.setFont(new Font("Tahoma" ,Font.PLAIN,16));
        email.setForeground(Color.white);

        emailTF = new JTextField() ;
        emailTF.setBounds(220,370,150,25);
        emailTF.setBackground(new Color(224, 245, 243));


        addbtn = new JButton("Add" );
        addbtn.setBounds(70,430,100,30);
        addbtn.setBackground(new Color(20, 116, 111));
        addbtn.setBorder(BorderFactory.createLineBorder(Color.white));
        addbtn.setForeground(Color.white);
        addbtn.setFocusPainted(false);
        addbtn.addActionListener(this);


        backbtn = new JButton("Back" );
        backbtn.setBounds(220,430,100,30);
        backbtn.setBorder(BorderFactory.createLineBorder(Color.white));
        backbtn.setBackground(new Color(20, 116, 111));
        backbtn.setFocusPainted(false);
        backbtn.setForeground(Color.white);
        backbtn.addActionListener(this);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/AddCustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,500,Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2) ;
        JLabel image = new JLabel(i3) ;
        image.setBounds(400,40,400,420);

         add(id) ;
         add(username) ;

         add(box) ;
         add(number) ;
         add(numberTf);
         add(name) ;

         add(gender);
         add(genderMale) ;
         add(genderFemale) ;
         add(genderOthers) ;
         bg.add(genderFemale);
         bg.add(genderMale);
         bg.add(genderOthers);
         add(country) ;
         add(countryTF) ;
         add(address) ;
         add(addressTf) ;
         add(phone) ;
         add(phoneTF) ;
         add(email) ;
         add(emailTF) ;
         add(addbtn) ;
         add(backbtn);
         add(image) ;
        try{
            Conn c = new Conn() ;
            String query  = "select * from account where username = '"+user+"'" ;
            ResultSet rs = c.s.executeQuery(query) ;
            while (rs.next())
            {
                usernameAns.setText(rs.getString("username"));

                nameAns.setText(rs.getString("name"));

            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        add(usernameAns);
        add(nameAns);

         setLayout(null);
         setVisible(true);
    }

    public static void main(String[] args)

    {
        new AddCustomer(user) ;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addbtn)
        {
            String unamef = usernameAns.getText() ;
            String idf = (String)box.getSelectedItem() ;
            String numberf = numberTf.getText() ;
            String namef = nameAns.getText() ;
            String genderf = null ;
            if(genderMale.isSelected())
            {
                genderf = "Male" ;
            }
            else if(genderFemale.isSelected())
            {
                genderf = "Female" ;
            }
            else{
                genderf = "Other" ;
            }
            String countryf = countryTF.getText() ;
            String addressf = addressTf.getText() ;
            String phonef = phoneTF.getText() ;
            String emailf = emailTF.getText() ;

            try {
                Conn c = new Conn() ;
                String queryl = "insert into customer values('"+unamef+"','"+idf+"','"+numberf+"','"+namef+"','"+genderf+"','"+countryf+"','"+addressf+"','"+phonef+"','"+emailf+"')" ;
                c.s.executeUpdate(queryl) ;
                JOptionPane.showMessageDialog(null,"Account Created Successfully");
                setVisible(false);
            }
            catch (Exception ea)
            {
                ea.printStackTrace();
            }
        }
        else{
            new Dashboard(user) ;
            setVisible(false);
        }
        }
    }

