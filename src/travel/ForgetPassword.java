package travel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ForgetPassword extends JFrame implements ActionListener {
    JLabel username,name,securityQn,answer,password ;
    JTextField usernameTF,nameTF ,securityQnTf,answerTF,passwordTf;
    JButton search,retrieve,back ;
    ForgetPassword()
    {
        setBounds(350,200,850,380);
        getContentPane().setBackground(Color.white);

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/ForgetPassword.jpg")) ;
        Image i2 = i1.getImage().getScaledInstance(300,300,Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3) ;
        image.setBounds(550,20,300,300);


        JPanel p1 = new JPanel() ;
        p1.setBounds(30,30,500,280);
        p1.setBackground(new Color(115, 187, 176));

        username = new JLabel("Username");
        username.setBounds(40,20,100,25);
        username.setFont(new Font("Tahoma",Font.BOLD,15));


        usernameTF  = new JTextField();
        usernameTF.setBounds(220,20,150,25);
        usernameTF.setBorder(BorderFactory.createEmptyBorder());



        name = new JLabel("Name");
        name.setBounds(40,65,100,25);
        name.setFont(new Font("Tahoma",Font.BOLD,15));


        nameTF  = new JTextField();
        nameTF.setBounds(220,65,150,25);
        nameTF.setBorder(BorderFactory.createEmptyBorder());


        securityQn = new JLabel("Security Question");
        securityQn.setBounds(40,110,150,25);
        securityQn.setFont(new Font("Tahoma",Font.BOLD,15));


        securityQnTf  = new JTextField();
        securityQnTf.setBounds(220,110,150,25);
        securityQnTf.setBorder(BorderFactory.createEmptyBorder());

        answer =new JLabel("Answer");
        answer.setBounds(40,160,100,25);
        answer.setFont(new Font("Tahoma",Font.BOLD,15));


        answerTF  = new JTextField();
        answerTF.setBounds(220,160,150,25);
        answerTF.setBorder(BorderFactory.createEmptyBorder());


        password =new JLabel("Password");
        password.setBounds(40,210,100,25);
        password.setFont(new Font("Tahoma",Font.BOLD,15));


        passwordTf  = new JTextField();
        passwordTf.setBounds(220,210,150,25);
        passwordTf.setBorder(BorderFactory.createEmptyBorder());

        search = new JButton("Search") ;
        search.setBackground(new Color(9, 153, 115));
        search.setForeground(Color.white);
        search.setBounds(380,20,100,27);
        search.setBorder(new LineBorder(Color.white));
        search.setFont(new Font("Tahoma",Font.BOLD,15));
        search.setFocusPainted(false);
        search.addActionListener(this);

        retrieve = new JButton("Retrieve") ;
        retrieve.setBackground(new Color(9, 153, 115));
        retrieve.setForeground(Color.white);
        retrieve.setFont(new Font("Tahoma",Font.BOLD,15));
        retrieve.setBounds(380,170,100,27);
        retrieve.setBorder(new LineBorder(Color.white));
        retrieve.setFocusPainted(false);
        retrieve.addActionListener(this);


        back = new JButton("Back") ;
        back.setBackground(new Color(9, 153, 115));
        back.setForeground(Color.white);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.setBounds(180,250,100,27);
        back.setBorder(new LineBorder(Color.white));
        back.setFocusPainted(false);
        back.addActionListener(this);



        p1.setLayout(null);
        add(p1) ;
        add(image) ;
        p1.add(username) ;
        p1.add(usernameTF) ;
        p1.add(search) ;
        p1.add(name) ;
        p1.add(nameTF) ;
        p1.add(securityQn);
        p1.add(securityQnTf) ;
        p1.add(answer);
        p1.add(answerTF) ;
        p1.add(retrieve);
        p1.add(password);
        p1.add(passwordTf) ;
        p1.add(back);
        setLayout(null);
        setVisible(true);






    }

    public static void main(String[] args) {
        new ForgetPassword() ;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == search)
        {
        try
        {
        String query = "select * from account where username = '"+usernameTF.getText()+"'";
        Conn c = new Conn() ;
        ResultSet rs =  c.s.executeQuery(query) ;
        while (rs.next())
         {
            nameTF.setText(rs.getString("name") );
            securityQnTf.setText(rs.getString("security")) ;
         }
        }
        catch(Exception ae)
        {
            ae.printStackTrace();
        }
        }
        else if (e.getSource() == retrieve)
        {
            try
            {
                String query = "select * from account where answer = '"+answerTF.getText()+"' AND username = '"+usernameTF.getText()+"'";
                Conn c = new Conn() ;
                ResultSet rs =  c.s.executeQuery(query) ;
                while (rs.next())
                {
                    passwordTf.setText(rs.getString("password"));
                }
            }
            catch(Exception ae)
            {
                ae.printStackTrace();
            }
        }

         else {
            setVisible(false);
            new Login();
        }

    }
}
