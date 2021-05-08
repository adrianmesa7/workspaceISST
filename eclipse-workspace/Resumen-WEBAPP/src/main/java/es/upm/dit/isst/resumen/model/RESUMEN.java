package es.upm.dit.isst.resumen.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class RESUMEN implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String email; 
	private String password; //contraseña escritor
	private String name; //nombre escritor
	private String title; //título resumen
	private double puntuacion;
	@Lob
	private String urlDocument;
	
	

	public RESUMEN() {}
	
	public String getUrlDocument() {
		return urlDocument;
	}


	public void setUrlDocument(String urlDocument) {
		this.urlDocument = urlDocument;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public double getPuntuacion() {
		return puntuacion;
	}


	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}


	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RESUMEN other = (RESUMEN) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RESUMEN [email=" + email + ", password=" + password + ", name=" + name + ", title=" + title
				+ ", puntuacion=" + puntuacion + ", urlDocument=" + urlDocument + "]";
	}


	



	
	
	
	
}