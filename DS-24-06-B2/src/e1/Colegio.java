package e1;

import java.util.ArrayList;

public class Colegio{
    private final ArrayList<Integrantes> Integranteslist = new ArrayList<>();

    public void addIntegrante(Integrantes Integrante){
        if(!Integranteslist.isEmpty()) {
            for (Integrantes intengrante1 : Integranteslist) {
                if (Integrante instanceof Docentes && intengrante1 instanceof Docentes && ((Docentes) Integrante).getAsignatura() == ((Docentes) intengrante1).getAsignatura()) {
                    throw new IllegalArgumentException();
                }
            }
        }
        Integranteslist.add(Integrante);
    }

    public void cleanLists(){
        Integranteslist.clear();
    }

    public String imprimirRecompensas(ArrayList<Integrantes> Integranteslist){
        StringBuilder info = new StringBuilder();
        if(!Integranteslist.isEmpty()){
            double gasto = 0;
            for(Integrantes integrantes : Integranteslist){
                integrantes.setRecompensas();
                if(integrantes instanceof Docentes ){
                    info.append(integrantes.nombre).append(" ").append(integrantes.apellido).append(" (Docente de ").append(((Docentes) integrantes).getAsignatura()).append(", ").append(integrantes.horrocruxes).append(" horrocruxes): ").append(integrantes.recompensas).append(" galeones\n");
                }
                else if(integrantes instanceof Guardabosques){
                    info.append(integrantes.nombre).append(" ").append(integrantes.apellido).append(" (Guardabosques, ").append(integrantes.horrocruxes).append(" horrocruxes): ").append(integrantes.recompensas).append(" galeones\n");
                }
                else if(integrantes instanceof Conserjes){
                    info.append(integrantes.nombre).append(" ").append(integrantes.apellido).append(" (Conserje, ").append(integrantes.horrocruxes).append(" horrocruxes): ").append(integrantes.recompensas).append(" galeones\n");
                }
                else if(integrantes instanceof Residentes && ((Residentes) integrantes).getCriaturas().equals(Residentes.Criaturas.Estudiante)){
                    info.append(integrantes.nombre).append(" ").append(integrantes.apellido).append(" (Estudiante de ").append(((Residentes) integrantes).getCasa()).append(", ").append(integrantes.horrocruxes).append(" horrocruxes): ").append(integrantes.recompensas).append(" galeones\n");
                }
                else if(integrantes instanceof Residentes && ((Residentes) integrantes).getCriaturas().equals(Residentes.Criaturas.Fantasmas)){
                    info.append(integrantes.nombre).append(" ").append(integrantes.apellido).append(" (Fantasma de ").append(((Residentes) integrantes).getCasa()).append(", ").append(integrantes.horrocruxes).append(" horrocruxes): ").append(integrantes.recompensas).append(" galeones\n");
                }
                gasto += integrantes.recompensas;
            }
            info.append("La recompensa total del Colegio Hogwarts es de ").append(gasto).append(" galeones");
        }

        return info.toString().trim();
    }

    public String imprimirSalarios(ArrayList<Integrantes> integranteslist){
        StringBuilder info = new StringBuilder();
        if(!integranteslist.isEmpty()){
            int gasto = 0;
            for(Integrantes integrantes : integranteslist){
                if (integrantes instanceof Personal) {
                    ((Personal) integrantes).setSueldo();
                    if(integrantes instanceof Docentes){
                        info.append(integrantes.nombre).append(" ").append(integrantes.apellido).append(" (Docente de ").append(((Docentes) integrantes).getAsignatura()).append("): ").append(((Personal)integrantes).sueldo).append(" galeones\n");
                    }
                    else if(integrantes instanceof Guardabosques){
                        info.append(integrantes.nombre).append(" ").append(integrantes.apellido).append(" (Guardabosques): ").append(((Personal)integrantes).sueldo).append(" galeones\n");
                    }
                    else if(integrantes instanceof Conserjes) {
                        info.append(integrantes.nombre).append(" ").append(integrantes.apellido).append(" (Conserje): ").append(((Personal)integrantes).sueldo).append(" galeones\n");
                    }
                    gasto += ((Personal)integrantes).sueldo;
                }
            }
            info.append("El gasto de Hogwarts en personal es de ").append(gasto).append(" galeones");
        }

        return info.toString().trim();
    }

}