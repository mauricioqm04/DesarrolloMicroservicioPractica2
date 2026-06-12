package co.com.bancolombia.curso.microservicios.demo.ejercicio4;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(new LibroElectronico("El Quijote", "Miguel de Cervantes", 1800, "Epub", 600, true, 20));
        biblioteca.agregarLibro(new LibroElectronico("La Iliada", "Homero", -730, "PDF", 700, false, 80));
        biblioteca.agregarLibro(new LibroElectronico("La Odisea", "Homero", -800, "PDF", 1500, false, 120));
        biblioteca.agregarLibro(new LibroElectronico("La Biblia", "varios autores", -750, "PDF", 1500, false, 120));

        biblioteca.mostrarResumenes();
        System.out.println(biblioteca.obtenerLibroMasAntiguo());
    }
}
