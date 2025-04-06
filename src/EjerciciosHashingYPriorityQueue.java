public class EjerciciosHashingYPriorityQueue {

    // ----- HASHING -----

    // Ejercicio 105
    // Una función hash es una función que transforma datos de entrada (como claves) en un valor numérico
    // llamado hash. En Java, este valor se utiliza para indexar objetos en estructuras como HashMap o HashSet.

    // Ejercicio 106
    // Java utiliza simplemente el valor del entero como su código hash para objetos de la clase Integer.
    // Es decir: Integer.valueOf(42).hashCode() == 42

    // Ejercicio 107
    // Para String, Java calcula el hash con esta fórmula:
    // s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]

    // Ejercicio 108
    // Un Map puede implementarse usando una tabla hash (HashMap), donde cada clave se almacena según su hashCode.

    // Ejercicio 109
    // Un Set puede implementarse como un HashSet, que internamente usa un HashMap donde la clave es el elemento y el valor es un marcador.

    // Ejercicio 110
    // Java aumenta el tamaño de la tabla hash antes de que esté llena para evitar colisiones y degradación de rendimiento.

    // Ejercicio 111
    // Cuando aumenta el tamaño, Java reubica los elementos porque los índices de las posiciones cambian al cambiar el tamaño del array subyacente.

    // Ejercicio 112
    // Especificar el tamaño inicial evita múltiples redimensionamientos (y copias) si se espera que el HashSet/Map tenga muchos elementos.

    // Ejercicio 113
    // Si no se sobreescribe hashCode en objetos personalizados, puede que diferentes objetos se asignen al mismo bucket,
    // reduciendo el rendimiento y causando problemas con equals.


    // ----- COLAS CON PRIORIDAD -----

    // Ejercicio 114
    // Ejemplo: gestión de tareas por prioridad en un sistema operativo, donde las tareas con prioridad más alta se ejecutan antes.

    // Ejercicio 115
    // (simulación en el main más abajo)

    // Ejercicio 116
    // (simulación en el main más abajo — figura no incluida en PDF digital)

    // Ejercicio 117
    // En un heap:
    // - inserción: O(log n)
    // - extracción del mínimo/máximo: O(log n)

    // Ejercicio 118
    // Java implementa colas con prioridad mediante la clase PriorityQueue (desde java.util).

    // Ejercicio 119 - 121: se muestran a continuación

    public static void main(String[] args) {
        // Ejercicio 119 - Insertar y mostrar contenido de una PriorityQueue de enteros
        java.util.PriorityQueue<Integer> cola = new java.util.PriorityQueue<>();
        cola.add(5);
        cola.add(7);
        cola.add(8);
        cola.add(1);
        cola.add(4);
        cola.add(3);

        System.out.println("Contenido de la cola de prioridad (orden de extracción):");
        while (!cola.isEmpty()) {
            System.out.print(cola.poll() + " ");
        }
        System.out.println();

        // Ejercicio 120 - Insertar 3, 1, 5 y mostrar extracción
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
        pq.add(3);
        pq.add(1);
        pq.add(5);

        System.out.println("\nEjercicio 120:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        // Ejercicio 121 - Cadenas por longitud
        java.util.PriorityQueue<String> pqStr = new java.util.PriorityQueue<>((a, b) -> Integer.compare(a.length(), b.length()));
        pqStr.add("short");
        pqStr.add("medium");
        pqStr.add("very long indeed");

        System.out.println("\nEjercicio 121:");
        while (!pqStr.isEmpty()) {
            System.out.println(pqStr.poll());
        }
    }
} 
