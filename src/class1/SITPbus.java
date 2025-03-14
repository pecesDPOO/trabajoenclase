package class1;
public class SITPbus extends Bus {
    private RutasSITP ruta;

    public SITPbus(int placa, RutasSITP ruta) {
        super(placa);
        this.ruta = ruta;
    }

    public void cambiarRuta(RutasSITP nuevaRuta) {
        this.ruta = nuevaRuta;
    }

    public RutasSITP getRuta() {
        return ruta;
    }

    public void setRuta(RutasSITP ruta) {
        this.ruta = ruta;
    }
}

	
	
