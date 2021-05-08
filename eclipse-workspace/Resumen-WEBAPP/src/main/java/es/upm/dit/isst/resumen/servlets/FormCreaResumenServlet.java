package es.upm.dit.isst.resumen.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

import es.upm.dit.isst.resumen.model.RESUMEN;

/**
 * Servlet implementation class FormCreaTFGServlet
 */
@WebServlet("/FormCreaResumenServlet")
public class FormCreaResumenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        String advisorEmail = req.getParameter("email");
	        if (advisorEmail.indexOf("@escritor.es") > 0) {
                RESUMEN resumen = new RESUMEN();
                resumen.setEmail(req.getParameter("email"));
                resumen.setPuntuacion(0.0);
                resumen.setTitle(req.getParameter("title"));
                resumen.setName(req.getParameter("name"));
                Client client = ClientBuilder.newClient(new ClientConfig());
                Response r = client.target(URLHelper.getURL()).request()
                        .post(Entity.entity(resumen, MediaType.APPLICATION_JSON)
                       , Response.class);
                if (r.getStatus() == 200) {
                        req.getSession().setAttribute("resumen", resumen);
                        getServletContext().getRequestDispatcher("/Resumen.jsp").forward(req, resp);
	                    return;
                }
	        }        
	        getServletContext().getRequestDispatcher("/index.html").forward(req, resp);
	}

}