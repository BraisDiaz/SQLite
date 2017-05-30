
package ejemplosqlite;

import java.sql.*;

/**
 *
 * @author Brais Núñez
 */
public class Conexiones {

    static Connection conexion;
    private String url = "C:\\Users\\Brais Núñez\\Desktop\\Desarrollo de aplicaciones multiplataforma\\Programacion\\3ªEvaluacion\\EjemploSQLite\\baseJugadores2.db";
     
    /**
     * Sirve para cargar los drivers que permiten el acceso a la base de datos.
     */   
    public void cargarDrivers(){        
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            System.out.println("Lo sentimos, no se pudieron encontrar los drivers necesarios");
        }   
    }
    
    /**
     * Permite conectarnos a la base de datos, dándole la url de la misma.
     */
    public void conectarse(){
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:" + url);
            System.out.println("Conectado");
        } catch (SQLException ex) {
            System.out.println("Conexión errónea");
        }
    }         
    public static void cerrarBase(){
        try {
            conexion.close();
            System.out.println("Cierre de la base completado");
        } catch (SQLException ex) {
            System.out.println("No se puede cerrar la base de datos, disculpe las molestias");
        }
    }
    
    
}
