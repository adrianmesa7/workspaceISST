package es.upm.dit.isst.resumen.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;

import es.upm.dit.isst.resumen.model.RESUMEN;

/**
 * Servlet implementation class LeeResumenServlet
 */
@WebServlet("/LeeResumenServlet")
public class LeeResumenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Client client = ClientBuilder.newClient(new ClientConfig());
		
		List<RESUMEN> resumenes = client.target(URLHelper.getURL())
                .request().accept(MediaType.APPLICATION_JSON)
              .get(new GenericType<List<RESUMEN>>() {});
		req.setAttribute("resumenes", resumenes);
		
		getServletContext().getRequestDispatcher("/Resumen.jsp").forward(req, resp);
	}

	

}
