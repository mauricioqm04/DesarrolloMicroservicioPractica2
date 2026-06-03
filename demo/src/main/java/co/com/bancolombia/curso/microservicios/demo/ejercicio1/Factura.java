package co.com.bancolombia.curso.microservicios.demo.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Factura {

    private String numeroFactura;
    private String cliente;
    private List<Pagable> items;

    public Factura(String numeroFactura, String cliente) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.items = new ArrayList<>();
    }

    public void agregarItem(Pagable item) {
        this.items.add(item);
        System.out.println("Item agregado: " + item.descripcion());
    }

    public double calcularGranTotal() {
        double granTotal = (double) 0.0F;
        for (Pagable item : items) {
            granTotal += item.calcularPago();
        }
        return granTotal;
    }

    public void imprimirFactura(){
        System.out.println("\n|------------------------------|");
        System.out.println("|           FACTURA            |");
        System.out.println("|------------------------------|");
        System.out.println("\nNúmero de Factura: " + this.numeroFactura);
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Items:");
        for (Pagable item : items) {
            System.out.println("- " + item.descripcion() + ": $" + item.calcularPago());
        }
        System.out.println("\nTotal a pagar: $" + this.calcularGranTotal());
    }

    public void serializarItems(){
        System.out.println("\nSerializando items de la factura...");
        for (Pagable item : this.items) {
            if(item instanceof Serializable){
                System.out.println(" "+ ((Serializable)item).serializar());
            }
        }
    }

    public List<Pagable> getItems() {
        return this.items;
    }

    public String getNumeroFactura() {
        return this.numeroFactura;
    }

    public String getCliente() {
        return this.cliente;
    }


}
