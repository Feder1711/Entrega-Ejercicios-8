// Ejercicio 27: Explicación de conceptos de pruebas

/*
1. Prueba de caja blanca: Analiza la estructura interna del código, revisando flujos, condiciones y bucles.
2. Prueba de caja negra: Evalúa la funcionalidad sin conocer la implementación interna.
3. Prueba unitaria: Verifica el funcionamiento de una función o método específico.
4. Prueba de integración: Prueba la interacción entre múltiples componentes.
5. Prueba de sistema: Evalúa todo el sistema como un conjunto.
6. Prueba de aceptación: Confirma si el sistema cumple con los requisitos del usuario.
*/

// Ejercicio 28 y 30: Implementación de pruebas en JUnit para los métodos del Ejercicio 2


package PruebasEjercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import Ejercicios1y2.Ejercicios1y2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PruebasEjercicio2 {

    private Object Funciones;

    @Test
    void testSuma() {
        assertEquals(55, Ejercicios1y2.suma(10));
    }

    @Test
    void testFactorial() {
        assertEquals(120, Ejercicios1y2.factorial(5));
    }

    @Test
    void testPotencia() {
        assertEquals(32, Ejercicios1y2.potencia(2, 5));
    }

    @Test
    void testSumaLista() {
        int[] lista = {1, 2, 3, 4};
        assertEquals(10, Ejercicios1y2.sumaLista(lista, 0));
    }

    @Test
    void testMediaLista() {
        int[] lista = {1, 2, 3, 4};
        assertEquals(2.5, Ejercicios1y2.mediaLista(lista, 0), 0.01);
    }

    @Test
    void testDesviacionTipica() {
        int[] lista = {1, 2, 3, 4};
        double media = Ejercicios1y2.mediaLista(lista, 0);
        assertEquals(1.118, Math.sqrt(Ejercicios1y2.desviacionTipica(lista, 0, media)), 0.01);
    }

    @Test
    void testSumaPares() {
        assertEquals(30, Ejercicios1y2.sumaPares(10));
    }

    @Test
    void testSumaParesLista() {
        int[] lista = {1, 2, 3, 4};
        assertEquals(6, Ejercicios1y2.sumaParesLista(lista, 0));
    }

    @Test
    void testProductoEscalar() {
        int[] lista1 = {1, 2, 3, 4};
        int[] lista2 = {2, 3, 4, 5};
        assertEquals(40, Ejercicios1y2.productoEscalar(lista1, lista2, 0));
    }

    @Test
    void testFibonacci() {
        assertEquals(55, Ejercicios1y2.fibonacci(10));
    }
}

// Ejercicio 29: Configuración de Maven para pruebas con JUnit

/*
Pasos para configurar Maven y JUnit:
1. Crear un nuevo proyecto Maven:
   ```sh
   mvn archetype:generate -DgroupId=org.pr2 -DartifactId=matematicas -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
   ```

2. Moverse al directorio del proyecto:
   ```sh
   cd matematicas
   ```

3. Crear estructura de directorios:
   ```sh
   mkdir -p src/main/java/org/pr2/matematicas
   mkdir -p src/test/java/org/pr2/matematicas
   ```

4. Crear el archivo `Matematicas.java` en `src/main/java/org/pr2/matematicas/` con el siguiente contenido:
   ```java
   package org.pr2.matematicas;
   public class Matematicas {
       public static int sumaNumeros(int n) {
           if (n < 0) throw new ArithmeticException("Número negativo no permitido");
           return n == 0 ? 0 : n + sumaNumeros(n - 1);
       }
   }
   ```

5. Crear el archivo `MatematicasTest.java` en `src/test/java/org/pr2/matematicas/` con:
   ```java
   package org.pr2.matematicas;
   import static org.junit.jupiter.api.Assertions.*;
   import org.junit.jupiter.api.Test;
   
   public class MatematicasTest {
       @Test
       void testSumaCero() {
           assertEquals(0, Matematicas.sumaNumeros(0));
       }
       @Test
       void testSumaPositivo() {
           assertEquals(6, Matematicas.sumaNumeros(3));
       }
       @Test
       void testSumaNegativo() {
           assertThrows(ArithmeticException.class, () -> Matematicas.sumaNumeros(-1));
       }
   }
   ```

6. Ejecutar las pruebas con:
   ```sh
   mvn test
   ```
*/
