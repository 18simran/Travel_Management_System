package travel;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable {
    static String user ;
    Thread t;
    JLabel Loading,text,username ;
    JProgressBar bar ;
    Loading(String user)
    {
        this.user = user ;
        t = new Thread(this) ;

        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.white);

        Loading = new JLabel("Loading, please wait...");
        Loading.setBounds(230,180,180,30) ;
        Loading.setFont(new Font("Raleway",Font.BOLD,15));

        text = new JLabel("Travel and Tourism Application");
        text.setBounds(50,20,600,40) ;
        text.setFont(new Font("Raleway",Font.BOLD,35));

        bar  = new JProgressBar() ;
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);

        username = new JLabel("Welcome '"+user+"'") ;
        username.setBounds(20,310,440,40);
        username.setForeground(Color.blue);
        username.setFont(new Font("Raleway",Font.BOLD,16));
        add(username) ;


        t.start();
        add(Loading) ;
        add(text) ;
        add(bar) ;
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void run()
    {
        try{
            for(int i = 1; i <= 101 ;i++)
            {
                int max = bar.getMaximum();
                int value =bar.getValue();
                if(value < max)
                {
                    bar.setValue(bar.getValue() + 1 );
                }
                else {
                    setVisible(false);
                    new Dashboard(user) ;
                    break;
                }
                Thread.sleep(50);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        new Loading(user) ;
    }
}