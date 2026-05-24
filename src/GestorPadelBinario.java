
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorPadelBinario {

    public void guardarPartidos(List<PartidoPadel> partidos, String rutaArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            oos.writeObject(partidos);
            System.out.println("Partidos guardados exitosamente en formato binario (.dat)");
        } catch (IOException e) {
            System.err.println("Error al guardar en binario: " + e.getMessage());
        }
    }

    public List<PartidoPadel> cargarPartidos(String rutaArchivo) {
        List<PartidoPadel> partidos = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            partidos = (List<PartidoPadel>) ois.readObject();
            System.out.println("Partidos cargados exitosamente desde binario.");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo binario aún no existe. Se creará al guardar.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar binario: " + e.getMessage());
        }
        return partidos;
    }
}
