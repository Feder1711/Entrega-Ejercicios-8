import java.util.*;

public class EjerciciosTAD {

    // Ejercicio 61
    // Un TAD (Tipo Abstracto de Datos) describe qué operaciones se pueden hacer con los datos,
    // mientras que una estructura de datos describe cómo se implementan esas operaciones en memoria.

    // Ejercicio 62
    // Una lista es una colección ordenada de elementos. Sus operaciones típicas son:
    // agregar, eliminar, buscar, recorrer y obtener por índice.

    // Ejercicio 63
    // Formas de implementar una lista:
    // - ArrayList: usa un arreglo dinámico.
    // - LinkedList: usa nodos enlazados entre sí.

    // Ejercicio 64
    // ArrayList: acceso rápido por índice, pero inserciones/eliminaciones son costosas.
    // LinkedList: inserciones/eliminaciones eficientes, pero acceso por índice es lento.

    // Ejercicio 65
    // Collection.java es la interfaz raíz del framework de colecciones.
    // List.java extiende Collection para colecciones ordenadas.
    // ArrayList.java y LinkedList.java implementan List con distintas estrategias internas.

    // Ejercicio 66
    // Una pila (Stack) es una estructura LIFO (Last In, First Out).
    // Operaciones: push (insertar), pop (eliminar), peek (ver tope), isEmpty.

    // Ejercicio 67
    // Aplicaciones de pilas:
    // - Deshacer operaciones (Ctrl+Z)
    // - Evaluar expresiones matemáticas
    // - Recorridos en profundidad (DFS) en grafos

    // Ejercicio 68
    // Relación entre lista y pila:
    // Una pila es un tipo restringido de lista donde solo se accede/modifica el extremo superior.

    // Ejercicio 69
    // Stack.java extiende Vector.java. Ambas son clases antiguas de Java.
    // ArrayList.java y Vector.java son similares, pero Vector es sincronizado (thread-safe).

    // Ejercicio 70
    public static void ejercicio70() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        System.out.println("Contenido de la pila: " + pila);
        System.out.println("Elemento en el tope (peek): " + pila.peek());
        pila.pop();
        System.out.println("Contenido de la pila después de pop: " + pila);
    }

    // Ejercicio 71
    // Una cola (Queue) es una estructura FIFO (First In, First Out).
    // Operaciones: add (insertar), poll/remove (eliminar), peek (ver frente).

    // Ejercicio 72
    // Aplicaciones de colas:
    // - Gestión de procesos en sistemas operativos
    // - Atención al cliente
    // - Impresoras

    // Ejercicio 73
    // ArrayDeque.java implementa una cola doble (doble extremo) usando un arreglo circular.
    // La aritmética modular se usa para reciclar posiciones del arreglo eficientemente.

    // Ejercicio 74
    public static void ejercicio74() {
        ArrayDeque<Integer> cola = new ArrayDeque<>();
        cola.add(1);
        cola.add(2);
        System.out.println("Cola: " + cola);
        System.out.println("Elemento en el frente (peek): " + cola.peek());
        cola.poll(); // elimina el primero
        System.out.println("Cola después de poll: " + cola);
    }

    public static void main(String[] args) {
        System.out.println("===== Ejercicio 70 =====");
        ejercicio70();

        System.out.println("\n===== Ejercicio 74 =====");
        ejercicio74();
    }
}
