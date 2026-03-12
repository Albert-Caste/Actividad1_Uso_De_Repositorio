import java.util.Scanner;

public class Reutilizacion {

    public static String ingresarTexto(String texto){
        Scanner scanner = new Scanner(System.in);
        System.out.println(texto);
        return scanner.nextLine();
    }
}
