package Jugadores;
public class mainJugadores {
    public static void main(String[] args) {
        Jugadores j = new Jugadores();
        j.InsertarDato("Franklin Gustavo", "Mendoza Gonzabay", 29, 007);
        j.InsertarDato("Joao Adrian", "Barrionuevo Montesdeoca", 20, 001);
        j.InsertarDato("Kevin", "yuky", 18, 005);
        j.InsertarDato("Wellingtong Francisco", "Cabezas Lucio", 22, 003);
        j.InsertarDato("Jhon Jesus", "Castillo Rodriguez", 17, 002);
        j.InsertarDato("Pepito", "De Los Palotes", 25, 006);
        j.InsertarDato("Luis", "Morales", 19, 004);
        
        j.Imprimir();
    }
}
