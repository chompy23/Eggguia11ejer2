package Entidad;

/**
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición
 * actual (posición del tambor que se dispara, puede que esté el agua o no) y
 * posición agua (la posición del tambor donde se encuentra el agua). Estas dos
 * posiciones, se generarán aleatoriamente. Métodos: • llenarRevolver(): le pone
 * los valores de posición actual y de posición del agua. Los valores deben ser
 * aleatorios. • mojar(): devuelve true si la posición del agua coincide con la
 * posición actual • siguienteChorro(): cambia a la siguiente posición del
 * tambor • toString(): muestra información del revolver (posición actual y
 * donde está el agua)
 */
public class Revolver {

    private Integer posicionActual;//posición del tambor que se dispara, puede que esté el agua o no
    private Integer posicionAgua;//la posición del tambor donde se encuentra el agua
    private Jugador jug;

    public Revolver() {
        jug = new Jugador();

    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    /*
    le pone los valores de posición actual y de posición del 
    agua. Los valores deben ser aleatorios
     */
    public void llenarRevolver() {
        posicionActual = (int) (Math.random() * 6 + 1);
        posicionAgua = (int) (Math.random() * 6 + 1);

    }

    /*
     devuelve true si la posición del agua coincide con la posición actual
     */
    public boolean mojar() {
        boolean mojar = false;
        if (posicionActual == posicionAgua) {
            mojar = true;
            jug.setMojado(mojar);

        } else {
            mojar = false;
            jug.setMojado(mojar);
        }
        return mojar;
    }

    /*
     cambia a la siguiente posición del tambor
     */
    public void siguienteChorro() {
        int contDisp = 6;
        
            if ((posicionActual == 6) && (contDisp != 0)) {
                posicionActual = 1;
                --contDisp;
            } else if (posicionActual != 6 && (contDisp != 0)) {
                ++posicionActual;
                --contDisp;
            }
            

        

    }



@Override
public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

}

