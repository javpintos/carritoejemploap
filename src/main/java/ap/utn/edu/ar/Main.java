package ap.utn.edu.ar;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,Producto> repoProductos = crearRepoProductos();

        Persona p1 = new Persona("Javier", "Pintos");
        Carrito c1 = new Carrito(p1);

        ItemCarrito ic1 = new ItemCarrito(repoProductos.get("A"), 3);
        ItemCarrito ic2 = new ItemCarrito(repoProductos.get("B"), 1);
        ItemCarrito ic3 = new ItemCarrito(repoProductos.get("C"), 2);

        c1.agregarItem(ic1);
        c1.agregarItem(ic2);
        c1.agregarItem(ic3);

        Double valor;
        try {
            valor = c1.costoFinal();
            System.out.println("El total del carrito es:" + valor);
        } catch (NoHayStockException e) {
            System.out.println("No hay stock en el producto: " + e.getProducto().getNombre());
            //throw new RuntimeException(e);
        }
        System.out.println("Hago mas cosas...");
    }
    public static Map<String,Producto> crearRepoProductos(){
        Map<String,Producto> repoProductos = new HashMap<String,Producto>();

        Producto prod1 = new Producto("Pasta dental");
        Producto prod2 = new Producto("Jamon");
        Producto prod3 = new Producto("Queso");

        prod1.setStock(10);
        prod2.setStock(10);
        prod3.setStock(10);

        repoProductos.put("A",prod1);
        repoProductos.put("B",prod2);
        repoProductos.put("C",prod3);

        return repoProductos;
    }
}
