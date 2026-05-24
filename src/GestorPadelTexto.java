
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorPadelTexto {

    public void guardarPartidos(List<PartidoPadel> partidos, String rutaArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (PartidoPadel p : partidos) {
                String linea = p.getPareja1() + ";" + p.getPareja2() + ";" + p.getMarcadorFinal();
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Partidos guardados exitosamente en formato texto plano (.txt)");
        } catch (IOException e) {
            System.err.println("Error al guardar en texto: " + e.getMessage());
        }
    }

    public List<PartidoPadel> cargarPartidos(String rutaArchivo) {
        List<PartidoPadel> partidos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 3) {
                    partidos.add(new PartidoPadel(datos[0], datos[1], datos[2]));
                }
            }
            System.out.println("Partidos cargados exitosamente desde texto plano.");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo de texto aún no existe. Se creará al guardar.");
        } catch (IOException e) {
            System.err.println("Error al cargar texto: " + e.getMessage());
        }
        return partidos;
    }
}
