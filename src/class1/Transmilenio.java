package class1;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import class1.Conductor;
import class1.Estacion;
import class1.Paradero;
import class1.Persona;
import class1.RutasSITP;
import class1.RutasTransmi;
import class1.SITPbus;
import class1.TransmilenioBus;

public class Transmilenio {
	private List<SITPbus> busesSITP;
	private List<TransmilenioBus> busesTransmi;
	private List<RutasSITP> rutasSITP;
	private List<RutasTransmi> rutasTransmi;
	private HashMap<Conductor, TransmilenioBus> conductoresTransmilenio;
	private HashMap<Conductor, SITPbus> conductoresSITP;
	
	public Transmilenio(List<SITPbus> busesSITP, List<TransmilenioBus> busesTransmi, List<RutasSITP> rutasSITP,
			List<RutasTransmi> rutasTransmi, HashMap<Conductor, TransmilenioBus> conductoresTransmilenio,
			HashMap<Conductor, SITPbus> conductoresSITP) {
		super();
		this.busesSITP = busesSITP;
		this.busesTransmi = busesTransmi;
		this.rutasSITP = rutasSITP;
		this.rutasTransmi = rutasTransmi;
		this.conductoresTransmilenio = conductoresTransmilenio;
		this.conductoresSITP = conductoresSITP;
	}
	
	
}
