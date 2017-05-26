
package ejemplosqlite;

/**
 *
 * @author Brais Núñez
 */
public class Jugador {
    
    private String nombreJug, apellidosJug, dniJug, edadJug;

    public Jugador() {
    }
    
    public Jugador(String nombreJug, String apellidosJug, String dniJug, String edadJug) {
        this.nombreJug = nombreJug;
        this.apellidosJug = apellidosJug;
        this.dniJug = dniJug;
        this.edadJug = edadJug;
    }

    public String getNombreJug() {
        return nombreJug;
    }

    public void setNombreJug(String nombreJug) {
        this.nombreJug = nombreJug;
    }

    public String getApellidosJug() {
        return apellidosJug;
    }

    public void setApellidosJug(String apellidosJug) {
        this.apellidosJug = apellidosJug;
    }

    public String getDniJug() {
        return dniJug;
    }

    public void setDniJug(String dniJug) {
        this.dniJug = dniJug;
    }

    public String getEdadJug() {
        return edadJug;
    }

    public void setEdadJug(String edadJug) {
        this.edadJug = edadJug;
    }

    @Override
    public String toString() {
        return "Jugador{" + "Nombre del jugador: " + nombreJug + ", Apellidos del jugador: "
         + apellidosJug + ", DNI del jugador = " + dniJug + ", Edad del jugador: " + edadJug + '}';
    }
    
    
    
    
    
    
}
