package lcde;

public class ListaCircularDoble {
    Nodo inicio;
    public ListaCircularDoble(){
        inicio=null;
    }
    public  boolean estaVacia(){
        return inicio==null;
    }
    public void  insertarFinal(Object dato){
        if(estaVacia()){
            Nodo nuevo=new Nodo();
            nuevo.setAnterior(nuevo);
            nuevo.setDato(dato);
            nuevo.setSiguiente(nuevo);
            inicio=nuevo;
        }else{
            Nodo ultimo=inicio;
            while (ultimo.getSiguiente()!=inicio){
                ultimo=ultimo.getSiguiente();
            }
            Nodo nuevo=new Nodo();
            nuevo.setAnterior(ultimo);
            nuevo.setDato(dato);
            nuevo.setSiguiente(inicio);

            ultimo.setSiguiente(nuevo);
            inicio.setAnterior(nuevo);
        }
    }
    public void eliminarFinal(){
        if(!estaVacia()) {
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() != inicio) {
                ultimo = ultimo.getSiguiente();
            }
            Nodo penultimo = ultimo.getAnterior();
            penultimo.setSiguiente(inicio);
            inicio.setAnterior(penultimo);
        }
    }
    public void mostrar(){
        if(!estaVacia()){
            Nodo aux=inicio;
            while (aux.getSiguiente()!=inicio){
                System.out.print(aux.getDato()+"  ");
                aux=aux.getSiguiente();
            }
            System.out.println(aux.getDato());
        }
    }
    public void mostrarAdelante(int vueltas){
        if(!estaVacia()){
            Nodo tem=inicio;
            int contador=0;
            while (contador<vueltas){
                if(tem.getSiguiente()==inicio){
                    contador++;
                }
                System.out.print(tem.getDato()+"   ");
                tem=tem.getSiguiente();
            }
            System.out.println();
        }
    }
    public void mostrarAtras(int vueltas){
        if(!estaVacia()){
            Nodo tem=inicio.getAnterior();
            int contador=0;
            while (contador<vueltas){
                if(tem.getAnterior()==inicio){
                    contador++;
                }
                System.out.print(tem.getDato()+"   ");
                tem=tem.getAnterior();
            }
            System.out.println(tem.getDato());
        }
    }
}
