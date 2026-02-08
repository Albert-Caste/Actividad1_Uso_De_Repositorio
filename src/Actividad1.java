//Creador de números primos 2

public class Actividad1 {
    public static void main(String [] args){

        int numMaximo = 120;
        String primos = listarPrimos(numMaximo);
        System.out.println("Los primos menores que: " + numMaximo + " son "+ primos );

    }

    public static boolean validarPrimo(int num){
        boolean primo = true;
        int divisores = 0;
        for (int i = 1; i <= num/2; i++){
            if ( num % i == 0){
                divisores ++;
            }
            if (divisores ==2){
                primo =false;
                break;
            }
        }
        return primo;
    }


    public static String listarPrimos(int numMaximo){
        String listaPrimos = "";
        for (int i = 1; i <=numMaximo; i++){
            if (validarPrimo(i)){
                listaPrimos += i;
            }
        }

        return  listaPrimos;
    }
}
