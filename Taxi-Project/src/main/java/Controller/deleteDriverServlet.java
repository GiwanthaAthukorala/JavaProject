package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.CRUDdriver;

/**
 * Servlet implementation class deleteDriverServlet
 */
@WebServlet("/deleteDriverServlet")
public class deleteDriverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CRUDdriver crud=new CRUDdriver();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteDriverServlet() {
        CRUDdriver crud=new CRUDdriver();
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
			boolean deleted=crud.deleteDriver(telephone);
			if(deleted)
			{
				response.sendRedirect(request.getContextPath() + "/retrieveDriver");
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
	}

}
