package ap.utn.edu.ar;

public class NoHayStockException extends Exception {
    private Producto producto;
    public NoHayStockException(Producto producto) {
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
