package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.CRUDdriver;
import Model.CRUDdriverPending;
import Model.Driver;
import Model.DriverConfirmed;

/**
 * Servlet implementation class retrieveDriverPending
 */
@WebServlet("/retrieveDriverPending")
public class retrieveDriverPending extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public retrieveDriverPending() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		CRUDdriverPending driver=new CRUDdriverPending();
		List<DriverConfirmed> drivers = driver.selectAllDriverConfirmed();
		
		
		request.setAttribute("drivers", drivers);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("DriverConfirmed.jsp");
	    dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
