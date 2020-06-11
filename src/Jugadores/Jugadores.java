package Jugadores;
public class Jugadores implements Conjunto {

    private Nodo Cabeza;

    private int Tam;

    public Jugadores()  {
        setCabeza(null);
        setTam(0);
    }
    //Métodos Setter
    public void setCabeza(Nodo c) {
        this.Cabeza = c;
    }
    public void setTam(int t) {
        this.Tam = t;
    }
    //Métodos Getter
    public Nodo getCabeza() {
        return Cabeza;
    }
    public int getTam() {
        return Tam;
    }
    
    //Método para buscar un elemento especifico y devuelva un booleano
    public boolean EncontrarElemento(Object elemento) {
        nodo aux = getInicio; //creamos un nodo auxiliar que nos permita recorrer la lista e igualamos a inicio
        while(aux!=null){ //mientras el auxiliar no se nulo 
            if(aux.getValor()==elemento){ //si nuestro auxiliar es igual a nuestro dato entonces
                return true; //retornar verdad
            }
            aux = aux.getSgte(); //sucede si no es encontrado y se continua buscando al igualar al siguiente
        }
        return false; //sucede si no encontro nada dentro de la lista entonces devuelve falso
    }
    
    
    //Método para agregar un elemnto y devuelva un booleano
    public Object AddElemento(Object elemento) {  
        if(!EncontrarElemento(elemento)){ //si no esta el dato dentro de la lista
            nodo nuevo = new Nodo(); //crea nuevo nodo
            nuevo.setValor(elemento); //se asigna el elemento/jugador
            if(getInicio()==null){ //si el inicio es nulo entonces
                setInicio(nuevo); //Etonces este elemento/jugador sera el inicio
                return true; //retornar verdad=elemento agregado
            }else{ //en caso de tener un objeto/jugador se procede a recorrer
                nodo aux = getInicio(); // creamos un nodo auxiliar para recorrer la lista
                if(aux.getValor()>elemento){ //--si tuviero un dato como int-- si el inicio*{auxiliar} es mayor al elemento/jugador insertado
                    nuevo.setSgte(aux); //se inserta antes,para que el siguiente de nuevo sea nuestro auxiliar (inicio)
                    setInicio(nuevo); //inicio se cambio por el nuevo nodo
                    return true; //retorna verdadero porque se realizo la insercion
                }
                while(aux.getSgte()!)=null{ //procedemos a recorrer, si el siguiente aux no es igual a nulo entonces
                        if(aux.getSgte().getValor()>elemento){ //si el elemento/jugador siguiente al aux es mayor al elemento/jugador insetar se debe insertar el nodo antes
                            nuevo.setSgte(aux.getSgte()); //el siguiente del nuevo sera el siguiente del aux
                            aux.setSgte(nuevo); //y el siguente de nuevo sera nuestro nuevo nodo entonces se inserta en la mitad del ultimo y el penultimo
                            return true; //se regresa verdad 
                            
                        }
                        aux = aux.getSgte(); //se llega aqui cuando ya no hay que recorrer en la lista
                    }
                    //se llega aqui para insertar el nodo al final
                    aux = aux.setSgte(nuevo);  //entonces se inserta al final cuando el siguente de aux(ultimo nodo) se convierte en el nuevo nodo
                    return true; //retorna verdad por insertar
                 
                }
        }else{ // en este caso ya se encuentra en la lista
            System.out.println("Jugador ya se encuentra en la lista");
            return false; //devuelve falso y no se inserta
        }
    }
    
    
    
    //Método para saber si esta vacia la lista
   public boolean Vacio() {
        return (Cabeza==null)?true:false;
    }
    //Método para obtener la referencia al siguiente
   public Object Obtener(int i) {
        int contador = 0;
        Nodo temp = Cabeza;
        while(contador<i){
            temp = temp.ObtenerSiguiente();
            contador++;
        }
        return temp.ObtenerValor();
    }
    //Método para eliminar el primer elemento de la lista
    public void EliminarPrimero() {
        Cabeza = Cabeza.ObtenerSiguiente();
        Tam--;
    }
    //Método para eliminar cualquier nodo de la lista
    public void Eliminar(int i) {
        int contador = 0;
        Nodo temp = Cabeza;
        if(i==0){
            Cabeza = Cabeza.ObtenerSiguiente();
        }else {
            while(contador<i-1){
                temp = temp.ObtenerSiguiente();
                contador++;
            }
            temp.EnlazarSiguiente(temp.ObtenerSiguiente().ObtenerSiguiente());
        }
        Tam--;
    }
    //Método para imprimir
     public void Imprimir(){
        for(int i=0;i<getTam();i++){
            System.out.println(Obtener(i));
        }
    }
    //Méetdo para poder imprimir la informacion del nodo
    public Object Buscar(Object elemento) {
        
    }
}
