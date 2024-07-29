package travel;
import java.sql.* ;
public class Conn {
    Connection c ;
    Statement s ;
    Conn()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_management_system","root","SCAAALDUS?@1");
            s = c.createStatement();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}