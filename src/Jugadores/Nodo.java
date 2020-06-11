package Jugadores;
public class Nodo {

    private Object valor;
    private Nodo sgte;

    public Nodo(Object valor) {
        setValor(valor);
        setSgte(null);
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }

    public Object getValor() {
        return valor;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void EnlazarSiguiente(Nodo n) {
        setSgte(n);
    }

    public Nodo ObtenerSiguiente() {
        return getSgte();
    }

    public Object ObtenerValor() {
        return getValor();
    }
}
