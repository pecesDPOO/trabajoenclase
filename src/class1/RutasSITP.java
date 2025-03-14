package class1;

import java.util.List;
import java.util.ArrayList;

public class RutasSITP {
    private List<Paradero> ruta;

    public RutasSITP() {
        this.ruta = new ArrayList<Paradero>();
    }

    public void agregarParadero(Paradero paradero) {
        ruta.add(paradero);
    }

    public void quitarParadero(Paradero paradero) {
        if (ruta.remove(paradero)) {
        } else {
        }
    }

    public List<Paradero> getRuta() {
        return ruta;
    }

    public void setRuta(List<Paradero> ruta) {
        this.ruta = ruta;
    }
}