package e1;

public class Docentes extends Personal{

    private final Asignatura asignatura;

    public Docentes(String nombres, String apellidos, int edades, int horocruxes,Asignatura asignaturas) {
        super(nombres, apellidos, edades, horocruxes);
        this.asignatura=asignaturas;
    }

    enum Asignatura{Defensa,Transformaciones,Pociones,Herbologia,Historia}

    public Asignatura getAsignatura() {
        return asignatura;
    }


    public void setRecompensas() {
        if (asignatura == Asignatura.Defensa){
            this.recompensas = (50 * horrocruxes) * 0.75;
        }else{
            this.recompensas=(50*horrocruxes);
        }
    }

    public void setSueldo(){
        if (asignatura == Asignatura.Historia){
            this.sueldo=500;
        } else {
            if (asignatura == Asignatura.Transformaciones){
                this.sueldo=400;
            } else {
                if (asignatura == Asignatura.Defensa){
                    this.sueldo=500;
                }else {
                    if (asignatura == Asignatura.Herbologia){
                        this.sueldo=250;
                    }else {
                        if (asignatura == Asignatura.Pociones){
                            this.sueldo=350;
                        } else {
                            this.sueldo=0;
                        }
                    }
                }
            }
        }
    }

}
