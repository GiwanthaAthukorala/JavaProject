package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.CRUDcustomer;
import Model.User;

/**
 * Servlet implementation class deleteServlet
 */
@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CRUDcustomer crud=new CRUDcustomer();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteServlet() {
        CRUDcustomer crud=new CRUDcustomer();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String telephone = request.getParameter("telephoneNumber");
		System.out.println(telephone);
		try {
			boolean deleted=crud.deleteCustomer(telephone);
			if(deleted)
			{
				response.sendRedirect(request.getContextPath() + "/retrieveCustomer");
			}
			else {
				System.out.println("awul brow");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		
		
		
String telephone = request.getParameter("id");
		
		try {
			boolean deleted=crud.deleteCustomer(telephone);
			if(deleted)
			{
				response.sendRedirect(request.getContextPath() + "/customerList");
			}
			else {
				System.out.println("awul brow");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
