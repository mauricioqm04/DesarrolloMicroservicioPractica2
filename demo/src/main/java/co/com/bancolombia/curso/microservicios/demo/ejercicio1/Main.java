package co.com.bancolombia.curso.microservicios.demo.ejercicio1;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Ejercicio 1: Factura con polimorfismo y Serialización\n");
        Producto laptop = new Producto("Laptop", 1500.00, 2);
        Producto teclado = new Producto("Teclado", 1200.00, 4);
        Producto monitor = new Producto("Monitor", 5200.00, 5);
        Producto soporte = new Producto("Soporte", 300.00, 2);
        Producto desarrollo = new Producto("Desarrollo software", 500.00, 10);

        Factura factura = new Factura("F001", "Juan Pérez");
        factura.agregarItem(laptop);
        factura.agregarItem(teclado);
        factura.agregarItem(monitor);
        factura.agregarItem(soporte);
        factura.agregarItem(desarrollo);
        factura.imprimirFactura();
        factura.serializarItems();


        Pagable [] elementos = new Pagable[]{laptop,teclado,monitor,soporte,desarrollo};

        for(Pagable elemento : elementos){
            System.out.println("\nDescripcion: "+elemento.descripcion());
            System.out.println("Pago a realizar: "+ elemento.calcularPago());
        }
    }
}
