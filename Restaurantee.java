// Restaurante.java
package restaurantee;
import java.util.Scanner;

public class Restaurantee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear menús disponibles
        Menu menu1 = new Menu("Menu Vegetariano");
        menu1.agregarPlato("Ensalada de quinoa");
        menu1.agregarPlato("Sopa de lentejas");
        menu1.agregarPlato("Tacos vegetarianos");

        Menu menu2 = new Menu("Menu Carnívoro");
        menu2.agregarPlato("Bife de res");
        menu2.agregarPlato("Pollo a la parrilla");
        menu2.agregarPlato("Cerdo al horno");

        Menu menu3 = new Menu("Menu de Mariscos");
        menu3.agregarPlato("Paella de mariscos");
        menu3.agregarPlato("Camarones al ajillo");
        menu3.agregarPlato("Sopa de mariscos");

        // Crear un pedido
        Pedido pedido = new Pedido();
        while (true) {
            // Menú de opciones
            System.out.println("\n*** Bienvenido al sistema de restaurante ***");
            System.out.println("1. Ver menu disponible");
            System.out.println("2. Realizar un pedido");
            System.out.println("3. Salir");
            System.out.print("Elija una opcion: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                // Mostrar menús disponibles
                System.out.println("\nMenus disponibles:");
                menu1.mostrarPlatos();
                menu2.mostrarPlatos();
                menu3.mostrarPlatos();
            } else if (opcion == 2) {
                // Realizar un pedido
                System.out.println("\nElija un menu para realizar el pedido:");
                System.out.println("1. Menu Vegetariano");
                System.out.println("2. Menu Carnívoro");
                System.out.println("3. Menu de Mariscos");
                System.out.print("Seleccione el número del menu: ");
                int menuSeleccionado = scanner.nextInt();

                // Agregar platos según el menú seleccionado
                if (menuSeleccionado == 1) {
                    menu1.mostrarPlatos();
                    System.out.print("Seleccione un plato para agregar al pedido: ");
                    int platoSeleccionado = scanner.nextInt();
                    if (platoSeleccionado > 0 && platoSeleccionado <= menu1.cantidadPlatos) {
                        pedido.agregarPlato(menu1.platos[platoSeleccionado - 1]);
                    } else {
                        System.out.println("Plato no válido. Intente de nuevo.");
                    }
                } else if (menuSeleccionado == 2) {
                    menu2.mostrarPlatos();
                    System.out.print("Seleccione un plato para agregar al pedido: ");
                    int platoSeleccionado = scanner.nextInt();
                    if (platoSeleccionado > 0 && platoSeleccionado <= menu2.cantidadPlatos) {
                        pedido.agregarPlato(menu2.platos[platoSeleccionado - 1]);
                    } else {
                        System.out.println("Plato no válido. Intente de nuevo.");
                    }
                } else if (menuSeleccionado == 3) {
                    menu3.mostrarPlatos();
                    System.out.print("Seleccione un plato para agregar al pedido: ");
                    int platoSeleccionado = scanner.nextInt();
                    if (platoSeleccionado > 0 && platoSeleccionado <= menu3.cantidadPlatos) {
                        pedido.agregarPlato(menu3.platos[platoSeleccionado - 1]);
                    } else {
                        System.out.println("Plato no válido. Intente de nuevo.");
                    }
                }


                // Mostrar pedido y calcular total
                pedido.mostrarPedido();
                pedido.calcularTotal();
                System.out.println("Total a pagar: $" + pedido.getTotal());
            } else if (opcion == 3) {
                System.out.println("Gracias por usar el sistema.");
                break;
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
