import org.componentes.elevadores.Ascensor;

public class ElevadorFacil {
    public static void main(String[] args) {
        Ascensor ascen = new Ascensor(350);

        ascen.llamar(2);
        ascen.llamar(6);
    }
}
