package es.upm.dit.isst.resumen.servlets;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

import es.upm.dit.isst.resumen.model.RESUMEN;

@WebServlet("/FormSubeResumenServlet")
@MultipartConfig
public class FormSubeResumenServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // autorizacion, comprobar
    String email = req.getParameter("email");
    String title = req.getParameter("title");
    String name = req.getParameter("name");
    Client client = ClientBuilder.newClient(new ClientConfig());
    RESUMEN resumen = null;
    try {
         resumen = client.target(URLHelper.getURL() + "/" + email)
           .request().accept(MediaType.APPLICATION_JSON).get(RESUMEN.class);
    } catch(Exception e) {}
    // autorizacion
    if (resumen != null) {
         Part filePart = req.getPart("file");
         InputStream fileContent = filePart.getInputStream();      
         client.target(URLHelper.getURL() + "/" + resumen.getEmail()).request()
                 .post(Entity.entity(resumen, MediaType.APPLICATION_JSON), Response.class);
         req.setAttribute("resumen", resumen);
     }
    getServletContext().getRequestDispatcher("/SubirResumen.jsp").forward(req,resp);
  }
}