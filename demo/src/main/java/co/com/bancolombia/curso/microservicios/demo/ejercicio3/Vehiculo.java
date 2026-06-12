package co.com.bancolombia.curso.microservicios.demo.ejercicio3;

public abstract class Vehiculo {
    private final String marca;
    private final String referencia;
    private final int anio;

    public Vehiculo(String marca, String referencia, int anio) {
        this.marca = marca;
        this.referencia = referencia;
        this.anio = anio;
    }

    public abstract double calcularCostoViaje(double km);

    public String descripcionBasica() {
        return marca + " " + referencia + " (" + anio + ")";
    }
}