package class1;
import java.util.List;

public class TransmilenioBus extends Bus {
    private RutasTransmi ruta;
    
    public TransmilenioBus(int placa, RutasTransmi ruta) {
        super(placa);
        this.ruta = ruta;
    }

    public void cambiarRuta(RutasTransmi nuevaRuta) {
        this.ruta = nuevaRuta;
    }

    public RutasTransmi getRuta() {
        return ruta;
    }

    public void setRuta(RutasTransmi ruta) {
        this.ruta = ruta;
    }}

