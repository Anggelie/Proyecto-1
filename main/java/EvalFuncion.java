import java.util.HashMap;
import java.util.Map;
public class EvalFuncion {
    // Definición de variables globales
    static Map<String, Integer> variables = new HashMap<>();

    public static int evaluarFuncion(String funcion) {
        // Implementa la lógica para evaluar funciones Lisp
        String[] tokens = funcion.split(" ");

        // Comprobamos si es una función de asignación
        if (tokens.length == 3 && tokens[0].equals("set")) {
            String variable = tokens[1];
            int valor = Integer.parseInt(tokens[2]);
            variables.put(variable, valor);
            return valor;
        }

        // Comprobamos si es una función de suma
        if (tokens.length == 4 && tokens[0].equals("+")) {
            int valor1 = Integer.parseInt(tokens[1]);
            int valor2 = Integer.parseInt(tokens[2]);
            return valor1 + valor2;
        }

        // Agrega más condiciones para otras funciones Lisp aquí...

        // Si no coincide con ninguna función conocida, devuelve 0
        return 0;
    }
}
}
