package Jugadores;

import java.util.Scanner;

public class Jugador {
    private Scanner lector = new Scanner(System.in);
    private String Nombres;
    private String Apellidos;
    private int Edad;

    public Jugador() {
        setNombres("");
        setApellidos("");
        setEdad(0);
    }
    //Constructor Sobrecargado
    public Jugador(String n, String a, int e){
        setNombres(n);
        setApellidos(a);
        setEdad(e);
    }
    //Métodos Setters
    public void setNombres(String n){
        this.Nombres = n;
    }
    public void setApellidos(String a){
        this.Apellidos = a;
    }
    public void setEdad(int e){
        this.Edad = e;
    }
    //Métodos Getters
    public String getNombres(){
        return Nombres;
    }
    public String getApellidos(){
        return Apellidos;
    }
    public int getEdad() {
        return Edad;
    }
    //Método para leer los datos
    public void Leer(){
        System.out.println("Ingrese los nombres del jugador");
        setNombres(lector.nextLine());
        System.out.println("Ingrese los Apellidos del jugador");
        setApellidos(lector.nextLine());
        System.out.println("Ingre la edad del jugador");
        setEdad(lector.nextInt());
    }

    public String toString() {
        return "Nombres: "+getNombres()+"\nApellidos: "+getApellidos()+"\nEdad: "+getEdad();
    }
}
