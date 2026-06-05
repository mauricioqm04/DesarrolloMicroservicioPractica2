package co.com.bancolombia.curso.microservicios.demo.ejercicio2;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {

        Factura factura = new Factura();

        factura.agregarItem(new Producto(
                "Laptop", 999.99, 1
        ));

        factura.agregarItem(new Producto(
                "Mouse", 25.99, 2
        ));

        factura.agregarItem(new Servicio(
                "Soporte técnico", 80.5, 3
        ));

        factura.imprimir();


    }
}
