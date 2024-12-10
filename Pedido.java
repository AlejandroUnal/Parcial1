// Pedido.java
package restaurantee;

public class Pedido {
    private String[] platosPedidos;
    private int cantidadPedidos;
    private double total;

    public Pedido() {
        this.platosPedidos = new String[10]; // Tamaño inicial del arreglo
        this.cantidadPedidos = 0;
        this.total = 0.0;
    }

    // Agregar un plato al pedido
    public void agregarPlato(String plato) {
        if (cantidadPedidos >= platosPedidos.length) {
            // Redimensionar el arreglo si no hay espacio
            String[] nuevoArreglo = new String[platosPedidos.length * 2];
            System.arraycopy(platosPedidos, 0, nuevoArreglo, 0, platosPedidos.length);
            platosPedidos = nuevoArreglo;
        }
        platosPedidos[cantidadPedidos] = plato;
        cantidadPedidos++;
    }

    // Mostrar los platos en el pedido
    public void mostrarPedido() {
        System.out.println("\nPedido realizado:");
        for (int i = 0; i < cantidadPedidos; i++) {
            System.out.println("- " + platosPedidos[i]);
        }
    }

    public void calcularTotal() {
        this.total = cantidadPedidos * 18500;
    }

    public double getTotal() {
        return total;
    }
}
