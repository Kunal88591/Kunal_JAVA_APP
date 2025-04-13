package com.giftos.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.giftos.DAO.CustomerRegDAO;
import com.giftos.DTO.CustomerRegDTO;

/**
 * Servlet implementation class CustomerRegServlet
 */
@WebServlet("/CustomerRegServlet")
public class CustomerRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerRegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerRegDTO data = new CustomerRegDTO();
		data.setCname(request.getParameter("cname"));
		data.setCadd(request.getParameter("cadd"));
		data.setMob(request.getParameter("mob"));
		data.setEmail(request.getParameter("email"));
		data.setUnm(request.getParameter("unm"));
		data.setPw(request.getParameter("pw"));
		
		CustomerRegDAO d1 = new CustomerRegDAO();
		int x = d1.save1(data);
		if (x!=0) {
			response.sendRedirect("login.jsp");
		} else {
			response.sendRedirect("registration.jsp");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
