
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String archivoBinario = "partidos.dat";
        String archivoTexto = "partidos.txt";

        List<PartidoPadel> torneo = new ArrayList<>();
        torneo.add(new PartidoPadel("Pablo/Andre", "Pedro/Sebastian", "6-4, 4-6, 7-6"));
        torneo.add(new PartidoPadel("Ana/Victoria", "Elena/Domenica", "6-2, 6-3"));

        GestorPadelBinario gestorBinario = new GestorPadelBinario();
        GestorPadelTexto gestorTexto = new GestorPadelTexto();

        System.out.println("--- PRUEBA DE PERSISTENCIA BINARIA (.dat) ---");
        gestorBinario.guardarPartidos(torneo, archivoBinario);
        List<PartidoPadel> recuperadosBinario = gestorBinario.cargarPartidos(archivoBinario);
        for (PartidoPadel p : recuperadosBinario) {
            System.out.println(p);
        }

        System.out.println("\n--- PRUEBA DE PERSISTENCIA EN TEXTO (.txt) ---");
        gestorTexto.guardarPartidos(torneo, archivoTexto);
        List<PartidoPadel> recuperadosTexto = gestorTexto.cargarPartidos(archivoTexto);
        for (PartidoPadel p : recuperadosTexto) {
            System.out.println(p);
        }
    }
}
