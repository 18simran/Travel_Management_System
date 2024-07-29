package travel;

import javax.swing.* ;
import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Splash extends JFrame implements Runnable
{
    Thread thread = new Thread(this);
    Splash()
    {
//        setSize(1200,600);
//        setLocation(200,100); // to set the location of frame otherwise it is on top left corner which is a default position
        ImageIcon icon1  = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image icon2= icon1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT) ;
        ImageIcon icon3 = new ImageIcon(icon2) ;
        JLabel image = new JLabel(icon3) ;
        add(image) ;
        setVisible(true);
        thread.start();
        run();
    }

    public static void main(String[] args)
    {
    Splash frame = new Splash() {

        @Override
        public void run() {
            try {
                Thread.sleep(7000);

            }catch(Exception e)
            {

            }

        }
    };
    int x = 1;
    for(int i = 1 ;i <= 500;x += 7, i+= 6)
    {
        frame.setLocation(750 -(x+ i)/2,400-(i/2));
        frame.setSize(x + i,i);
        try{
            Thread.sleep(10);

        }
        catch (Exception e)
        {

        }

    }

    }
}