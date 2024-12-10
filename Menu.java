// Menu.java
package restaurantee;

public class Menu {
    private String nombre;
    public String[] platos;
    public int cantidadPlatos;

    public Menu(String nombre) {
        this.nombre = nombre;
        this.platos = new String[10]; // Tamaño inicial del arreglo
        this.cantidadPlatos = 0;
    }

    // Agregar un plato al menú
    public void agregarPlato(String plato) {
        if (cantidadPlatos >= platos.length) {
            // Redimensionar el arreglo si no hay espacio
            String[] nuevoArreglo = new String[platos.length * 2];
            System.arraycopy(platos, 0, nuevoArreglo, 0, platos.length);
            platos = nuevoArreglo;
        }
        platos[cantidadPlatos] = plato;
        cantidadPlatos++;
    }

    // Mostrar los platos del menú
    public void mostrarPlatos() {
        System.out.println("Menu: " + nombre);
        for (int i = 0; i < cantidadPlatos; i++) {
            System.out.println((i + 1) + ". " + platos[i]);
        }
    }

    public String getNombre() {
        return nombre;
    }
}
