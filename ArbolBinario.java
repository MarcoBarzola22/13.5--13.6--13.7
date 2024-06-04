public class ArbolBinario {
    protected Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    boolean isVacio() {
        return raiz == null;
    }

    public static Nodo nuevoArbol(Nodo ramaIzq, Object dato, Nodo ramaDer) {
        return new Nodo(ramaIzq, dato, ramaDer);
    }

    // Recorridos
    public static void preOrden(Nodo raiz) {
        if (raiz != null) {
            raiz.visitar();
            preOrden(raiz.getSubArbolIzdo());
            preOrden(raiz.getSubArbolDcho());
        }
    }

    public static void inOrden(Nodo raiz) {
        if (raiz != null) {
            inOrden(raiz.getSubArbolIzdo());
            raiz.visitar();
            inOrden(raiz.getSubArbolDcho());
        }
    }

    public static void postOrden(Nodo raiz) {
        if (raiz != null) {
            postOrden(raiz.getSubArbolIzdo());
            postOrden(raiz.getSubArbolDcho());
            raiz.visitar();
        }
    }
}