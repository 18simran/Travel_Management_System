package travel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BookHotel extends JFrame implements ActionListener {
    JLabel text, username, usernameAns, boxlb, totalPersons, days, roomtypelb, foodlb, id, idAns, number, numberAns, phone, phoneAns, totalPrice, totalPriceAns;
    JTextField totalPersonsTF, daysTF;
    JComboBox box, roomtypeAns, foodAns;
    JButton checkPrice, Book, back;
    static String user;

    BookHotel(String user) {
        this.user = user;
        setBounds(250, 150, 1000, 600);
        getContentPane().setBackground(new Color(230, 230, 250));

        text = new JLabel("Book Hotel");
        text.setBounds(100, 10, 300, 40);
        text.setForeground(new Color(0, 109, 111));
        text.setFont(new Font("Tahoma", Font.BOLD, 30));

        username = new JLabel("Username : ");
        username.setBounds(30, 90, 150, 25);
        username.setFont(new Font("Poppins", Font.PLAIN, 16));
        username.setForeground(new Color(91, 50, 86));

        usernameAns = new JLabel();
        usernameAns.setBounds(250, 90, 150, 25);
        usernameAns.setFont(new Font("Poppins", Font.PLAIN, 16));

        boxlb = new JLabel("Select Hotel : ");
        boxlb.setBounds(30, 130, 150, 25);
        boxlb.setFont(new Font("Poppins", Font.PLAIN, 16));
        boxlb.setForeground(new Color(91, 50, 86));

        box = new JComboBox(new String[]{"Raddison Blue Hotel", "River View Hotel", "The Taj Hotel"});
        box.setBounds(220, 130, 170, 23);
        box.setFont(new Font("Poppins", Font.PLAIN, 15));
        box.setBackground(new Color(230, 230, 250));

        totalPersons = new JLabel("Total Persons : ");
        totalPersons.setBounds(30, 170, 300, 25);
        totalPersons.setFont(new Font("Poppins", Font.PLAIN, 16));
        totalPersons.setForeground(new Color(91, 50, 86));

        totalPersonsTF = new JTextField();
        totalPersonsTF.setBounds(220, 170, 180, 25);
        totalPersonsTF.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        totalPersonsTF.setFont(new Font("Poppins", Font.PLAIN, 18));

        days = new JLabel("No. of Days : ");
        days.setBounds(30, 210, 300, 25);
        days.setFont(new Font("Poppins", Font.PLAIN, 16));
        days.setForeground(new Color(91, 50, 86));

        daysTF = new JTextField();
        daysTF.setBounds(220, 210, 180, 25);
        daysTF.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        daysTF.setFont(new Font("Poppins", Font.PLAIN, 18));

        roomtypelb = new JLabel("AC/ Non-AC : ");
        roomtypelb.setBounds(30, 250, 150, 25);
        roomtypelb.setFont(new Font("Poppins", Font.PLAIN, 16));
        roomtypelb.setForeground(new Color(91, 50, 86));

        roomtypeAns = new JComboBox(new String[]{"AC", "NON-AC"});
        roomtypeAns.setBounds(220, 250, 170, 23);
        roomtypeAns.setBackground(new Color(230, 230, 250));
        roomtypeAns.setFont(new Font("Poppins", Font.PLAIN, 15));

        foodlb = new JLabel("Food Included :");
        foodlb.setBounds(30, 290, 150, 25);
        foodlb.setFont(new Font("Poppins", Font.PLAIN, 16));
        foodlb.setForeground(new Color(91, 50, 86));

        foodAns = new JComboBox(new String[]{"Yes", "No"});
        foodAns.setBounds(220, 290, 170, 23);
        foodAns.setFont(new Font("Poppins", Font.PLAIN, 15));
        foodAns.setBackground(new Color(230, 230, 250));

        id = new JLabel("ID : ");
        id.setBounds(30, 330, 150, 25);
        id.setFont(new Font("Poppins", Font.PLAIN, 16));
        id.setForeground(new Color(91, 50, 86));

        idAns = new JLabel();
        idAns.setBounds(250, 330, 150, 25);
        idAns.setFont(new Font("Tahoma", Font.PLAIN, 16));

        number = new JLabel("Number : ");
        number.setBounds(30, 370, 150, 25);
        number.setFont(new Font("Poppins", Font.PLAIN, 16));
        number.setForeground(new Color(91, 50, 86));

        numberAns = new JLabel();
        numberAns.setBounds(250, 370, 150, 25);
        numberAns.setFont(new Font("Poppins", Font.PLAIN, 15));

        totalPrice = new JLabel("Total Price : ");
        totalPrice.setBounds(30, 410, 150, 25);
        totalPrice.setFont(new Font("Poppins", Font.PLAIN, 16));
        totalPrice.setForeground(new Color(91, 50, 86));

        totalPriceAns = new JLabel();
        totalPriceAns.setBounds(250, 410, 150, 25);
        totalPriceAns.setFont(new Font("Poppins", Font.PLAIN, 15));

        phone = new JLabel("Phone : ");
        phone.setBounds(30, 450, 150, 25);
        phone.setFont(new Font("Poppins", Font.PLAIN, 16));
        phone.setForeground(new Color(91, 50, 86));

        phoneAns = new JLabel();
        phoneAns.setBounds(250, 450, 150, 25);
        phoneAns.setFont(new Font("Poppins", Font.PLAIN, 15));

        checkPrice = new JButton("Check Price");
        checkPrice.setBounds(30, 490, 130, 40);
        checkPrice.setBackground(new Color(20, 116, 111));
        checkPrice.setBorder(BorderFactory.createLineBorder(Color.white));
        checkPrice.setForeground(Color.white);
        checkPrice.setFocusPainted(false);
        checkPrice.addActionListener(this);

        Book = new JButton("Book Package");
        Book.setBounds(180, 490, 130, 40);
        Book.setBackground(new Color(20, 116, 111));
        Book.setBorder(BorderFactory.createLineBorder(Color.white));
        Book.setForeground(Color.white);
        Book.setFocusPainted(false);
        Book.addActionListener(this);

        back = new JButton("Back");
        back.setBounds(330, 490, 100, 40);
        back.setBorder(BorderFactory.createLineBorder(Color.white));
        back.setBackground(new Color(20, 116, 111));
        back.setFocusPainted(false);
        back.setForeground(Color.white);
        back.addActionListener(this);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/hotel1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 380, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450, 60, 500, 380);

        try {
            Conn c = new Conn();
            String query = "select * from bookpackage where username = '" + user + "'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                usernameAns.setText(rs.getString("Username"));
                idAns.setText(rs.getString("Id"));
                numberAns.setText(rs.getString("Number"));
                phoneAns.setText(rs.getString("Phone"));
            }
        } catch (Exception ae) {
            ae.printStackTrace();
        }

        add(text);
        add(username);
        add(usernameAns);
        add(box);
        add(boxlb);
        add(totalPersons);
        add(totalPersonsTF);
        add(days);
        add(daysTF);
        add(roomtypelb);
        add(roomtypeAns);
        add(foodlb);
        add(foodAns);
        add(id);
        add(idAns);
        add(number);
        add(numberAns);
        add(phone);
        add(phoneAns);
        add(totalPrice);
        add(totalPriceAns);
        add(checkPrice);
        add(Book);
        add(back);
        add(image);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkPrice) {
            try {
                Conn c = new Conn();
                String selectedHotel = (String) box.getSelectedItem();
                ResultSet rs = c.s.executeQuery("select * from hotel where name='" + selectedHotel + "'");
                if (rs.next()) {
                    int cost = Integer.parseInt(rs.getString("costperperson"));
                    int food = Integer.parseInt(rs.getString("foodincluded"));
                    int ac = Integer.parseInt(rs.getString("acroom"));
                    int persons = Integer.parseInt(totalPersonsTF.getText());
                    int days = Integer.parseInt(daysTF.getText());
                    String acselected = (String) roomtypeAns.getSelectedItem();
                    String foodselected = (String) foodAns.getSelectedItem();

                    if (persons > 0 && days > 0) {
                        int total = cost;
                        total += acselected.equals("AC") ? ac : 0;
                        total += foodselected.equals("Yes") ? food : 0;
                        total *= persons * days;

                        totalPriceAns.setText("Rs " + total);
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number of persons and days.");
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == Book) {
            try {
                String uname = usernameAns.getText();
                String hotel = (String) box.getSelectedItem();
                String persons = totalPersonsTF.getText();
                String days = daysTF.getText();
                String ac = (String) roomtypeAns.getSelectedItem();
                String food = (String) foodAns.getSelectedItem();
                String id = idAns.getText();
                String number = numberAns.getText();
                String phone = phoneAns.getText();
                String price = totalPriceAns.getText();

                Conn c = new Conn();
                String query = "INSERT INTO bookhotel (username, SelectedHotel, TotalPersons, Days, Id, Number, Phone, Total_Price, AC, Food) VALUES ('" + uname + "', '" + hotel + "', '" + persons + "', '" + days + "','" + id + "', '" + number + "', '" + phone + "','" + price + "', '" + ac + "','" + food + "')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
            } catch (Exception Bookexception) {
                Bookexception.printStackTrace();
            }
        } else {
            new Dashboard(user);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new BookHotel(user);
    }
}
