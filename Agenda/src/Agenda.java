import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private String nombre;
    private int id;


    private List<Grupo> listGrupo;
    private List<Reunion> listAgendaReunion;
    private List<Contacto> listContactos;
    private List<Grupo> listContactoGrupo;


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
            actualizacion += "Se actualizó "+ contactoBuscado.getNombre() + " a " + nuevoNombre;

            contactoBuscado.setNombre(nuevoNombre);
            contactoBuscado.setAlias(nuevoAlias);
            contactoBuscado.setEmail(nuevoEmail);
            contactoBuscado.setTelefono(nuevoTelefono);
            contactoBuscado.setDireccion(nuevaDireccion);
        }

        return actualizacion;
    }

    //borrar contacto

    public String borrarContacto(String telefono){
        Contacto contactoABorrar = buscarContacto(telefono);
        String mensajeSalida = "El contacto: ";
        if(contactoABorrar == null){
            mensajeSalida += "No existe";

        }else {
            mensajeSalida += contactoABorrar.getNombre() + " Será borrado";
            listContactos.remove(contactoABorrar);
        }
        return mensajeSalida;
    }

    // Llamar sacar todos los contactos que se llamen juan

    public String sacarListaNombresIguales(String nombre){
        String contactosIguales = " ";
            for (Contacto cont:listContactos){
                if(cont.getNombre().equals(nombre)){
                    contactosIguales += cont.getNombre() + cont.getAlias();
                }
                else {
                    contactosIguales += "no existen contactos con ese nombre";

                }
            }
        return contactosIguales;
    }

    //Crear grupo

    public String crearGrupo(String nombre, int id){
        String mensaje = "El grupo";
        Grupo grupo = new Grupo(nombre,id);
        listGrupo.add(grupo);
        mensaje += grupo.getNombre() + "ya se registro";
        return mensaje;
    }

    public Grupo buscarGrupo(int id){
        Grupo grupoBuscado = null;
        for(Grupo grupo : listGrupo){
            if (grupo.getId()== id){
                grupoBuscado = grupo;
                break;
            }
        }
        return grupoBuscado;
    }

    public String ingresarContactoAgrupo(String nombreContacto, int idGrupo ){
        String mensaje =" ";

        Contacto contacto = buscarContacto(nombreContacto);
        Grupo grupo = buscarGrupo(idGrupo);

        if(listContactoGrupo.size()<=10){
            grupo.agregarContactoAGrupo(contacto);
            mensaje += "registrado en grupo " + grupo.getNombre();

        }else {
            mensaje = "El grupo esta lleno";
        }




        return mensaje;
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
