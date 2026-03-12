import java.util.ArrayList;
import java.util.List;

public class Contacto {
    private String nombre;
    private String alias;
    private String direccion;
    private String email;
    private String telefono;


    private List<Reunion> listContactoReunion;
    private List<Grupo> listGrupos;

    public Contacto (String nombre, String alias, String direccion, String email, String telefono){
        this.nombre = nombre;
        this.alias = alias;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;

        this.listGrupos = new ArrayList<>();

    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
            }
    public List<Grupo> getListGrupos() {
        return listGrupos;
    }

    public void setListGrupos(List<Grupo> listGrupos) {
        this.listGrupos = listGrupos;
    }

    public List<Reunion> getListContactoReunion() {
        return listContactoReunion;
    }

    public void setListContactoReunion(List<Reunion> listContactoReunion) {
        this.listContactoReunion = listContactoReunion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
