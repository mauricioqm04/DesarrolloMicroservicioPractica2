package co.com.bancolombia.curso.microservicios.demo.ejercicio1;

public class Servicio implements Pagable, Serializable {

    private String descripcion;
    private Double precioHora;
    private Double horasTrabajadas;

    public Servicio(String descripcion, Double precioHora, Double horasTrabajadas) {
        this.descripcion = descripcion;
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public Double calcularTotal(){
        return this.precioHora*this.horasTrabajadas;
    }


    public double aplicarDescuento(double porcentaje){
        Double total = this.calcularTotal();
        return total - (total*porcentaje/100);
    }

    public String descripcion() {
        return String.format("Servicio: %s | Precio/hora: $%.2f | Horas: %.1f | Total con Descuento: $%.2f", this.descripcion, this.precioHora, this.horasTrabajadas, this.aplicarDescuento(10));
    }

    @Override
    public String serializar (){
        return String.format("{tipo: 'Servicio', descripcion: '%s', precio hora: '$%.2f'," +
                "horas: %.1f, total: %.2f}", this.descripcion, this.precioHora, this.horasTrabajadas, calcularTotal());
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPrecioHora() {
        return precioHora;
    }

    public Double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public String toString() {
        return this.descripcion;
    }



    @Override
    public double calcularPago() {
        return 0;
    }
}
