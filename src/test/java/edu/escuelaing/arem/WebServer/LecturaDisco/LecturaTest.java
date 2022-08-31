package edu.escuelaing.arem.WebServer.LecturaDisco;
import static org.junit.Assert.*;
import org.junit.Test;
public class LecturaTest {

    @Test
    public void deberiaLeerArchivosdeldisco(){
        Lectura.leer("index.html");
    }
}
