package travel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewBookedHotel extends JFrame implements ActionListener
{
    JLabel text ,username, usernameAns ,hotel,hotelAns,totalPersons,totalpersonAns,days,daysAns,roomtype,roomtypeAns,food,foodAns,id,idAns,number,numberAns,phone,phoneAns,totalPrice,totalPriceAns;
    JButton back;
    static String user ;
    ViewBookedHotel(String user)
        {
            setBounds(250,150,1000,600);
            getContentPane().setBackground(new Color(230, 230, 250));


            this.user = user ;
            setBounds(250,150,1000,600);
            getContentPane().setBackground(new Color(230, 230, 250));


            text = new JLabel("View Booked Hotel Details");
            text.setBounds(100,10,500,40);
            text.setForeground(new Color(0, 109, 111));
            text.setFont(new Font("Tahoma",Font.BOLD,30));



            username = new JLabel("Username : ") ;
            username.setBounds(30,90,150,25);
            username.setFont(new Font("Poppins" ,Font.PLAIN,16));
            username.setForeground(new Color(91, 50, 86));

            usernameAns = new JLabel() ;
            usernameAns.setBounds(250,90,150,25);
            usernameAns.setFont(new Font("Poppins",Font.PLAIN,16));

            hotel = new JLabel("Hotel Name : ") ;
            hotel.setBounds(30,130,150,25);
            hotel.setFont(new Font("Poppins" ,Font.PLAIN,16));
            hotel.setForeground(new Color(91, 50, 86));

            hotelAns = new JLabel() ;
            hotelAns.setBounds(220,130,170, 23);
            hotelAns.setFont(new Font("Poppins" ,Font.PLAIN,15));
            hotelAns.setBackground(new Color(230, 230, 250));


            totalPersons = new JLabel("Total Persons : ") ;
            totalPersons.setBounds(30,170,300,25);
            totalPersons.setFont(new Font("Poppins",Font.PLAIN,16));
            totalPersons.setForeground(new Color(91, 50, 86));

            totalpersonAns = new JLabel() ;
            totalpersonAns.setBounds(270,170,180,25);
            totalpersonAns.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
            totalpersonAns.setFont(new Font("Poppins",Font.PLAIN,18));


            days = new JLabel("Total Days : ") ;
            days.setBounds(30,210,300,25);
            days.setFont(new Font("Poppins",Font.PLAIN,16));
            days.setForeground(new Color(91, 50, 86));

            daysAns = new JLabel() ;
            daysAns.setBounds(270,210,180,25);
            daysAns.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
            daysAns.setFont(new Font("Poppins",Font.PLAIN,18));


            roomtype = new JLabel("AC/ Non-AC : ") ;
            roomtype.setBounds(30,250,150,25);
            roomtype.setFont(new Font("Poppins" ,Font.PLAIN,16));
            roomtype.setForeground(new Color(91, 50, 86));

            roomtypeAns = new JLabel() ;
            roomtypeAns.setBounds(270,250,170, 23);
            roomtypeAns.setBackground(new Color(230, 230, 250));
            roomtypeAns.setFont(new Font("Poppins" ,Font.PLAIN,15));



            food = new JLabel("Food Included ? :") ;
            food.setBounds(30,290,150,25);
            food.setFont(new Font("Poppins" ,Font.PLAIN,16));
            food.setForeground(new Color(91, 50, 86));

            foodAns = new JLabel() ;
            foodAns.setBounds(270,290,170, 23);
            foodAns.setFont(new Font("Poppins" ,Font.PLAIN,15));
            foodAns.setBackground(new Color(230, 230, 250));


            id  = new JLabel("ID : ") ;
            id.setBounds(30,330,150,25);
            id.setFont(new Font("Poppins" ,Font.PLAIN,16));
            id.setForeground(new Color(91, 50, 86));

            idAns  = new JLabel() ;
            idAns.setBounds(250,330,150,25);
            idAns.setFont(new Font("Tahoma" ,Font.PLAIN,16));



            number = new JLabel("Number : ") ;
            number.setBounds(30,370,150,25);
            number.setFont(new Font("Poppins" ,Font.PLAIN,16));
            number.setForeground(new Color(91, 50, 86));

            numberAns = new JLabel() ;
            numberAns.setBounds(250,370,150,25);
            numberAns.setFont(new Font("Poppins",Font.PLAIN,15));


            phone = new JLabel("Phone : ") ;
            phone.setBounds(30,410,150,25);
            phone.setFont(new Font("Poppins" ,Font.PLAIN,16));
            phone.setForeground(new Color(91, 50, 86));

            phoneAns = new JLabel() ;
            phoneAns.setBounds(250,410,150,25);
            phoneAns.setFont(new Font("Poppins",Font.PLAIN,15));

            totalPrice = new JLabel("Total Cost : ") ;
            totalPrice.setBounds(30,450,150,25);
            totalPrice.setFont(new Font("Poppins" ,Font.PLAIN,16));
            totalPrice.setForeground(new Color(91, 50, 86));

            totalPriceAns = new JLabel() ;
            totalPriceAns.setBounds(250,450,150,25);
            totalPriceAns.setFont(new Font("Poppins",Font.PLAIN,15));

            back = new JButton("Back" );
            back.setBounds(150,490,100,40);
            back.setBorder(BorderFactory.createLineBorder(Color.white));
            back.setBackground(new Color(20, 116, 111));
            back.setFocusPainted(false);
            back.setForeground(Color.white);
            back.addActionListener(this);


            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/hotel2.jpg"));
            Image i2 = i1.getImage().getScaledInstance(500,380,Image.SCALE_SMOOTH);
            ImageIcon i3 = new ImageIcon(i2) ;
            JLabel image = new JLabel(i3) ;
            image.setBounds(450 ,60,500,380);

            try{
                Conn c = new Conn() ;
                String query = "select * from bookhotel where username = '"+user+"'";
                ResultSet rs =  c.s.executeQuery(query) ;
                while (rs.next() )
                {
                    usernameAns.setText(rs.getString("Username"));
                    hotelAns.setText(rs.getString("SelectedHotel"));
                    totalpersonAns.setText(rs.getString("TotalPersons"));
                    daysAns.setText(rs.getString("Days"));
                    idAns.setText(rs.getString("Id"));
                    numberAns.setText(rs.getString("Number"));
                    phoneAns.setText(rs.getString("Phone"));
                    totalPriceAns.setText(rs.getString("Total_Price"));
                    roomtypeAns.setText(rs.getString("AC"));
                    foodAns.setText(rs.getString("Food"));



                }

            }catch (Exception ae)
            {
                ae.printStackTrace();
            }


            add(text) ;
            add(username);
            add(usernameAns);
            add(hotel);
            add(hotelAns) ;
            add(totalPersons) ;
            add(totalpersonAns);
            add(days);
            add(daysAns) ;
            add(roomtype);
            add(roomtypeAns) ;
            add(food);
            add(foodAns) ;
            add(id) ;
            add(idAns) ;
            add(number) ;
            add(numberAns) ;
            add(phone) ;
            add(phoneAns) ;
            add(totalPrice) ;
            add(totalPriceAns) ;
            add(back) ;
            add(image) ;
            setLayout(null);
            setVisible(true);

        }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == back)
        {
            new Dashboard(user);
            setVisible(false);
        }

    }
    public static void main(String[] args)
    {
        new ViewBookedHotel(user) ;
    }
}
