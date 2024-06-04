public class Nodo {
    protected Object dato;
    protected Nodo izdo;
    protected Nodo dcho;

    public Nodo(Object valor) {
        this.dato = valor;
        this.izdo = null;
        this.dcho = null;
    }

    public Nodo(Nodo ramaIzdo, Object valor, Nodo ramaDcho) {
        this(valor);
        izdo = ramaIzdo;
        dcho = ramaDcho;
    }

    public Object getNodo() {
        return dato;
    }

    public Nodo getSubArbolIzdo() {
        return izdo;
    }

    public Nodo getSubArbolDcho() {
        return dcho;
    }

    public void setValor(Object d) {
        dato = d;
    }

    public void setRamaIzdo(Nodo n) {
        izdo = n;
    }

    public void setRamaDcho(Nodo n) {
        dcho = n;
    }

    void visitar() {
        System.out.print(dato + " ");
    }
}