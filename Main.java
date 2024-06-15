import java.util.Scanner;

public class Main {

    static PilaVector pila = new PilaVector();

    public static void Insertar() {
        String name1, name2, name3;
        Nodo a1, a2, a;

        Scanner scc = new Scanner(System.in);

        try {
            System.out.println("Ingrese el nombre del SubArbol Izquierdo: ");
            name1 = scc.nextLine();

            System.out.println("Ingrese el nombre del SubArbol Derecho: ");
            name2 = scc.nextLine();

            System.out.println("Ingrese el nombre del SubArbol Raiz: ");
            name3 = scc.nextLine();

            a1 = ArbolBinario.nuevoArbol(null, name1, null);
            a2 = ArbolBinario.nuevoArbol(null, name2, null);
            a = ArbolBinario.nuevoArbol(a1, name3, a2);
            pila.insertar(a);
        } catch (Exception e) {
            System.out.println("No se pudo insertar: " + e.getMessage());
        }
    }


    public static void Buscar() {
        try {
            Estudiante estudianteBuscado;
            Nodo n = ArbolBinarioBusqueda.buscar(new Estudiante(10));

            if ((n != null) && (n.getNodo() instanceof Estudiante)) {
                estudianteBuscado = (Estudiante) n.getNodo();
                System.out.println("Buscado: " + estudianteBuscado.toString());
            } else {
                System.out.println("Buscado: NO ENCONTRADO");
            }
        } catch (Exception e) {
            System.out.println("Error al Buscar: " + e.getMessage());
        }

        try {
            ArbolBinarioBusqueda.eliminar(new Estudiante(15));
        } catch (Exception e) {
            System.out.println("Error al Eliminar: " + e.getMessage());
        }

    }

    public static void Recorrido() {
        try {
            // Recorrido
            System.out.println("\nPreorden");
            ArbolBinario.preOrden(ArbolBinarioBusqueda.getRaiz());

        } catch (Exception e) {
            System.out.println("Error al recorrer: " + e.getMessage());
        }

        try {
            // Recorrido
            System.out.println("\nInorden");
            ArbolBinario.inOrden(ArbolBinarioBusqueda.getRaiz());

        } catch (Exception e) {
            System.out.println("Error al recorrer: " + e.getMessage());
        }

        try {
            System.out.println("\nPostorden");
            ArbolBinario.postOrden(ArbolBinarioBusqueda.getRaiz());

        } catch (Exception e) {
            System.out.println("Error al recorrer: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int opc = 0; 
        Scanner scc = new Scanner(System.in);

        System.out.println("Bienvenido!\n");

        do {
            System.out.println("1) Insertar");
            System.out.println("2) Buscar / Eliminar");
            System.out.println("3) Mostrar Recorridos");
            System.out.println("4) Salir");
            System.out.println("Seleccione una opción: ");

            try {
                opc = scc.nextInt();
                scc.nextLine(); 

                switch (opc) {
                    case 1:
                        Insertar();
                        break;
                    case 2:
                        Buscar();
                        break;
                    case 3:
                        Recorrido();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scc.nextLine(); 
            }

        } while (opc != 4);

        scc.close(); 
    }

}