package e1;

public class Guardabosques extends Personal{
    private final boolean nocturnidad;

    private boolean isNocturnidad() {
        return nocturnidad;
    }



    public Guardabosques(String nombres, String apellidos, int edades, int horocruxes,boolean nocturnidad) {
        super(nombres, apellidos, edades, horocruxes);
        this.nocturnidad=nocturnidad;
    }

    public void setRecompensas() {
            this.recompensas=(75*horrocruxes);

    }

    public void setSueldo(){
       if(nocturnidad){
           this.sueldo=180;
       }
       else{
           this.sueldo=170;
       }
    }
}
