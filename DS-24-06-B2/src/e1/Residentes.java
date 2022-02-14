package e1;

public class Residentes extends Integrantes {
    private final Criaturas criaturas;
    private final Casa casa;


    enum Criaturas{
        Estudiante,
        Fantasmas
    }

    enum Casa{
        Gryffindor,
        Hufflepuff,
        Ravenclaw,
        Slytherin
    }

    public Casa getCasa() {
        return casa;
    }

    public Criaturas getCriaturas(){
        return criaturas;
    }


    public void setRecompensas() {
        if(this.criaturas==Criaturas.Fantasmas){
            this.recompensas = horrocruxes*80;
        }
        else if(criaturas==Criaturas.Estudiante){
            if(this.casa==Casa.Slytherin){
                this.recompensas = (horrocruxes*90) * 0.75;
            }
            else{
                this.recompensas = horrocruxes*90;
            }
        }
    }

    public Residentes(String nombres, String apellidos, int edad,Criaturas criatura, Casa casas, int horocruxes){
        super(nombres,apellidos,edad,horocruxes);
        this.criaturas=criatura;
        this.casa=casas;
    }



}
