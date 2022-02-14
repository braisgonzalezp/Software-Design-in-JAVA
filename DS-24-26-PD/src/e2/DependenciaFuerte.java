package e2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class DependenciaFuerte implements Dependencias {


    private final List<Tareas> TareasTotales;
    private ArrayDeque<Tareas> pila;

    public DependenciaFuerte() {
        TareasTotales = new LinkedList<>();
        pila = new ArrayDeque<>();
    }

    public ArrayDeque<Tareas> OrdenarPila(ArrayDeque<Tareas> pila){
        ArrayDeque<Tareas> pilaaux = new ArrayDeque<>();
        while( !pila.isEmpty() ) {
            Tareas s1 = pila.pop();
            while (!pilaaux.isEmpty() && (pilaaux.peek().getTareas() < s1.getTareas())) {
                pila.push(pilaaux.pop());
            }
            pilaaux.push(s1);
        }
        return pilaaux;
    }

    public boolean padresDisponibles(char tarea){ //Compruebo si todos los padres de un hijo ya no están disponibles.

        boolean bool = false; //Lo inicializamos a false por si no se encuentra ningún padre con ese hijo

        for (Tareas aux : TareasTotales){ //Recorro toda la lista de tareas en busca de los padres que tengan el mismo hijo que le he pasado a la función
            for (char aux2 : aux.getAdyacente()){
                if (aux2 == tarea){ //Encontramos un padre (puede haber más de uno) que tiene el hijo deseado
                    if (!aux.isDisponible()){
                        bool = true;
                    } else {
                        return false; //En caso de que haya un solo padre que esté disponible, devuelve falso
                    }
                }
            }
        }

        return bool;
    }

    public void  AnadirTareasLista(Tareas tareas){
        int contador=0;

        do {
            if (TareasTotales.isEmpty()) {
                TareasTotales.add(tareas);
                return;
            } else {
                Tareas tareas1 = TareasTotales.get(contador);
                if (tareas1.getTareas() >= tareas.getTareas()) {
                    TareasTotales.add(contador, tareas);
                    return;
                }
                contador++;
            }
        } while (contador < TareasTotales.size());
        TareasTotales.add(tareas);
    }

    public void ActualizarTareasLista(char padre, char hijo){

        for (Tareas aux : TareasTotales){
            if (aux.getTareas() == padre){
                aux.setAdyacente(hijo);
            }
        }

    }

    public boolean isInTheList(char tarea){

        for (Tareas tareas : TareasTotales){
            if (tareas.getTareas() == tarea){
                return false;
            }
        }
        return true;

    }

    public boolean isHuerfano(char tarea){

        for (Tareas aux : TareasTotales){
            for (char aux2 : aux.getAdyacente()){
                if (aux2 == tarea){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void addTareas(String tareas){

        char padre, hijo;
        boolean existepadre;
        List<Character> auxiliar = new LinkedList<>();
        String[] tareasIndividuales = tareas.split("\n");

        for (String tareasIndividuale : tareasIndividuales) { //Primera parte del rellenado de la lista (Metemos los padres que tienen hijos)
            padre = tareasIndividuale.charAt(0);
            hijo = tareasIndividuale.charAt(5);
            existepadre = false;

            for (Tareas aux : TareasTotales){
                if (aux.getTareas() == padre) {
                    existepadre = true;
                    break;
                }
            }

            if (existepadre){
                ActualizarTareasLista(padre, hijo);
            } else {
                Tareas tarea = new Tareas(padre);
                tarea.setAdyacente(hijo);
                AnadirTareasLista(tarea);
            }

        }

        for (Tareas aux : TareasTotales){
            for (char aux2 : aux.getAdyacente()){
                if (isInTheList(aux2)){
                    auxiliar.add(aux2);
                }
            }
        }

        for (Character aux : auxiliar){
            if (isInTheList(aux)) {
                Tareas tarea = new Tareas(aux);
                AnadirTareasLista(tarea);
            }
        }

        for (Tareas aux : TareasTotales){
            if (isHuerfano(aux.getTareas())){
                aux.setRaiz(true);
            }
        }


    }

    @Override
    public String RealizarTareas() {

        Tareas cima, w;
        StringBuilder orden = new StringBuilder();

        for(Tareas aux : TareasTotales){
            if (aux.isRaiz()){
                pila.add(aux);
            }
        }

        while (!pila.isEmpty()){

            pila = OrdenarPila(pila);

            cima = pila.getFirst();

            if (cima.isRaiz()){
                cima.setDisponible(false);
            }

            for (int i = 0; i < cima.getAdyacente().size(); i++){
                for (Tareas aux : TareasTotales){
                    if (cima.getAdyacente().get(i) == aux.getTareas() && aux.isDisponible() && padresDisponibles(cima.getAdyacente().get(i))){
                        aux.setDisponible(false);
                        pila.add(aux);
                    }
                }
            }

            w = pila.removeFirst();
            orden.append(w.getTareas()).append(" ");

        }

        return orden.toString().trim();
    }


}