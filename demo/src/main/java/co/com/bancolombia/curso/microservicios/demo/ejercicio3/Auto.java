package co.com.bancolombia.curso.microservicios.demo.ejercicio3;

public class Auto extends Vehiculo {
    private final double consumoLitrosPorKm;
    private final double precioGasolinaXLitro;

    public Auto(String marca, String referencia, int anio,
                double consumoLitrosPorKm, double precioGasolinaXLitro) {
        super(marca, referencia, anio);
        this.consumoLitrosPorKm = consumoLitrosPorKm;
        this.precioGasolinaXLitro = precioGasolinaXLitro;
    }

    @Override
    public double calcularCostoViaje(double km) {
        return km * consumoLitrosPorKm * precioGasolinaXLitro;
    }
}