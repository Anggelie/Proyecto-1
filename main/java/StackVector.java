import java.util.Vector;
public class StackVector<T> {
    private Vector<T> stack;

    // Constructor
    public StackVector() {
        stack = new Vector<>();
    }

    // Método para comprobar si la pila está vacía
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Método para obtener el tamaño de la pila
    public int size() {
        return stack.size();
    }

    // Método para agregar un elemento a la pila
    public void push(T item) {
        stack.add(item);
    }

    // Método para eliminar y devolver el elemento en la cima de la pila
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return stack.remove(stack.size() - 1);
    }

    // Método para obtener el elemento en la cima de la pila sin eliminarlo
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return stack.get(stack.size() - 1);
    }
}
