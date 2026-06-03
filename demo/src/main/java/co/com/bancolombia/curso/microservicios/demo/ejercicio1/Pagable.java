package co.com.bancolombia.curso.microservicios.demo.ejercicio1;

public interface Pagable {

    double calcularPago();

    double aplicarDescuento(double porcentaje);

    String descripcion();
}
