package e2;

public class GestionDeDependecias {

    public static void AnadirTareas(Dependencias dependencias,String tareas){
        dependencias.addTareas(tareas);
    }

    public static String OrdenarDependencias(Dependencias dependencia){
        return dependencia.RealizarTareas();
    }

}
