import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------Lisp------------");

        while (true) {
            System.out.print("1. Ejecutar comando Lisp ") ;
            System.out.print("2. Ingresar Funcion ") ;
            System.out.print("3. Salir ") ;
            System.out.print("Seleccione la opcion a realizar ") ;
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del Interprete de Lisp");
                break;
            }

        }

        scanner.close();
    }
}
