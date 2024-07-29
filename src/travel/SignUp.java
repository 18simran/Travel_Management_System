package travel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame implements ActionListener {
    JButton btn1  ; // defined globally as we can't access these buttons from SignUp constructor
    JButton btn2  ;
    JLabel username ,name,password,answer,securityQn;
    JTextField usernameTf,nameTF,passwordTF,answerTF ;
    Choice securityQnTF ;
        SignUp()
        {

            setSize(900,400);
            setLocation(250,200);
            setLayout(null);

            JPanel p1 = new JPanel() ;
            p1.setBounds(0,0,450,400);
            p1.setBackground(new Color(11, 163, 140));
            p1.setLayout(null);


          //  JLabel username = new JLabel("UserName :") ;  Declare all the textfield in the global scope so that  we have their access globally
            username = new JLabel("UserName :") ;
            username.setFont(new Font("Tahoma",Font.BOLD, 14));
            username.setBounds(40,20,100,25);
            username.setForeground(Color.white);


            usernameTf = new JTextField() ;
            usernameTf.setBounds(160, 20, 220,30);
            usernameTf.setBorder(BorderFactory.createEmptyBorder());


            name = new JLabel("Name :") ;
            name.setFont(new Font("Tahoma",Font.BOLD, 14));
            name.setBounds(40,70,100,25);
            name.setForeground(Color.white);

            nameTF = new JTextField() ;
            nameTF.setBounds(160, 70, 220,30);
            nameTF.setBorder(BorderFactory.createEmptyBorder());

            password = new JLabel("Password :") ;
            password.setFont(new Font("Tahoma",Font.BOLD, 14));
            password.setBounds(40,120,100,25);
            password.setForeground(Color.white);

            passwordTF = new JTextField() ;
            passwordTF.setBounds(160, 120, 220,30);
            passwordTF.setBorder(BorderFactory.createEmptyBorder());

            securityQn =new JLabel("Security Question");
            securityQn.setBounds(40,170,100,25);
            securityQn.setFont(new Font("Tahoma",Font.BOLD,14));
            securityQn.setForeground(Color.white);

            securityQnTF = new Choice() ;
            securityQnTF.add("Favorite Food ");
            securityQnTF.add("Favorite Marvel superhero");
            securityQnTF.add("Favorite place ");
            securityQnTF.add("Your childhood Dream");
            securityQnTF.add("Something You Hate ");
            securityQnTF.add("What is Love");
            securityQnTF.add("Favorite animal");
            securityQnTF.setBounds(160, 170, 220,30);

            answer =new JLabel("Answer");
            answer.setBounds(40,220,100,25);
            answer.setFont(new Font("Tahoma",Font.BOLD,14));
            answer.setForeground(Color.white);

            answerTF = new JTextField() ;
            answerTF.setBounds(160, 220, 220,30);
            answerTF.setBorder(BorderFactory.createEmptyBorder());

            btn1 =new JButton("Create") ;
            btn1.setBounds(80,290, 130,35);
            btn1.setBackground(new Color(5, 185, 155));
            btn1.setFont(new Font("Tahoma",Font.BOLD,14));
            btn1.setForeground(Color.white);
            btn1.setBorder(new LineBorder(Color.white));
            btn1.setFocusPainted(false);
            btn1.addActionListener(this);

//          JButton btn2 =new JButton("Back") ; Can't access it in actionPerformed function so declared them globally
            btn2 =new JButton("Back") ;
            btn2.setBounds(240,290, 130,35);
            btn2.setBackground(new Color(5, 185, 155));
            btn2.setFont(new Font("Tahoma",Font.BOLD,14));
            btn2.setForeground(Color.white);
            btn2.setBorder(new LineBorder(Color.white));
            btn2.setFocusPainted(false);
            btn2.addActionListener(this);

//
            JPanel p2 = new JPanel();
            p2.setBounds(450,0,450,400);
            p2.setLayout(null);
            ImageIcon icon1  = new ImageIcon(ClassLoader.getSystemResource("icons/Sign_up2.jpg"));
            Image icon2 = icon1.getImage().getScaledInstance(450,400,Image.SCALE_SMOOTH) ;
            ImageIcon icon3 = new ImageIcon(icon2) ;
            JLabel image = new JLabel(icon3) ;
            image.setBounds(0, 0, 450, 400);


            p1.add(username) ;
            p1.add(usernameTf);
            p1.add(name);
            p1.add(nameTF) ;
            p1.add(password);
            p1.add(passwordTF) ;
            p1.add(securityQn);
            p1.add(securityQnTF) ;
            p1.add(answer);
            p1.add(answerTF);
            p1.add(btn1) ;
            p1.add(btn2) ;
            p2.add(image) ;
            add(p1);
            add(p2);
            setVisible(true);
        }
    @Override
    public void actionPerformed(ActionEvent e)  //in this explain what we need to be on action
    {
        //ActionEvent class tells us that what action is called
        if(e.getSource() ==  btn1)
        {
        String username  =  usernameTf.getText() ;
        String name = nameTF.getText() ;
        String password = passwordTF.getText() ;
        String question = securityQnTF.getSelectedItem();
        String answer = answerTF.getText();
        String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')" ;
            try {
                Conn c = new Conn() ;
                c.s.executeUpdate(query) ;
                JOptionPane.showMessageDialog(null,"Account Created Successfully");
                setVisible(false);
                new Login() ;
            }
            catch (Exception ea)
            {
                ea.printStackTrace();
            }
        }

        else  if(e.getSource() ==  btn2)
        {
            setVisible(false);

            new Login() ;
        }
    }
        public static void main(String[] args)
        {
            new SignUp() ;
        }
}

