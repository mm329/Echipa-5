package cabinetmedicalpsbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import java.sql.*;

public class MyDb {
    public static Connection con;
    public static PreparedStatement st;
    public static ResultSet rs;
    public static void main(String[] argv){
        
    }
	
	public static Connection getConnection (){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical", "root", "");
		}
		catch(SQLException sqlException) {
			System.out.println("SQL exception: " + sqlException);
		}
		catch(Exception exception) {
			System.out.println("Exception: "+ exception);
		}

		return con;
	}
	
	  public static void conClose() {
	        if (rs != null) {
	            try {
	                rs.close();
	            } catch (SQLException ex) {
	                System.out.println("Probleme inchidere ResultSet");
	            }
	        }
	        if (st != null) {
	            try {
	                st.close();
	            } catch (SQLException ex) {
	                System.out.println("Probleme inchidere Statement");
	            }
	        }
	        if (con != null) {
	            try {
	                con.close();
	            } catch (SQLException ex) {
	                System.out.println("Probleme inchidere Conexiune");
	            }
	        }

	    }

}