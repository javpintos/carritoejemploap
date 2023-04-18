package ap.utn.edu.ar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Carrito {
	
	private Persona persona;
	private Collection<ItemCarrito> items;
	private LocalDate fechaCompra;
	
	public Carrito(Persona p) {
		this.persona = p;
		this.items = new ArrayList<ItemCarrito>();
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public void agregarItem (ItemCarrito ic){
		this.items.add(ic);
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public double costoFinal() throws NoHayStockException{
		double sumaProd = 0;

		for (ItemCarrito itemcarrito:this.items) {
			sumaProd += itemcarrito.precioLinea();
		}
		
		return sumaProd ;
	}
	
	public int cantProds() {
		return this.items.size();
	}
	
	
	
	
}
