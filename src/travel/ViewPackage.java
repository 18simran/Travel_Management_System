package travel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewPackage extends  JFrame implements ActionListener
{
    JLabel text,box, username,usernameAns,selectPackage,totalPersons,totalPersonsTF,id,idAns,number , numberAns,phone,phoneAns,totalPrice, totalPriceAns ;
    JButton backbtn ;
    static String user  ;
    ViewPackage(String user)
    {
        this.user = user ;
        setBounds(250,150,1000,600);
        getContentPane().setBackground(new Color(230, 230, 250));
        text = new JLabel("View  Package");
        text.setBounds(100,10,300,40);
        text.setForeground(new Color(0, 109, 111));
        text.setFont(new Font("Tahoma",Font.BOLD,30));


        username = new JLabel("Username : ") ;
        username.setBounds(30,90,150,25);
        username.setFont(new Font("Poppins" ,Font.BOLD,16));
        username.setForeground(new Color(91, 50, 86));

        usernameAns = new JLabel() ;
        usernameAns.setBounds(250,90,150,25);
        usernameAns.setFont(new Font("Poppins",Font.PLAIN,16));

        selectPackage = new JLabel("Select Package : ") ;
        selectPackage.setBounds(30,140,150,25);
        selectPackage.setFont(new Font("Poppins" ,Font.BOLD,16));
        selectPackage.setForeground(new Color(91, 50, 86));

        box = new JLabel() ;
        box.setBounds(240,140,170, 23);
        box.setFont(new Font("Poppins" ,Font.PLAIN,16));
        box.setBackground(new Color(230, 230, 250));



        totalPersons = new JLabel("Total Persons : ") ;
        totalPersons.setBounds(30,190,300,25);
        totalPersons.setFont(new Font("Poppins",Font.BOLD,16));
        totalPersons.setForeground(new Color(91, 50, 86));

        totalPersonsTF = new JLabel() ;
        totalPersonsTF.setBounds(260,190,180,25);
        totalPersonsTF.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        totalPersonsTF.setFont(new Font("Poppins",Font.PLAIN,18));


        id  = new JLabel("ID :") ;
        id.setBounds(30,240,150,25);
        id.setFont(new Font("Poppins" ,Font.BOLD,16));
        id.setForeground(new Color(91, 50, 86));

        idAns  = new JLabel() ;
        idAns.setBounds(250,240,150,25);
        idAns.setFont(new Font("Tahoma" ,Font.PLAIN,16));



        number = new JLabel("Number :") ;
        number.setBounds(30,290,150,25);
        number.setFont(new Font("Poppins" ,Font.BOLD,16));
        number.setForeground(new Color(91, 50, 86));

        numberAns = new JLabel() ;
        numberAns.setBounds(250,290,150,25);
        numberAns.setFont(new Font("Poppins",Font.PLAIN,15));


        phone = new JLabel("Phone : ") ;
        phone.setBounds(30,340,150,25);
        phone.setFont(new Font("Poppins" ,Font.BOLD,16));
        phone.setForeground(new Color(91, 50, 86));

        phoneAns = new JLabel() ;
        phoneAns.setBounds(250,340,150,25);
        phoneAns.setFont(new Font("Poppins",Font.PLAIN,15));


        totalPrice = new JLabel("Total Price :") ;
        totalPrice.setBounds(30,390,150,25);
        totalPrice.setFont(new Font("Poppins" ,Font.BOLD,16));
        totalPrice.setForeground(new Color(91, 50, 86));

        totalPriceAns = new JLabel() ;
        totalPriceAns.setBounds(250,390,150,25);
        totalPriceAns.setFont(new Font("Poppins",Font.PLAIN,15));



        backbtn = new JButton("Back" );
        backbtn.setBounds(160,450,100,40);
        backbtn.setBorder(BorderFactory.createLineBorder(Color.black));
        backbtn.setBackground(new Color(20, 116, 111));
        backbtn.setFocusPainted(false);
        backbtn.setForeground(Color.white);
        backbtn.addActionListener(this);



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,380,Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2) ;
        JLabel image = new JLabel(i3) ;
        image.setBounds(450 ,80,500,380);


        try{
            Conn c = new Conn() ;
            String query = "select * from bookpackage where username = '"+user+"'" ;
            ResultSet rs = c.s.executeQuery(query) ;
            while(rs.next())
            {
                usernameAns.setText(rs.getString("Username"));
                box.setText(rs.getString("Package"));
                totalPersonsTF.setText(rs.getString("Total_Persons"));
                idAns.setText(rs.getString("Id"));
                numberAns.setText(rs.getString("Number"));
                phoneAns.setText(rs.getString("Phone"));
                totalPriceAns.setText(rs.getString("Total_Price"));
            }


        }catch (Exception ae)
        {
            ae.printStackTrace();
        }

        add(text) ;
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
        add(backbtn) ;
        add(image) ;
        setLayout(null);
        setVisible(true);
     }

    @Override
    public void actionPerformed(ActionEvent e)
    {
if (e.getSource() == backbtn)
{
    new Dashboard(user) ;
    setVisible(false);
}
    }
    public static void main(String[] args)
    {
        new ViewPackage(user) ;
    }
}
