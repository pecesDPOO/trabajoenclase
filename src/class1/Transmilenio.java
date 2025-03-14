package class1;
import java.util.List;
import java.util.ArrayList;
public class Transmilenio {
    private List<SITPbus> busesSITP;
    private List<TransmilenioBus> busesTransmi;
    private List<RutasSITP> rutasSITP;
    private List<RutasTransmi> rutasTransmi;
    
    public Transmilenio() {
        this.busesSITP = new ArrayList<SITPbus>();
        this.busesTransmi = new ArrayList<TransmilenioBus>();
        this.rutasSITP = new ArrayList<RutasSITP>();
        this.rutasTransmi = new ArrayList<RutasTransmi>();
    }

    public void agregarBusSITP(SITPbus bus) {
        busesSITP.add(bus);
    }

    public void agregarBusTransmi(TransmilenioBus bus) {
        busesTransmi.add(bus);
    }

    public void agregarRutaSITP(RutasSITP ruta) {
        rutasSITP.add(ruta);
    }

    public void agregarRutaTransmi(RutasTransmi ruta) {
        rutasTransmi.add(ruta);
    }
}

