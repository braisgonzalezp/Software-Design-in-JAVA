package e1;

public class Conserjes extends Personal{

        private final boolean nocturnidad;


        public Conserjes(String nombres, String apellidos, int edades, int horocruxes,boolean nocturnidad) {
            super(nombres, apellidos, edades, horocruxes);
            this.nocturnidad=nocturnidad;
        }

        public void setRecompensas() {
            this.recompensas=(65*horrocruxes);

        }

        public void setSueldo(){
            if(nocturnidad){
                this.sueldo=160;
            }
            else{
                this.sueldo=150;
            }
        }
    }

