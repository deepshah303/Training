package lti.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private int counter;

	@Override
	public void init() throws ServletException {
		counter = 1001;
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Setting response MIME type
		response.setContentType("text/html");

		// Getting response stream to write HTML output
		PrintWriter out = response.getWriter();

		// Writing HTML as output on response stream
		out.println("<body bgcolor=wheat text=tomato>");
		out.println("<marquee><h1>Hello Beautiful World</h1></marquee><hr>");
		out.println("<h2>Welcome to Servlet</h2>");
		Date now = new Date();
		out.println("<h3>Visit Time: " + now + "</h3");
		out.println("<h3>Visitor No: " + counter++ + "</h3>");

		// Getting servlet config object from container
		ServletConfig config = getServletConfig();
		String author = config.getInitParameter("Author");
		out.println("<h3>Author: " + author + "</h3>");
		out.println("<h3>Servlet Name: " + config.getServletName() + "</h3");

	}

}
