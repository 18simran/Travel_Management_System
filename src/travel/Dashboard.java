package travel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Dashboard  extends JFrame implements ActionListener
{
    static String username ;
    JButton addPersonalDetails,updatePersonalDetails,viewDetails,checkPackage,bookPackage;
    Dashboard(String username)
    {
        this.username = username ;
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/Dashboard.jpg"));
        Image originalImage = i1.getImage();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Image scaledImage = originalImage.getScaledInstance(screenSize.width, screenSize.height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setBounds(0, 0, screenSize.width, screenSize.height);



        //panel 1
        JPanel p1 = new JPanel() ;
        p1.setBackground(new Color(0, 41, 41));
        p1.setBounds(0,0,1600,70);

        ImageIcon icon1  = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        Image icon2 = icon1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT) ;
        ImageIcon icon3 = new ImageIcon(icon2) ;
        JLabel image = new JLabel(icon3) ;
        image.setBounds(5,0,80,80);


        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));


        //panel2
        JPanel p2 = new JPanel();
        p2.setBackground(new Color(0, 41, 41));
        p2.setBounds(0,70,350, screenSize.height);


        addPersonalDetails = new JButton("Add Personal Details") ;
        addPersonalDetails.setBounds(0,0,350,50);
        addPersonalDetails.setBackground(new Color(0, 41, 41));
        addPersonalDetails.setForeground(Color.white);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN, 19));
        addPersonalDetails.setMargin(new Insets(0,0,0,70));
        addPersonalDetails.setFocusPainted(false);
        addPersonalDetails.addActionListener(this);


        updatePersonalDetails = new JButton("Update Personal Details") ;
       updatePersonalDetails.setBounds(0,50,350,50);
       updatePersonalDetails.setBackground(new Color(0, 41, 41));
       updatePersonalDetails.setForeground(Color.white);
       updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN, 19));
       updatePersonalDetails.setMargin(new Insets(0,0,0,40));
       updatePersonalDetails.setFocusPainted(false);
       updatePersonalDetails.addActionListener(this);


       viewDetails = new JButton("View Details") ;
        viewDetails.setBounds(0,100,350,50);
        viewDetails.setBackground(new Color(0, 41, 41));
        viewDetails.setForeground(Color.white);
        viewDetails.setFont(new Font("Tahoma",Font.PLAIN, 19));
        viewDetails.setMargin(new Insets(0,0,0,140));
        viewDetails.setFocusPainted(false);
        viewDetails.addActionListener(this);


        JButton deletePersonalDetails = new JButton("Delete Personal Details") ;
        deletePersonalDetails.setBounds(0,150,350,50);
        deletePersonalDetails.setBackground(new Color(0, 41, 41));
        deletePersonalDetails.setForeground(Color.white);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN, 19));
        deletePersonalDetails.setMargin(new Insets(0,0,0,50));
        deletePersonalDetails.setFocusPainted(false);


        checkPackage = new JButton("Check Package") ;
        checkPackage.setBounds(0,200,350,50);
        checkPackage.setBackground(new Color(0, 41, 41));
        checkPackage.setForeground(Color.white);
        checkPackage.setFont(new Font("Tahoma",Font.PLAIN, 19));
        checkPackage.setMargin(new Insets(0,0,0,120));
        checkPackage.setFocusPainted(false);
        checkPackage.addActionListener(this);



        bookPackage = new JButton("Book Package") ;
        bookPackage.setBounds(0,250,350,50);
        bookPackage.setBackground(new Color(0, 41, 41));
        bookPackage.setForeground(Color.white);
        bookPackage.setFont(new Font("Tahoma",Font.PLAIN, 19)) ;
        bookPackage.setMargin(new Insets(0,0,0,120));
        bookPackage.setFocusPainted(false);
        bookPackage.addActionListener(this);


        JButton viewPackage = new JButton("View Package") ;
        viewPackage.setBounds(0,300,350,50);
        viewPackage.setBackground(new Color(0, 41, 41));
        viewPackage.setForeground(Color.white);
        viewPackage.setFont(new Font("Tahoma",Font.PLAIN, 19));
        viewPackage.setMargin(new Insets(0,0,0,120));
        viewPackage.setFocusPainted(false);

        JButton viewHotels = new JButton("View Hotels") ;
        viewHotels.setBounds(0,350,350,55);
        viewHotels.setBackground(new Color(0, 41, 41));
        viewHotels.setForeground(Color.white);
        viewHotels.setFont(new Font("Tahoma",Font.PLAIN, 19));
        viewHotels.setMargin(new Insets(0,0,0,140));
        viewHotels.setFocusPainted(false);


        JButton bookHotel = new JButton("Book Hotel") ;
        bookHotel.setBounds(0,405,350,55);
        bookHotel.setBackground(new Color(0, 41, 41));
        bookHotel.setForeground(Color.white);
        bookHotel.setFont(new Font("Tahoma",Font.PLAIN, 19));
        bookHotel.setMargin(new Insets(0,0,0,150));
        bookHotel.setFocusPainted(false);


        JButton viewBookedHotels = new JButton("View Booked Hotels") ;
        viewBookedHotels.setBounds(0,460,350,55);
        viewBookedHotels.setBackground(new Color(0, 41, 41));
        viewBookedHotels.setForeground(Color.white);
        viewBookedHotels.setFont(new Font("Tahoma",Font.PLAIN, 19));
        viewBookedHotels.setMargin(new Insets(0,0,0,80));
        viewBookedHotels.setFocusPainted(false);


        JButton destinations = new JButton("Destinations") ;
        destinations.setBounds(0,510,350,55);
        destinations.setBackground(new Color(0, 41, 41));
        destinations.setForeground(Color.white);
        destinations.setFont(new Font("Tahoma",Font.PLAIN, 19));
        destinations.setMargin(new Insets(0,0,0,140));
        destinations.setFocusPainted(false);


        JButton payments = new JButton("Payments") ;
        payments.setBounds(0,560,350,55);
        payments.setBackground(new Color(0, 41, 41));
        payments.setForeground(Color.white);
        payments.setFont(new Font("Tahoma",Font.PLAIN, 19));
        payments.setMargin(new Insets(0,0,0,150));
        payments.setFocusPainted(false);



        JButton notepad = new JButton("Notepad") ;
        notepad.setBounds(0,610,350,55);
        notepad.setBackground(new Color(0, 41, 41));
        notepad.setForeground(Color.white);
        notepad.setFont(new Font("Tahoma",Font.PLAIN, 19));
        notepad.setMargin(new Insets(0,0,0,160));
        notepad.setFocusPainted(false);




        JButton about = new JButton("About") ;
        about.setBounds(0,665,350,55);
        about.setBackground(new Color(0, 41, 41));
        about.setForeground(Color.white);
        about.setFont(new Font("Tahoma",Font.PLAIN, 19));
        about.setMargin(new Insets(0,0,0,180));
        about.setFocusPainted(false);



       JLabel text= new JLabel("Welcome!") ;
       text.setBounds(900,200,200,70);
       text.setFont(new Font("Tahoma",Font.BOLD,30));
       text.setForeground(Color.white);









        add(p1) ;
        add(p2) ;
//        add(text) ;
        add(imageLabel);
        p1.add(heading) ;
        p1.add(image);
        p2.add(addPersonalDetails);
        p2.add(updatePersonalDetails) ;
        p2.add(viewDetails);
        p2.add(deletePersonalDetails);
        p2.add(checkPackage);
        p2.add(bookPackage) ;
        p2.add(viewPackage) ;
        p2.add(viewHotels);
        p2.add(bookHotel) ;
        p2.add(viewBookedHotels);
        p2.add(destinations);
        p2.add(payments);
        p2.add(notepad);
        p2.add(about) ;




        p1.setLayout(null);
        p2.setLayout(null);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {

        new Dashboard(username) ;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if( e.getSource() == addPersonalDetails)
        {
          new AddCustomer(username);
          setVisible(false);
        }
        else if (e.getSource() == viewDetails)
        {
           new ViewCustomer(username);
           setVisible(false);
        } else if (e.getSource() == updatePersonalDetails)
        {
            new UpdateCustomer(username) ;
            setVisible(false);
        } else if (e.getSource() == checkPackage)
        {
            new CheckPackage() ;
            setVisible(false);
        } else if (e.getSource() == bookPackage )
        {
            new BookPackage(username) ;
            setVisible(false);
        }

    }
}
