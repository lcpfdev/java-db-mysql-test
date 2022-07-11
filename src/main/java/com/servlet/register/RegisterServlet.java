package com.servlet.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	

	private static final String INSERT_QUERY ="INSERT INTO CUSTOMERS(TITLE, FIRSTNAME, LASTNAME, ADDRESSLINE1, ADDRESSLINE2, CITY, POSTCODE, TELEPHONENUMBER, EMAILADDRESS) VALUES(?,?,?,?,?,?,?,?,?)";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw = res.getWriter();
		
		res.setContentType("text/hmtl");
	

		String title = req.getParameter("Title");
		String firstName = req.getParameter("First Name");
		String lastName = req.getParameter("Last Name");
		String addressLine1 = req.getParameter("Address Line 1");
		String addressLine2 = req.getParameter("Address Line 2");
		String city = req.getParameter("City");
		String postCode = req.getParameter("Postcode");
		String telephoneNumber =req.getParameter("Telephone Number");
		String emailAddress = req.getParameter("Email Address");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	
		try(Connection con = DriverManager.getConnection("jdbc:mysql:///AeroParker","root","EnterPasswordHere"); // EnterDb password after "root" in "EnterPasswordHere"
				PreparedStatement ps = con.prepareStatement(INSERT_QUERY);){
			
			ps.setString(1, title);
			ps.setString(2, firstName);
			ps.setString(3, lastName);
			ps.setString(4, addressLine1);
			ps.setString(5, addressLine2);
			ps.setString(6, city);
			ps.setString(7, postCode);
			ps.setString(8, telephoneNumber);
			ps.setString(9, emailAddress);
	
		
			
			
			
		
			
		
			int count = ps.executeUpdate();
			
			if(count==0) {
				pw.println("Error registering details");
			}else {
				pw.println("Your details have been registered");
			}
		}catch(SQLException se) {
			pw.println(se.getMessage());
			se.printStackTrace();
		}catch(Exception e) {
			pw.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		pw.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
	}
}