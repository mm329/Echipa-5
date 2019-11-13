package cabinetmedicalpsbd;

import static cabinetmedicalpsbd.MyDb.rs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Client {

    private static Connection con;
    private static Connection st;

    public static Connection getClient() throws Exception {

        List<Client> list = new ArrayList<Client>();
        try {
            Connection con;
            con = MyDb.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM pet");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Client c = new Client();
                c.setNume(rs.getString("nume"));
                c.setDenumire(rs.getString("denumire"));
                list.add(c);
            }
        } catch (Exception e) {
            System.out.println("Eroare");
        }
        
        st.close();
        con.close();
        System.out.println("SQL execute succesfully");
        return con;
        
    }

    private void setNume(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDenumire(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
