package e1;


public abstract class Personal extends Integrantes{
    int sueldo;

    public double getRecompensas() {
        return recompensas;
    }

    public abstract void setRecompensas();

    public int getSueldo(){
        return sueldo;
    }

    public abstract void setSueldo();

    public Personal(String nombres, String apellidos, int edades, int horocruxes){
        super(nombres,apellidos,edades,horocruxes);
        this.sueldo=getSueldo();
    }


}
