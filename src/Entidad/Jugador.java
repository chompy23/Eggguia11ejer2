package Entidad;

/**
 * Clase Jugador: esta clase posee los siguientes atributos: id (representa el
 * número del jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por
 * ejemplo) y mojado (indica si está mojado o no el jugador). El número de
 * jugadores será decidido por el usuario, pero debe ser entre 1 y 6. Si no está
 * en este rango, por defecto será 6. Métodos: • disparo(Revolver r): el método,
 * recibe el revolver de agua y llama a los métodos de mojar() y
 * siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si
 * el revolver tira el agua, el jugador se moja. El atributo mojado pasa a false
 * y el método devuelve true, sino false.
 */
public class Jugador {

    private Integer id; //representa el número del jugador
    private String nombre; //Empezara con Jugador más su ID
    private boolean mojado;//indica si está mojado o no el jugador

    public Jugador() {

    }
    Revolver rev = new Revolver();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    /*
    el método, recibe el revolver de agua y llama a los 
     métodos de mojar() y siguienteChorro() de Revolver. El jugador se apunta, 
     aprieta el gatillo y si el revolver tira el agua, el jugador se moja. 
    El atributo mojado pasa a false y el método devuelve true, sino false.
     */
    public void disparo() {
        rev.mojar();
        rev.siguienteChorro();
        

    }

}
