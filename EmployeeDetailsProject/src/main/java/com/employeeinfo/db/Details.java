package com.employeeinfo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ebrain.employeedetails.dto.Employee;

public class Details {
	private static String dburl="jdbc:mysql://101.53.155.156.3306/mysql_demo_tnj";
    private static String dbuname="mysql_demo_tnj";
    private static String dbpassword="Ebrain@20";
    private String dbdriver="com.mysql.cj.jdbc.Driver";
    public void loadDriver(String dbdriver) {
    	try {
    		Class.forName(dbdriver);
    	} catch (ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    }
    public static Connection getConnection() {
    	Connection conn=null;
    	
    	try {
    		conn=DriverManager.getConnection(dburl, dbuname, dbpassword);
    		System.out.println("Connection successfully.....");
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return conn;
    }
    public String save(Employee member) {
    	loadDriver(dbdriver);
    	Connection conn=getConnection();
    	String result="value entered successfully";
    	String sql="insert into tb_ajith_employeedetails(employeeid, employeename, fathername, mothername, dob, emailid, city, phoneno) values (?,?,?,?,?,?,?,?)";
    	try {
    		PreparedStatement ps=conn.prepareCall(sql);
    		ps.setString(1,member.getEmployeeid());
    		ps.setString(2,member.getEmployeename());
    		ps.setString(3,member.getFathername());
    		ps.setString(4,member.getMothername());
    		ps.setString(5,member.getDob());
    		ps.setString(6,member.getEmailid());
    		ps.setString(7,member.getCity());
    		ps.setString(8,member.getPhoneno());
    		ps.executeUpdate();
    	} catch (SQLException e) {
    		e.printStackTrace();
    		result ="value not entered";
    	}
    	return result;
    }
    public static List<Employee> getAll()  throws ClassNotFoundException, SQLException {

		Connection connection = null;
		try {
			connection = getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		String insertQuery = "select employeeid, employeename, fathername, mothername, dob, emailid, city, phoneno) from tb_ajith_employeedetails	";
		PreparedStatement ps = connection.prepareStatement(insertQuery);
		ResultSet rs = ps.executeQuery();
		System.out.println("Select Query run");
		List<Employee> userObj = new ArrayList<Employee>();
		Employee user = null;
		while(rs.next())
		{
			user= new Employee();
		user.setEmployeeid(rs.getString(1));
		user.setEmployeename(rs.getString(2));
		user.setFathername(rs.getString(3));
		user.setMothername(rs.getString(4));
		user.setDob(rs.getString(5));
		user.setEmailid(rs.getString(6));
		user.setCity(rs.getString(7));
		user.setPhoneno(rs.getString(8));
		userObj.add(user);

		}

		ps.close();
		connection.close();

		return userObj;

	}
	
}


