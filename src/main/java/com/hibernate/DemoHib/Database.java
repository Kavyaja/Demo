package com.hibernate.DemoHib;

import java.sql.*;

public class Database 
{
	public static final String url = "jdbc:mysql://127.0.0.1:3306/student";
	public static final String user = "kavya";
	public static final String password = "Admin@12345";
	
	public static Connection con =  null;
	public static PreparedStatement ps = null;
	public static Statement st=null;
	public static ResultSet rs = null;
	
	public static void insertStudent(Student student)

	{
		try 
		{
			con = getConnection();
			String query = "insert into student_details(id,name,department,place,mobile) values(?,?,?,?,?)";
			ps = con.prepareStatement(query);
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setString(3, student.getDepartment());
			ps.setString(4, student.getPlace());
			ps.setLong(5,student.getMobile());
			
			ps.executeUpdate();
			ps.close();
			con.close();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	

}
	public static Connection getConnection() throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		return DriverManager.getConnection(url, user, password);
		
	}
}
