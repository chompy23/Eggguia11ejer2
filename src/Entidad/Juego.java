package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto
 * de Jugadores) y Revolver Métodos: • llenarJuego(ArrayList<Jugador>jugadores,
 * Revolver r): este método recibe los jugadores y el revolver para guardarlos
 * en los atributos del juego. 10 • ronda(): cada ronda consiste en un jugador
 * que se apunta con el revolver de agua y aprieta el gatillo. Sí el revolver
 * tira el agua el jugador se moja y se termina el juego, sino se moja, se pasa
 * al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
 * mojar. Al final del juego, se debe mostrar que jugador se mojó. Pensar la
 * lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
public class Juego {

    private List<Jugador> jugadores;
    private Revolver revolver;
    private Jugador jugad;
    Scanner leer = new Scanner(System.in);

    public Juego() {
        jugadores = new ArrayList();
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    /*
     este método recibe los jugadores y el revolver para guardarlos
     en los atributos del juego.
     */
    public void llenarJuego() {
       System.out.println(" Ingrese el N° de jugadores ");
        Integer numJug = leer.nextInt();
        if ((numJug < 1)&& (numJug > 6)) {
            numJug = 6 ;
            
        }
        while (numJug!= 0) {
            jugad = new Jugador();
            revolver = new Revolver();
            jugad.setId(numJug);
            jugad.setNombre("jugador" + jugad.getId());
            jugad.setMojado(false);
            jugadores.add(jugad);
            revolver.llenarRevolver();
            --numJug;
                        

        }
        

    }

    /*
    Cada ronda consiste en un jugador que se apunta con el revolver de 
    agua y aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y
    se termina el juego, sino se moja, se pasa al siguiente jugador hasta que 
    uno se moje. 
    Si o si alguien se tiene que mojar. Al final del juego, se debe mostrar 
    que jugador se mojó
     */
    public void ronda() {

    }
}
