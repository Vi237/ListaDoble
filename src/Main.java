import lcde.ListaCircularDoble;

public class Main {
    public static void main(String[] args) {
        ListaCircularDoble listaCircularDoble=new ListaCircularDoble();
        System.out.println(listaCircularDoble.estaVacia());
        for (int i = 1; i <= 7; i++) {
            listaCircularDoble.insertarFinal(i);
        }
        listaCircularDoble.mostrar();
        listaCircularDoble.eliminarFinal();
        listaCircularDoble.mostrar();
        listaCircularDoble.mostrarAdelante(2);
    }
}
