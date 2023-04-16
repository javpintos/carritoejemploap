package ap.utn.edu.ar;

import java.time.LocalDate;

public class Persona {

	private String nombre;
	private String apellido;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String nombreX,String apellidoX) {
		this.nombre = nombreX;
		this.apellido = apellidoX;
	}
	
	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	
	
	
	
}
