import java.util.Scanner;
public class Lector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------Lisp------------");

        while (true) {
            System.out.print("Ingrese una función Lisp: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del Interprete de Lisp");
                break;
            }

            // Aquí puedes procesar la entrada según tus necesidades
            System.out.println("Función ingresada: " + input);
        }

        scanner.close();
    }
}
