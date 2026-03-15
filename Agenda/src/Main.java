import javax.swing.*;
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
                "1. Registrar Contacto \n" +
                "2. Crear grupo \n" +
                "3. Crear Reunion \n" +
                "4. Buscar  \n" +
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
                case 1 : {

                }

                case 2 : {

                }

                default:

            }
        }












    }











}