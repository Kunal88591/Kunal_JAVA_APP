package com.giftos.servlet;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.giftos.DAO.CustomerRegDAO;
import com.giftos.DTO.CustomerRegDTO;

/**
 * Servlet implementation class CustomerLoginServlet
 */
@WebServlet("/CustomerLoginServlet")
public class CustomerLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs1 = request.getSession(false);
		if (hs1!=null) {
			hs1.invalidate();
		}
		
		CustomerRegDTO login = new CustomerRegDTO();
		login.setUnm(request.getParameter("unm"));
		login.setPw(request.getParameter("pw"));
		CustomerRegDAO d1 = new CustomerRegDAO();
		Vector b = d1.loginChk(login);
		if (b.isEmpty()==false) {
			hs1 = request.getSession(true);
			hs1.setAttribute("unm", b.elementAt(5));
			hs1.setAttribute("data", b);
			
			response.sendRedirect("index.jsp");
		} else {
			response.sendRedirect("login.jsp");
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
