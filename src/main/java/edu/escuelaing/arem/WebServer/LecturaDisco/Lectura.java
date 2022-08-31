package edu.escuelaing.arem.WebServer.LecturaDisco;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lectura {

    public static String leer(String nArchivo){
        Path file = Paths.get("...\\resources\\public\\" + nArchivo);
        String doc = "";
        try (InputStream in = Files.newInputStream(file);
             BufferedReader reader =
                     new BufferedReader(new InputStreamReader(in))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                doc += line;
            }
        } catch (IOException x) {
            System.err.println(x);
        }
        return doc;
    }
}
