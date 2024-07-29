package travel;
import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame {
    CheckPackage() {
        setBounds(350, 150, 900, 600);
        String[] package1 = {"GOLD PACKAGE","6 Days and 7 Nights","Airport Assistance","Half Day City Tour","Daily  Buffet","Soft Drinks Free","Full Day3 Island Cruise","English Speaking Guide","Book Package","Rs 50000/-","package1.jpg"} ;
        String[] package2 = {"SILVER PACKAGE","5 Day and 6 Nights","Entrance Free Tickets","Greet at Airport","Welcome Drinks on Arrival","Night Safari","Cruise with Dinner","Movie Tickets","Book Now","Rs 32000/- ","package2.jpg"};
        String[] package3 = {"BRONZE PACKAGE","6 Days and 5 Nights","Return Airfare","Free Clubbing","Horse Riding and Other Games","Hard Drinks Face","Daily Buffet","BBQ Dinners","Book Now","Rs 24000/-","package3.jpg"} ;


        JTabbedPane tab = new JTabbedPane() ;
        JPanel p1 = createPackage1(package1);
        tab.addTab("Package 1", null, p1);
        JPanel p2 =createPackage1(package2) ;
        tab.addTab("Package2",null,p2);
        JPanel p3 = createPackage1(package3);
        tab.addTab("Package3",null,p3);




        add(tab) ;
        setVisible(true);
    }

    public JPanel createPackage1(String[] pack)
    {
        JPanel p1 = new JPanel();
        p1.setBounds(450, 200, 900, 600);

        JPanel p2 =new JPanel()  ;
        p2.setBounds(50,60,350,400);

        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(40,10,300,40);
        l1.setForeground(new Color(255, 196, 12));
        l1.setFont(new Font("Tahoma",Font.BOLD,30));


        JLabel l2 = new JLabel(pack[1]);
        l2.setBounds(20,70,300,30);
        l2.setForeground(new Color(128, 70, 27));
        l2.setFont(new Font("Tahoma",Font.BOLD,20));


        JLabel l3 = new JLabel(pack[2]);
        l3.setBounds(20,100,300,30);
        l3.setForeground(new Color(0, 73, 83));
        l3.setFont(new Font("Tahoma",Font.BOLD,20));

        JLabel l4 = new JLabel(pack[3]);
        l4.setBounds(20,130,300,30);
        l4.setForeground(new Color(0, 71, 171));
        l4.setFont(new Font("Tahoma",Font.BOLD,20));

        JLabel l5 = new JLabel(pack[4]);
        l5.setBounds(20,160,300,30);
        l5.setForeground(new Color(181, 51, 137));
        l5.setFont(new Font("Tahoma",Font.BOLD,20));

        JLabel l6 = new JLabel(pack[5]);
        l6.setBounds(20,190,300,30);
        l6.setForeground(new Color(64, 130, 109));
        l6.setFont(new Font("Tahoma",Font.BOLD,20));

        JLabel l7 = new JLabel(pack[6]);
        l7.setBounds(20,220,300,30);
        l7.setForeground(new Color(103, 76, 71));
        l7.setFont(new Font("Tahoma",Font.BOLD,20));

        JLabel l8 = new JLabel(pack[7]);
        l8.setBounds(20,250,300,30);
        l8.setForeground(new Color(202, 31, 123));
        l8.setFont(new Font("Tahoma",Font.BOLD,20));

        JLabel l9 = new JLabel(pack[8]);
        l9.setBounds(50,300,300,40);
        l9.setForeground(new Color(165, 0, 33));
        l9.setFont(new Font("Tahoma",Font.BOLD,30));

        JLabel l10 = new JLabel(pack[9]);
        l10.setBounds(230,370,300,30);
        l10.setForeground(new Color(153, 102, 204));
        l10.setFont(new Font("Tahoma",Font.BOLD,20));









        ImageIcon icon1  = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[10]+""));
        Image icon2 = icon1.getImage().getScaledInstance(900,600,Image.SCALE_DEFAULT) ;
        ImageIcon icon3 = new ImageIcon(icon2) ;
        JLabel image = new JLabel(icon3) ;
        image.setBounds(0, 0, 900, 600);



        p2.add(l1) ;
        p2.add(l2) ;
        p2.add(l3);
        p2.add(l4);
        p2.add(l5);
        p2.add(l6);
        p2.add(l7);
        p2.add(l8);
        p2.add(l9) ;
        p2.add(l10) ;

        p1.add(p2) ;
        p1.add(image);
        p2.setLayout(null);
        p1.setLayout(null);
        return p1 ;
    }
    public static void main(String[] args)
    {

        new CheckPackage() ;
    }
}
