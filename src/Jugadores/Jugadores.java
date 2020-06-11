package Jugadores;
public class Jugadores implements Conjunto {
    private Nodo Cabeza;
    //Constructor
    public Jugadores() {
        setCabeza(null);
    }
    //Método Setters
    public void setCabeza(Nodo Cabeza) {
        this.Cabeza = Cabeza;
    }
    //Método Getter
    public Nodo getCabeza() {
        return Cabeza;
    }
    //Método para insertar los datos de manera ordenada
    //Realizado por Franklin Mendoza
    //Requerimiento funcional
    @Override
    public boolean InsertarDato(String n,String a,int e,int codigo) {
        if(!EncontrarDato(codigo)){//Si no encontramos el datos
            Nodo nuevo = new Nodo();
            nuevo.setNombres(n);
            nuevo.setApellidos(a);
            nuevo.setEdad(e);
            nuevo.setCodigo(codigo);//Creamos un nuevo nodo y le asignamos el dato
            if(getCabeza()==null){//Si nuestro inicio es nulo entonces
                setCabeza(nuevo);//El inicio sera el nuevo nodo
                return true;//Retornamos un true
            }else{//caso contrario la lista no esta vacia
                Nodo aux = getCabeza();//creamos un nodo auxiliar para recorrer la lista
                if(aux.getCodigo()>codigo){//si el auxiliar es mayor que el dato
                    nuevo.setSgte(aux);
                    setCabeza(nuevo);//Ahora este es el nuevo inicio
                    return true;
                }
                while(aux.getSgte()!=null){//Ahora empezamos a recorrer la lista
                    if(aux.getSgte().getCodigo()>codigo){//si el siguiente nodo es mayor a nuestro dato, entonces lo insertamos
                        nuevo.setSgte(aux.getSgte());
                        aux.setSgte(nuevo);
                        return true;
                    }
                    aux = aux.getSgte();
                }
                //Si llega hasta aqui es que lo va a insertar al final
                aux.setSgte(nuevo);
                return true;
            }
        }else {//significa que el datos ya estaba en la lista
            System.out.println("El dato ya existe!!!");
            return false;
        }
    }
    //Requerimiento funcional
    //Método para saber si el elemento existe en la lista
    //Realizado por Joao Barrionuevo
    @Override
    public boolean EncontrarDato(int codigo) {
        Nodo aux = getCabeza();//creamos un nodo auxiliar qye nos permitira recorrer la lista
        while(aux !=null){
            if(aux.getCodigo()==codigo){//Si nuestro auxiliar es igual al dato entonces
                return true;
            }
            aux = aux.getSgte();//Si llega hasta aqui quiere decir que no lo encontro y sigue al proximo nodo
        }
        return false;//si retorna falso es que no encuentró nada
    }
    //Método para eliminar cualquier elemento de la lista
    //Requerimiento funcional
    //Realizado por Joao Barrionuevo
    @Override
    public boolean Eliminar(int i) {
        Nodo aux = getCabeza();
        while(aux != null){
            if(EncontrarDato(i)){
                aux = aux.ObtenerSiguiente();
                return true;
            }
            aux.EnlazarSiguiente(aux.ObtenerSiguiente().ObtenerSiguiente());
        }
        return false;
    }
    //Método para imprimir los datos de la lista
    //Requerimiento no funcional
    //Realizado por Franklin Mendoza
    @Override
    public void Imprimir() {
        Nodo aux = getCabeza();
        while(aux != null){
            System.out.println("Nombres: "+aux.getNombres()+"\nApellidos: "+
                    aux.getApellidos()+"\nEdad: "+aux.getEdad()+"\nCódigo: "
                    +aux.getCodigo());
            aux =aux.getSgte();
        }
    }
}
