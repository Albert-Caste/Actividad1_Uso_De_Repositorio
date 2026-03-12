import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private String nombre;
    private int id;

    private List<Grupo> listGrupo;
    private List<Reunion> listAgendaReunion;
    private List<Contacto> listContactos;

    //Metodo constructor

    public Agenda (String nombre, int id){
        this.nombre = nombre;
        this.id = id;
        this.listGrupo = new ArrayList<>();
        this.listAgendaReunion = new ArrayList<>();
        this.listContactos = new ArrayList<>();


    }

    public boolean validarContactoExistente(String telefono){

        boolean existe =false;
        for(Contacto contacto : listContactos){
            if(contacto.getTelefono().equals(telefono)){
                existe =true;
                break;
            }
        }
        return existe;

    }

    public String registrarContacto(String nombre, String alias, String direccion, String email, String telefono){
        String registro = " ";
        Contacto nuevoContacto = null;
        if(validarContactoExistente(telefono)){
            registro += "El usuario ya esta registrado";

        }else {
            nuevoContacto = new Contacto(nombre,alias,direccion, email, telefono);
            listContactos.add(nuevoContacto);
            registro = "Se registró a " + nuevoContacto.getNombre() + " en tu agenda";

        }

        return registro;
    }

    public Contacto buscarContacto(String tel){
        Contacto contactoBuscado = null;
        for(Contacto contacto:listContactos){
            if (contacto.getTelefono().equals(tel)){
                contactoBuscado = contacto;
                break;
            }
        }
        return contactoBuscado;
    }

    public String actualizarContacto(String telefono, String nuevoNombre, String nuevoAlias, String nuevaDireccion, String nuevoEmail, String nuevoTelefono){
        String actualizacion = "";
        Contacto contactoBuscado = buscarContacto(telefono);
        if(contactoBuscado==null){
            actualizacion += " Este contacto no existe";

        }else {

            contactoBuscado.setNombre(nuevoNombre);
            contactoBuscado.setAlias(nuevoAlias);
            contactoBuscado.setEmail(nuevoEmail);
            contactoBuscado.setTelefono(nuevoTelefono);
            contactoBuscado.setDireccion(nuevaDireccion);
        }





        return actualizacion;
    }



    //Metodos get y set

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public List<Grupo> getListaGrupo(){
        return listGrupo;
    }

    public void setListaGrupo(List<Grupo> listGrupo){
        this.listGrupo = listGrupo;
    }

    public List<Reunion> getListaAgendaReunion(){
        return listAgendaReunion;
    }

    public void setListAgendaReunion(List<Reunion> listAgendaReunion){
        this.listAgendaReunion = new ArrayList<>();
    }


}
