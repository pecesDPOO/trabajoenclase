package class1;

import java.util.List;
public class SITPbus extends Bus{
	private List<Pasajero> pasajeros;
	private RutasSITP ruta;
	public SITPbus(int placa, List<Pasajero> pasajeros, RutasSITP ruta) {
		super(placa);
		this.pasajeros = pasajeros;
		this.ruta = ruta;
	}
	
	
}
