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
 * Servlet implementation class CustomerUpdateServlet
 */
@WebServlet("/CustomerUpdateServlet")
public class CustomerUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerRegDTO data=new CustomerRegDTO();
	      data.setCid(Integer.parseInt(request.getParameter("cid")));
	      data.setCname(request.getParameter("cname"));
	      data.setCadd(request.getParameter("cadd"));
	      data.setEmail(request.getParameter("email"));
	      data.setMob(request.getParameter("mob"));
	      data.setUnm(request.getParameter("unm"));
	      data.setPw(request.getParameter("pw"));
		CustomerRegDAO d1=new CustomerRegDAO();
		int x=d1.update(data);
		if(x!=0)
		{
	     response.sendRedirect("index.jsp");		
		}else {
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
