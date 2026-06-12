package co.com.bancolombia.curso.microservicios.demo.ejercicio4;

public abstract class RecursoDigital extends RecursoBibliografico{

    private String formato;
    private double tamanioMB;

    public RecursoDigital(String titulo, String autor, int anioPublicacion, String formato,  double tamanioMB) {
        super(titulo, autor, anioPublicacion);
        this.formato = formato;
        this.tamanioMB = tamanioMB;
    }

    public String getFormato() {
        return formato;
    }

    public double getTamanioMB() {
        return tamanioMB;
    }

}
