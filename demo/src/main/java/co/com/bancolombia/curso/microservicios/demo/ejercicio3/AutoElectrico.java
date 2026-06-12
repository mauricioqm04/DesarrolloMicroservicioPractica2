package co.com.bancolombia.curso.microservicios.demo.ejercicio3;

public class AutoElectrico extends VehiculoElectrico {
    private final double consumoKWhPorKm;
    private final double costoKWh;

    public AutoElectrico(String marca, String referencia, int anio,
                         double capacidadBateriaKWh, double nivelCargaPct,
                         double consumoKWhPorKm, double costoKWh) {
        super(marca, referencia, anio, capacidadBateriaKWh, nivelCargaPct);
        this.consumoKWhPorKm = consumoKWhPorKm;
        this.costoKWh = costoKWh;
    }

    @Override
    public void cargarBateria(double porcentaje) {
        setNivelCargaPct(getNivelCargaPct() + porcentaje);
    }

    @Override
    public void mostrarNivelBateria() {
        System.out.printf("%s - Nivel bateria: %.1f%%%n", descripcionBasica(), getNivelCargaPct());
    }

    @Override
    public double calcularCostoViaje(double km) {
        double energiaRequerida = km * consumoKWhPorKm;
        return energiaRequerida * costoKWh;
    }
}