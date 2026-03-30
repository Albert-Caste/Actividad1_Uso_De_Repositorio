import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Agenda agenda1 = new Agenda("Agenda Alberto" , 1);

        Contacto contacto1 = new Contacto("Alberto", "Alberto", "casa1", "@ggg", "311");
        Contacto contacto2 = new Contacto("Karim","Gorda", "casa2", "@Gatin", "312");



        String menu = "-----Menu Agenda------ \n" +
                "Marque alguna de estas opciones \n" +
                "  \n" +
                "  " +
                "1. Buscar\n" +
                "2. Crear grupo \n" +
                "3. Registrar Contacto\n" +
                "4. Crear Reunion \n" +
                "5 \n" +
                "\n" +
                "\n" +
                "8. Salir de la agenda\n";

        String menuBuscar = "-----Menu Buscar------ \n" +
                "Marque alguna de estas opciones \n" +
                "  \n" +
                "  " +
                "1. Buscar Contacto\n" +
                "2. Buscar Grupo \n" +
                "3. Buscar contactos del mismo nombre \n" +
                "4. Buscar y mostra GrupoContacto  \n" +
                "5 \n" +
                "\n" +
                "\n" +
                "7. Salir de la agenda\n";


        int opcion = 0;
        int opcionBuscar=0;
        String input = "";
        String inputBuscar= "";
        int contError = 0;

        while(opcion!=8){
            input = JOptionPane.showInputDialog(menu);


            if (input==null){

                contError+=1;

                if (contError>=3){
                    JOptionPane.showMessageDialog(null, "Excedió el número de errores,  adios");
                    break;
                }
                continue;

            }


// Sirve para aislar un posible error al captar información sin tener que parar el ciclo
            try{
                opcion = Integer.parseInt(input);
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Debe ingrear un número correspondiente a una opción");
                continue;
            }


            switch (opcion){
                case 1 : { inputBuscar = JOptionPane.showInputDialog(menuBuscar);

                    try{
                        opcionBuscar = Integer.parseInt(inputBuscar);
                    } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Debe ingrear un número correspondiente a una opción");
                        continue;
                    }
                    switch (opcionBuscar){
                        case 1 : {
                            String telefono = JOptionPane.showInputDialog("Ingrese el telefono del contacto a buscar");
                            Contacto contacto = agenda1.buscarContacto(telefono);
                            if (contacto==null){
                                JOptionPane.showMessageDialog(null, "No encontrado");
                                continue;
                            }else {
                                JOptionPane.showMessageDialog(null , "El contacto buscado es " + contacto.getNombre());
                            }
                            continue;


                        }
                        case 2 : {
                            String idGrupo = JOptionPane.showInputDialog("Ingrese id  del grupo a buscar");
                            int id = Integer.parseInt(idGrupo);

                            Grupo grupo = agenda1.buscarGrupo(id);
                            if (grupo==null){
                                JOptionPane.showMessageDialog(null, "No encontrado");
                            }else {
                                JOptionPane.showMessageDialog(null , "El grupo buscado es " + grupo.getNombre());
                                JOptionPane.showMessageDialog(null, grupo.toString());
                            }
                            continue;
                        }

                        case 3 : {
                            //buscar contactos del mismo nombre
                            String nombreABuscar = JOptionPane.showInputDialog("Ingrese id  del grupo a buscar");

                            String listaIguales = agenda1.sacarListaNombresIguales(nombreABuscar);
                            JOptionPane.showMessageDialog(null,listaIguales);

                            continue;
                        }

                        case 4 : {
                            //mostrarGrupoContacto
                            String idGrupo = JOptionPane.showInputDialog("Ingrese Id del grupo");
                            int idABuscar = Integer.parseInt(idGrupo);
                            Grupo grupo = agenda1.buscarGrupo(idABuscar);
                            JOptionPane.showMessageDialog(null, grupo.toString());


                            continue;

                        }

                        case 7: continue;

                        default: JOptionPane.showMessageDialog(null,"No marcó una opción valida");
                        continue;



                    }


                }

                case 2 : {
                    String nombreDelGrupo =JOptionPane.showInputDialog("ingrese nombre del grupo");
                    String idGrupo = JOptionPane.showInputDialog("Ingrese la id del grupo");
                    int idNuevo = Integer.parseInt(idGrupo);

                    String  mensajeGrupo = agenda1.crearGrupo(nombreDelGrupo,idNuevo);
                    JOptionPane.showMessageDialog(null,mensajeGrupo);
                    continue;
                }

                case 3 : {
                    String nombreContacto = JOptionPane.showInputDialog("Ingrese el nombre");
                    String alias = JOptionPane.showInputDialog("Ingrese el alias");
                    String direccion = JOptionPane.showInputDialog("Ingrese el direccion");
                    String email = JOptionPane.showInputDialog("Ingrese el email");
                    String telefono = JOptionPane.showInputDialog("Ingrese el telefono");
                    String mensajeRegistro = agenda1.registrarContacto(nombreContacto, alias, direccion, email, telefono);
                    JOptionPane.showMessageDialog(null, mensajeRegistro);

                    String idGrupoARegistrar = JOptionPane.showInputDialog("Ingrese el id del grupo para agregar su contacto ");
                    int id = Integer.parseInt(idGrupoARegistrar);
                    String registro = agenda1.ingresarContactoAgrupo(telefono , id);
                    JOptionPane.showMessageDialog(null, registro);





                    continue;
                }

                case  8 : break;

                default: break;

            }
            break;
        }












    }











}