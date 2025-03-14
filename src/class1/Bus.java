package class1;

import java.util.List;
import java.util.ArrayList;

public class Bus {
	private int placa;
	private List<Tag> tags;
	public Bus(int placa, List<Tag> pasajeros) {
		this.placa = placa;
		this.tags = new ArrayList<Tag>();
		}
	public void anadirPasajero(Tag tag) {
		tags.add(tag);}
	public void quitarPasajero(Tag tag) {
		tags.remove(tag);}
	public ArrayList<Tag> getInfo() {
		return (ArrayList<Tag>) tags;}
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
	

