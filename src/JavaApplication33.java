import java.util.Random;
import java.util.Scanner;

public class JavaApplication33 {

    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        Random random = new Random();
        System.out.println("El tamaño fijo del arreglo es 6, ¿Que deseas hacer?");
        
        char[] mayusculas = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 
            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
            'W', 'X', 'Y', 'Z'};
        char[] minuscula = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 
            'x', 'y', 'z'};
        char[] especial =  {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', 
            '-', '_', '+', '=', '{', '}', '[', ']', ':', ';', '"', '\'', '<', 
            '>', ',', '.', '?', '/', '\\', '|', '`', '~'};
        char[] num = {'0', '1', '2', '3', '4', '5','6', '7', '8', '9'};
        Scanner teclado = new Scanner(System.in);
        String tipocurp = null;
        //Llenar llenar = new Llenar();
        //Mostrar mostar = new Mostrar();
        //Eliminar eliminar = new Eliminar();
        try {

            // creamos un ciclo 
            do {
                String primeraLetra = "";
                String dosMinusculas = "";
                String dosEspecial = "";
                String numero = "";
                
                
                primeraLetra = "" + mayusculas[(int)(Math. random() * 26)];
                dosMinusculas = "" + minuscula[(int)(Math. random() * 26)] + minuscula[(int)(Math. random() * 26)];
                dosEspecial = "" + especial[(int)(Math. random() * 32)] + especial[(int)(Math. random() * 32)]; 
                numero = "" + num[(int)(Math. random() * 9)];
                System.out.println("Elige una opcion: \n1.-Llenar automaticamente \n2.-Mostrar \n3.-Salir");
                int opcion = teclado.nextInt();
                switch (opcion) {
                    case 1 ->
                       tipocurp = operaciones.llenar(primeraLetra, dosMinusculas, dosEspecial, numero);                      
                    case 2 ->
                        //mostar(mayuscula, minuscula, especial, num);
                        System.out.println(tipocurp);
                    case 3 ->
                        System.exit(0);
 
                    default ->
                        System.out.println("opcion no valida");

                }

            } while (true);
        } catch (Exception e) {
        }
    }

}
