package ec.edu.ups.controlador;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class DoctorBean extends PersonaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int IdDoctor;

	
}
