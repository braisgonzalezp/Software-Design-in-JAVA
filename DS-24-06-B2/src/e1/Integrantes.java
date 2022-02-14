package e1;

public abstract class Integrantes{
    double recompensas;
    public int horrocruxes;
    public int edad;
    public String nombre;
    public String apellido;


    public Integrantes(String nombres, String apellidos, int edades, int horocruxes) {
        this.nombre=nombres;
        this.apellido=apellidos;
        this.edad=edades;
        this.recompensas=getRecompensas();
        this.horrocruxes=horocruxes;

    }


    private double getRecompensas() {
        return recompensas;
    }

    abstract public void setRecompensas();

}
