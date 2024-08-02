package travel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {
    JButton back ;
    static String user ;
    About(String user)
    {
        this.user = user ;
            setBounds(350,150,800,600);
        getContentPane().setBackground(new Color(230, 230, 250));



            JLabel l1 = new JLabel("ABOUT") ;
            l1.setBounds(350,10,300,40);
            l1.setForeground(new Color(0, 109, 111));
            l1.setFont(new Font("Tahoma",Font.BOLD,30));


           String  s = " About Projects                \n  "
                + "\nThe objective of the Travel and Tourism Management System"
                + "project is to develop a system that automates the processes "
                + "and activities of a travel and the purpose is to design a "
                + "system using which one can perform all operations related to "
                + "traveling.\n\n"
                + "This application will help in accessing the information related "
                + "to the travel to the particular destination with great ease. "
                + "The users can track the information related to their tours with "
                + "great ease through this application. The travel agency information "
                + "can also be obtained through this application.\n\n"
                + "Advantages of Project:"
                + "\nGives accurate information"
                + "\nSimplifies the manual work"
                + "\nIt minimizes the documentation related work"
                + "\nProvides up to date information"
                + "\nFriendly Environment by providing warning messages."
                + "\ntravelers details can be provided"
                + "\nbooking confirmation notification"
        ;

            TextArea area = new TextArea(s,10,40,Scrollbar.VERTICAL) ;
            area.setEditable(false);
            area.setFont(new Font("Tahoma",Font.PLAIN,19));
            area.setBounds(30,100,700,400);

            back = new JButton("Back" );
            back.setBounds(320,520,100,40);
            back.setBorder(BorderFactory.createLineBorder(Color.white));
            back.setBackground(new Color(20, 116, 111));
            back.setFocusPainted(false);
            back.setForeground(Color.white);
            back.addActionListener(this);

            add(back) ;
            add(area) ;
            add(l1) ;
            setLayout(null);
            setBackground(Color.white);
            setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == back)
        {
            new Dashboard(" ") ;
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new About(user) ;
    }
}
