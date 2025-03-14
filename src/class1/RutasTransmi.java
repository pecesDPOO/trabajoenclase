package class1;
import java.util.List;
import java.util.ArrayList;
import class1.Estacion;

public class RutasTransmi {
    private List<Estacion> ruta;

    public RutasTransmi() {
        this.ruta = new ArrayList<Estacion>();
    }

    public void agregarEstacion(Estacion estacion) {
        ruta.add(estacion);
    }

    public void quitarEstacion(Estacion estacion) {
        if (ruta.remove(estacion)) {
        } else {
        }
    }

    public List<Estacion> getRuta() {
        return ruta;
    }

    public void setRuta(List<Estacion> ruta) {
        this.ruta = ruta;
    }
}
