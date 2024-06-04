import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int controlar = 1;
        String centro, izq, dcho;

        Scanner scc = new Scanner(System.in);
        PilaVector pila = new PilaVector();
        ArbolBinario arbol = null;

        while (controlar == 1) {
            System.out.println("Ingrese el nombre del SubArbol izquierdo:");
            izq = scc.nextLine();

            System.out.println("Ingrese el nombre del SubArbol derecho:");
            dcho = scc.nextLine();

            System.out.println("Ingrese el nombre del arbol raiz:");
            centro = scc.nextLine();

            Nodo a1 = ArbolBinario.nuevoArbol(null, izq, null);
            Nodo a2 = ArbolBinario.nuevoArbol(null, dcho, null);
            Nodo a = ArbolBinario.nuevoArbol(a1, centro, a2);

            pila.insertar(a);

            arbol = new ArbolBinario(a);

            System.out.println("Recorrido PreOrden:");
            ArbolBinario.preOrden(arbol.getRaiz());
            System.out.println("------");
            System.out.println("Recorrido InOrden:");
            ArbolBinario.inOrden(arbol.getRaiz());
            System.out.println("------");
            System.out.println("Recorrido PostOrden:");
            ArbolBinario.postOrden(arbol.getRaiz());
            System.out.println("------");

            System.out.println("¿Quiere seguir cargando? Presione:");
            System.out.println("1) Si, si desea seguir.");
            System.out.println("2) No, si no desea seguir.");
            controlar = scc.nextInt();
            scc.nextLine(); // Limpiar el buffer
        }
        scc.close();
    }
}