package co.com.bancolombia.curso.microservicios.demo.ejercicio4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Biblioteca {

    List<RecursoDigital> libros = new ArrayList<>();

    public void agregarLibro(RecursoDigital libro) {
        libros.add(libro);
    }

    public void mostrarResumenes() {
        for (RecursoDigital r : libros) {
            System.out.println(r.obtenerResumen());
        }
    }

    public String obtenerLibroMasAntiguo(){
        if (libros.isEmpty()) {
            return "No hay libros en la biblioteca";
        }

        RecursoDigital masAntiguo = libros.get(0);

        masAntiguo = libros.stream()
                .min(Comparator.comparing(RecursoDigital::getAnioPublicacion))
                .orElse(masAntiguo);

        return String.format("El libro mas antiguo es %s del año %d",masAntiguo.getTitulo(), masAntiguo.getAnioPublicacion());
    }

}
