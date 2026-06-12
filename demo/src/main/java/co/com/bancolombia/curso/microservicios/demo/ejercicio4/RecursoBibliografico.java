package co.com.bancolombia.curso.microservicios.demo.ejercicio4;

public abstract class RecursoBibliografico {

        private String titulo;
        private String autor;
        private int anioPublicacion;

        public RecursoBibliografico(String titulo, String autor, int anioPublicacion) {
            this.titulo = titulo;
            this.autor = autor;
            this.anioPublicacion = anioPublicacion;
        }

        public abstract String obtenerResumen();

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
}
