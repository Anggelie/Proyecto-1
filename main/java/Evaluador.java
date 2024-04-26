import java.util.Scanner;
public class Evaluador {
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

            // Evaluar la función Lisp
            int resultado = EvalFuncion.evaluarFuncion(input);
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}
