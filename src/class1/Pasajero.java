package class1;

public class Pasajero extends Persona {
    private String nombre;
    private int id;
    private Tag tagid;

    public Pasajero(String nombre, int id, Tag tagid) {
        this.nombre = nombre;
        this.id = id;
        this.tagid = tagid;
    }

    public boolean verificarTag(Tag tag) {
        return this.tagid == tag;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tag getTagid() {
        return tagid;
    }

    public void setTagid(Tag tagid) {
        this.tagid = tagid;
    }
}
