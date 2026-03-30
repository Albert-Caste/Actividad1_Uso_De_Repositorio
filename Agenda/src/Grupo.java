import java.util.List;
import  java.util.ArrayList;


public class Grupo {
    private String nombre;
    private int id;

    private List<Contacto> listContactoGrupo;

    //Constructor grupo

    public Grupo(String nombre,int id){
        this.nombre = nombre;
        this.id = id;
        this.listContactoGrupo = new ArrayList<>();
    }

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

    public void agregarContactoAGrupo(Contacto contacto){
        listContactoGrupo.add(contacto);
    }

    public String imprimirContactosDeUnGrupo(List<Contacto> listContactoGrupo){
        String contactos = "";
            for (Contacto ct : listContactoGrupo){
                contactos+= ct.getNombre() + " Alias " + ct.getAlias() + "\n";
            }
        return contactos;
    }


    @Override
    public String toString() {
        return "Grupo{" +
                "listContactoGrupo= tiene " + listContactoGrupo.size() +
                "contactos: }\n" +
                imprimirContactosDeUnGrupo(listContactoGrupo);
    }
}
