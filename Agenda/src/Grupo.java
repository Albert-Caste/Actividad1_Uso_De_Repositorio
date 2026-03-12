import java.util.List;
import  java.util.ArrayList;


public class Grupo {
    private String nombre;
    private int id;

    private List<Contacto> listContactoGrupo;

    public List<Contacto> getListContactoGrupo() {
        return listContactoGrupo;
    }

    public void setListContactoGrupo(List<Contacto> listContactoGrupo) {
        this.listContactoGrupo = listContactoGrupo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
