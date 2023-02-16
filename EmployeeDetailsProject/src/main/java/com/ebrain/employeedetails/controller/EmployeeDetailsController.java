package com.ebrain.employeedetails.controller;

import jakarta.servlet.ServletException; 
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.ebrain.employeedetails.dto.Employee;
import com.employeeinfo.db.Details;

/**
 * Servlet implementation class EmployeeDetailsController
 */
@WebServlet("/EmployeeDetailsController")
public class EmployeeDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDetailsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String employeeid = request.getParameter("employeeid");
	String employeename = request.getParameter("employeename");
	String fathername = request.getParameter("fathername");
	String mothername = request.getParameter("mothername");
	String dob = request.getParameter("dob");
	String emailid = request.getParameter("emailid");
	String city = request.getParameter("city");
	String phoneno = request.getParameter("phoneno");
	Employee member = new Employee();
	  member.setEmployeeid(employeeid);
	  member.setEmployeename(employeename);
	  member.setFathername(fathername);
	  member.setMothername(mothername);
	  member.setDob(dob);
	  member.setEmailid(emailid);
	  member.setCity(city);
	  member.setPhoneno(phoneno);
	  Details det = new Details();
	  String result = det.save(member);
	  response.getWriter().print(result);
	  
	}

}
