package travel;
import javax.swing.* ;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.JavaBean;
import java.sql.ResultSet;
import java.sql.Struct;

public class Login extends JFrame implements ActionListener
{
    JButton btn1,btn2,btn3 ;
    JLabel userNamelb,password ;
    JTextField usernameTF,passwordTF ;
    Thread t ;

    Login()
        {
        //panel 1
        JPanel l = new JPanel();
        ImageIcon icon1  = new ImageIcon(ClassLoader.getSystemResource("icons/LoginImage.jpg"));
        Image icon2 = icon1.getImage().getScaledInstance(450,500,Image.SCALE_DEFAULT) ;
        ImageIcon icon3 = new ImageIcon(icon2) ;
        JLabel image = new JLabel(icon3) ;
        l.setBounds(0,0,450,500);
        l.add(image) ;

        //panel 2
        JPanel l2 = new JPanel();
        l2.setBounds(450,0,450,500);
        l2.setBackground(new Color(3, 102, 102));

        userNamelb = new JLabel("Enter Username : ") ;
        userNamelb.setBounds(50,50,300,40);
        userNamelb.setFont(new Font("Sans-serif",Font.PLAIN,20));
        userNamelb.setForeground(Color.white);

        usernameTF = new JTextField() ;
        usernameTF.setBounds(50,100,300,30);
        usernameTF.setBackground(new Color(198, 241, 234));
        usernameTF.setFont(new Font("Sans-serif",Font.PLAIN,18));
        usernameTF.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));


        password = new JLabel("Password : ") ;
        password.setBounds(50,150,300,40);
        password.setFont(new Font("Sans-serif",Font.PLAIN,20));
        password.setForeground(Color.white);


        passwordTF = new JTextField() ;
        passwordTF.setBounds(50,200,300,30);
        passwordTF.setBackground(new Color(198, 241, 234));
        passwordTF.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        passwordTF.setFont(new Font("Sans-serif",Font.PLAIN,18));


            btn1 = new JButton("Log In") ;
         btn1.setBounds(50,280,140,40);
         btn1.setBackground(new Color(2, 82, 82));
         btn1.setFont(new Font("Sans-serif",Font.PLAIN,15));
         btn1.setForeground(Color.white);
         btn1.setBorder(new LineBorder(new Color(198, 241, 234))) ;
         btn1.setFocusPainted(false);
         btn1.addActionListener(this);



         btn2 = new JButton("Sign Up");
         btn2.setBounds(210, 280,140,40);
         btn2.setBackground(new Color(2, 82, 82));
         btn2.setBorder(new LineBorder(new Color(198, 241, 234))) ;
         btn2.setFont(new Font("Sans-serif",Font.PLAIN,15));
         btn2.setForeground(Color.white);
         btn2.setFocusPainted(false);
         btn2.addActionListener(this);

         btn3 = new JButton("Forgot Password");
         btn3.setBounds(120, 340,140,40);
         btn3.setBackground(new Color(2, 82, 82));
         btn3.setBorder(new LineBorder(new Color(198, 241, 234))) ;
         btn3.setFont(new Font("Sans-serif",Font.PLAIN,15));
         btn3.setForeground(Color.white);
         btn3.setFocusPainted(false);
         btn3.addActionListener(this);


         JLabel text= new JLabel("Trouble in LogIn....") ;
         text.setBounds(270, 340,140,40);
         text.setForeground(new Color(255, 128, 128));







                l2.add(userNamelb) ;
                l2.add(usernameTF);
                l2.add(password);
                l2.add(passwordTF);
                l2.add(btn1) ;
                l2.add(btn2) ;
                l2.add(btn3) ;
                l2.add(text);
                l2.setLayout(null);


                add(l2);
                add(l) ;
                setLayout(null);
                setVisible(true);
                setSize(900,500);
                setLocation(300,150);


    }
@Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btn1)
        {
            try{
                String username = usernameTF.getText() ;
                String pass = passwordTF.getText() ;
                String query = "select * from account where username = '"+username+"' and password ='"+pass+"'";
                Conn c = new Conn() ;
                ResultSet rs = c.s.executeQuery(query)  ;
                if(rs.next())
                {
                    new Loading(username) ;
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"incorrect username or password ");
                }

            }
            catch (Exception e1)
            {
                e1.printStackTrace();
            }
        }
        else if(e.getSource() == btn2)
        {
            setVisible(false);
            new SignUp() ;
        }
        else{
            setVisible(false);
            new ForgetPassword() ;
        }
    }
    public static void main(String[] args)
    {
        new Login() ;
    }
}