package class1;
import java.util.List;

public class TransmilenioBus extends Bus{
	private List<Pasajero> pasajeros;
	private RutasTransmi ruta;
	public TransmilenioBus(int placa, List<Pasajero> pasajeros, RutasTransmi ruta) {
		super(placa);
		this.pasajeros = pasajeros;
		this.ruta = ruta;
	}
	
}	

