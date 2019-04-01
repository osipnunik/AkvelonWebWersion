package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.ArrayHolder;
import logic.CalculateSequence;

/**
 * Servlet implementation class TabController
 */
@WebServlet("/tabController")
public class TabController extends HttpServlet {
	
	private CalculateSequence sequence;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		sequence = new CalculateSequence();
		int seq = sequence.getLongestSequence();
		int[][] arr = ArrayHolder.getArray();

		req.setAttribute("nums", arr);
		req.setAttribute("seq", seq);
		req.getRequestDispatcher("mainTab.jsp").forward(req, resp);

	}

}
