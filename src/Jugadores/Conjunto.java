package Jugadores;

public interface Conjunto {
    public boolean InsertarDato(String Nombres,String Apellidos,int Edad,int codigo);
    public boolean EncontrarDato(int dato);
    public int Eliminar(int i);
    public void Imprimir();
    public boolean Buscar(Object elemento);
}
