package Jugadores;

import java.util.Scanner;

public class Nodo {
    private String Nombres;
    private String Apellidos;
    private int Edad;
    private int codigo;
    private Nodo sgte;

    public Nodo() {
        setNombres("");
        setApellidos("");
        setEdad(0);
        setCodigo(0);
        setSgte(null);
    }
    //Métodos Setters
    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    //Métodos Getters
    public Nodo getSgte() {
        return sgte;
    }
    public String getNombres() {
        return Nombres;
    }
    public String getApellidos() {
        return Apellidos;
    }
    public int getEdad() {
        return Edad;
    }
    public int getCodigo() {
        return codigo;
    }
    //Método para enlazar el siguiente nodo
    public void EnlazarSiguiente(Nodo n) {
        setSgte(n);
    }
    //Método para obtener la referencia al siguiente nodo
    public Nodo ObtenerSiguiente() {
        return getSgte();
    }
}
