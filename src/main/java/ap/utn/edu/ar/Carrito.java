package ap.utn.edu.ar;

import java.time.LocalDate;

public class Carrito {
	
	private Persona persona;
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	private LocalDate fechaCompra;
	
	public Carrito(Persona p) {
		this.persona = p;
	}

	public Producto getProducto1() {
		return producto1;
	}

	public void setProducto1(Producto producto1) {
		this.producto1 = producto1;
	}

	public Producto getProducto2() {
		return producto2;
	}

	public void setProducto2(Producto producto2) {
		this.producto2 = producto2;
	}

	public Producto getProducto3() {
		return producto3;
	}

	public void setProducto3(Producto producto3) {
		this.producto3 = producto3;
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Persona getPersona() {
		return persona;
	}
	
	public double costoFinal() {
		double sumaProd = 0;
		
		if(producto1 != null) {
			sumaProd += producto1.getPrecio();
		}
		if(producto2 != null) {
			sumaProd += producto2.getPrecio();
		}
		if(producto3 != null) {
			sumaProd += producto3.getPrecio();
		}
		
		return sumaProd ;
	}
	
	public int cantProds() {
		int sumaProd = 0;
		
		if(producto1 != null) {
			sumaProd += 1;
		}
		if(producto2 != null) {
			sumaProd += 1;
		}
		if(producto3 != null) {
			sumaProd += 1;
		}
		
		return sumaProd;
	}
	
	
	
	
}
