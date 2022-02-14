package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColegioTest {
/*
    private final Colegio colegio = new Colegio();

    @BeforeEach
    void setUp(){colegio.cleanLists();}

    @Test
    void  testResultado () {

        Residentes residentes1 = new Residentes("Hermione", "Granger", 18, Residentes.Criaturas.Estudiante, Residentes.Casa.Gryffindor, 3);
        Residentes residentes2 = new Residentes("Barón", "Sanguinario", 321, Residentes.Criaturas.Fantasmas, Residentes.Casa.Slytherin, 2);
        Guardabosques guardabosques = new Guardabosques("Rubeus", "Hagrid", 64, 2, true);
        Docentes docentes1 = new Docentes("Minerva", "McGonagall", 47, 1, Docentes.Asignatura.Transformaciones);
        Docentes docentes3 = new Docentes("Minerva", "McGonagall", 48, 1, Docentes.Asignatura.Transformaciones);
        Docentes docentes2 = new Docentes("Severus", "Snape", 47, 2, Docentes.Asignatura.Defensa);
        Conserjes conserjes = new Conserjes("Argus", "Filch", 32, 0, true);

        colegio.addIntegrante(residentes1);
        colegio.addIntegrante(residentes2);
        colegio.addIntegrante(guardabosques);
        colegio.addIntegrante(docentes1);
        colegio.addIntegrante(docentes2);
        colegio.addIntegrante(conserjes);


        assertEquals("""
                Hermione Granger (Estudiante de Gryffindor, 3 horrocruxes): 270.0 galeones
                Barón Sanguinario (Fantasma de Slytherin, 2 horrocruxes): 160.0 galeones
                Rubeus Hagrid (Guardabosques, 2 horrocruxes): 150.0 galeones
                Minerva McGonagall (Docente de Transformaciones, 1 horrocruxes): 50.0 galeones
                Severus Snape (Docente de Defensa, 2 horrocruxes): 75.0 galeones
                Argus Filch (Conserje, 0 horrocruxes): 0.0 galeones
                La recompensa total del Colegio Hogwarts es de 705.0 galeones""", colegio.imprimirRecompensas(colegio.Integranteslist));

        assertEquals("""
                Rubeus Hagrid (Guardabosques): 180 galeones
                Minerva McGonagall (Docente de Transformaciones): 400 galeones
                Severus Snape (Docente de Defensa): 500 galeones
                Argus Filch (Conserje): 160 galeones
                El gasto de Hogwarts en personal es de 1240 galeones""", colegio.imprimirSalarios(colegio.Integranteslist));

        colegio.cleanLists();

        Docentes docentes4 = new Docentes("Minerva", "McGonagall", 47, 1, Docentes.Asignatura.Transformaciones);

        colegio.addIntegrante(docentes4);
        assertThrows(IllegalArgumentException.class, () -> colegio.addIntegrante(docentes3));
*/
    }
