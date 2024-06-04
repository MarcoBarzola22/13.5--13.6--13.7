import java.util.Vector;

public class PilaVector {
    private static final int INICIAL = 19;
    private int cima;
    private Vector<Object> listaPila;

    public PilaVector() {
        cima = -1;
        listaPila = new Vector<>(INICIAL);
    }

    public void insertar(Object elemento) {
        cima++;
        listaPila.addElement(elemento);
    }

    public Object quitar() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
        }
        Object aux = listaPila.elementAt(cima);
        listaPila.removeElementAt(cima);
        cima--;
        return aux;
    }

    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
        }
        return listaPila.elementAt(cima);
    }

    public boolean pilaVacia() {
        return cima == -1;
    }

    public void limpiarPila() throws Exception {
        while (!pilaVacia()) {
            quitar();
        }
    }
}