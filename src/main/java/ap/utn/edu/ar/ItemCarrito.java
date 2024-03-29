package ap.utn.edu.ar;

public class ItemCarrito {
    private Producto producto;
    private int cantidad;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double precioLinea() throws NoHayStockException{
        if(this.producto.hayStock()){
            return this.producto.getPrecio() * this.cantidad;
        }
        throw new NoHayStockException(this.producto);
    }
}
