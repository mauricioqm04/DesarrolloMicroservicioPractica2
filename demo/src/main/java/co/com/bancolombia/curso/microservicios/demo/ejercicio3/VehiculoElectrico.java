package co.com.bancolombia.curso.microservicios.demo.ejercicio3;

public abstract class VehiculoElectrico extends Vehiculo {
    private final double capacidadBateriaKWh;
    private double nivelCargaPct; // 0..100

    public VehiculoElectrico(String marca, String referencia, int anio,
                             double capacidadBateriaKWh, double nivelCargaPct) {
        super(marca, referencia, anio);
        this.capacidadBateriaKWh = capacidadBateriaKWh;
        this.nivelCargaPct = Math.max(0, Math.min(100, nivelCargaPct));
    }

    public abstract void cargarBateria(double porcentaje);

    public abstract void mostrarNivelBateria();

    public double energiaDisponibleKWh() {
        return capacidadBateriaKWh * (nivelCargaPct / 100.0);
    }

    public double getCapacidadBateriaKWh() {
        return capacidadBateriaKWh;
    }

    public double getNivelCargaPct() {
        return nivelCargaPct;
    }

    protected void setNivelCargaPct(double nivelCargaPct) {
        this.nivelCargaPct = Math.max(0, Math.min(100, nivelCargaPct));
    }
}