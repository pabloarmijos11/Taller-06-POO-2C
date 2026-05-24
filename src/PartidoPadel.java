
import java.io.Serializable;

public class PartidoPadel implements Serializable {

    private static final long serialVersionUID = 1L;

    private String pareja1;
    private String pareja2;
    private String marcadorFinal;

    public PartidoPadel(String pareja1, String pareja2, String marcadorFinal) {
        this.pareja1 = pareja1;
        this.pareja2 = pareja2;
        this.marcadorFinal = marcadorFinal;
    }

    public String getPareja1() {
        return pareja1;
    }

    public void setPareja1(String pareja1) {
        this.pareja1 = pareja1;
    }

    public String getPareja2() {
        return pareja2;
    }

    public void setPareja2(String pareja2) {
        this.pareja2 = pareja2;
    }

    public String getMarcadorFinal() {
        return marcadorFinal;
    }

    public void setMarcadorFinal(String marcadorFinal) {
        this.marcadorFinal = marcadorFinal;
    }

    public String toString() {
        return "Partido: " + pareja1 + " vs " + pareja2 + " | Resultado: " + marcadorFinal;
    }
}
