public class Stack <T> {
    private Node<T> top;
    private int size;

    // Constructor
    public Stack() {
        top = null;
        size = 0;
    }

    // Método para comprobar si la pila está vacía
    public boolean isEmpty() {
        return top == null;
    }

    // Método para obtener el tamaño de la pila
    public int size() {
        return size;
    }

    // Método para agregar un elemento a la pila
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Método para eliminar y devolver el elemento en la cima de la pila
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // Método para obtener el elemento en la cima de la pila sin eliminarlo
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return top.data;
    }

    // Clase interna para representar los nodos de la pila
    private static class Node<T> {
        private T data;
        private Node<T> next;

        // Constructor de nodo
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
