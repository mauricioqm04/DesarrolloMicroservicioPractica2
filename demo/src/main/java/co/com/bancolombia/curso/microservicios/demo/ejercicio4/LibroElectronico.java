package co.com.bancolombia.curso.microservicios.demo.ejercicio4;

public class LibroElectronico extends RecursoDigital{

    private int numeroPaginas;
    private boolean tieneDRM;

    public LibroElectronico(String titulo, String autor, int anioPublicacion, String formato,  int numeroPaginas, boolean tieneDRM, double tamanioMB) {
        super(titulo, autor, anioPublicacion, formato, tamanioMB);
        this.numeroPaginas = numeroPaginas;
        this.tieneDRM = tieneDRM;
    }

    @Override
    public String obtenerResumen() {
        return String.format("\nResumen del libro electrónico autor '%s' de %s: %s", getAutor(), getTitulo(), "Este es un libro electrónico con DRM: " + (tieneDRM ? "Sí" : "No") + " y número de páginas: " + numeroPaginas);
    }
}
