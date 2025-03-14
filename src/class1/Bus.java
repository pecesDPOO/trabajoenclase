package class1;

import java.util.List;
import java.util.ArrayList;

public class Bus {
    private int placa;
    private List<Tag> tags;
    
    public Bus(int placa) {
        this.placa = placa;
        this.tags = new ArrayList<Tag>();
    }

    public void anadirPasajero(Tag tag) {
        if (tags.size() < 270) {
            tags.add(tag);
        } else {
            System.out.println("El bus está lleno.");
        }
    }

    public void quitarPasajero(Tag tag) {
        if (tags.remove(tag)) {
            System.out.println("Pasajero eliminado.");
        } else {
            System.out.println("El pasajero no estaba en el bus.");
        }
    }

    public int obtenerNumeroPasajeros() {
        return tags.size();
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
