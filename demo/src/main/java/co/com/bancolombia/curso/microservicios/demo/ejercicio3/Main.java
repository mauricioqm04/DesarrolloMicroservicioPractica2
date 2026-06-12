package co.com.bancolombia.curso.microservicios.demo.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        double km = 120.0;

        List<Vehiculo> flota = new ArrayList<>();
        flota.add(new Auto("Mazda", "3", 2015, 0.08, 16000));
        flota.add(new Moto("Honda", "CB650", 2024, 0.03, 16000));
        flota.add(new AutoElectrico("BYD", "Yuanup", 2022, 60, 70, 0.15, 900));

        System.out.println("Costo estimado para " + km + " km:");
        for (Vehiculo v : flota) {
            double costo = v.calcularCostoViaje(km);
            System.out.printf("- %s -> $%.2f%n", v.descripcionBasica(), costo);
        }
    }


}