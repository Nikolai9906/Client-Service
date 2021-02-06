# Taller Ejercicio Maven - GIT

Este aplicativo calcula algunas medidas estadísticas de n números reales que se leen de un archivo, utilizando una lista encadenada básica propia creada en la aplicación.


## Diseño
Los detalles del diseño, la arquitectura del programa, problema, definiciones y pruebas se pueden encontrar en el siguiente documento [Artículo Sobre el Diseño](Articulo_EjercicioHeroku.pdf).
## Prerequisitos

Conocimientos básicos sobre estadística, media, mediana y desviación estándar.

## Comandos
Para compilar y correr las pruebas: ```mvn package```

Para ejecutar y utilizar el programa: ```mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.app.App```

Para ejecutar las pruebas: ```mvn test```

Para generar javadoc con maven: ```mvn javadoc:javadoc```

Para generar javadoc de las pruebas: ```mvn javadoc:test-javadoc```

**IMPORTANTE:** Para poder utilizar el aplicativo es necesario compilar primero el proyecto con **mvn package**.

# Integracion Continua
[![CircleCI](https://circleci.com/gh/Nikolai9906/AREP-LAB-2.svg?style=svg)](https://circleci.com/gh/Nikolai9906/AREP-LAB-2)

# Despliegue Heroku

https://warm-inlet-01806.herokuapp.com

## Operaciones
- Media: Calcula la media de una lista de n números ingresados por consola o por medio de un archivo.
- Desviación estándar: Calcula la desviación estándar de una lista de n números ingresados por consola o por medio de un archivo.

**NOTA:** Para realizar estas operaciones se utilizo una lista encadenada propia del programa, no se utilizo ninguna implementación por defecto como ArrayList.

## Intalación
Si quieres saber como funciona el programa, tienes que seguir los siguientes pasos:
1. Descargar eclipse (última versión) o cualquier editor de JAVA.
2. Abra el proyecto en el editor.
3. Corra el programa y verifique que no tiene errores.
4. Ingrese los parámetros deseados que desea ver para visualizar las funcionalidades del sistema.

## Instalación (Proyecto Maven)
Para tener una mejor experiencia con el programa, es recomendable tener instalado maven en el sistema operativo,
de esta forma se puede visualizar de una mejor manera las pruebas y ejecutarlas desde consola.
Para instalar maven seguimos los siguientes pasos:
1. En eclipse vamos al menu que dice help.
2. Ahí le damos a install new software.
3. Nos abrirá una nueva pestaña, allí le damos donde aparece "add".
4. En "Name" escribimos lo siguiente: M2Eclipse
5. En "Location" escribimos la siguiente dirección: http://download.eclipse.org/technology/m2e/releases
6. Le damos Add, señalamos los plugins que aparecieron.
7. Aceptamos los terminos y condiciones, y se instalará automáticamente.
8. Reiniciamos eclipse y ya está instalado maven en eclipse.

## Pruebas
Para poder ejecutar sus pruebas siga los siguientes pasos:
1. Cambie los valores de case1, case2, case3, ..., casen por los valores deseados o cree uno nuevo.
2. Elija la prueba que desea y cambie el resultado por el esperado.
3. Corra las pruebas y verifique que el resultado esperado es igual al valor dado por el programa.


## Ejemplo de prueba de desviación estándar
```java
  
/**
     * Prueba encargada de verificar que la lista conozca todos sus vecinos
     */
    @Test
    public void testNeighbors() {
        LinkedList linkedList = new LinkedList();
        ArrayList<Double> testList = new ArrayList<Double>();
        testList.add((double) 10);
        testList.add((double) 20);
        testList.add((double) 30);
        testList.add((double) 40);
        linkedList.addFirst((double) 40);
        linkedList.addFirst((double) 30);
        linkedList.addFirst((double) 20);
        linkedList.addFirst((double) 10);
        for (int i = 0; i < 4; i++) {
            assertEquals(linkedList.getNodeValue(i), testList.get(i));
        }
    }

/**
     * Prueba encargada de evaluar la media con unos valores manualmente insertados
     */
    @Test
    public void testMean() {
        Stat data = new Stat();
        data.addNumber(15.0);
        data.addNumber(69.9);
        data.addNumber(6.5);
        data.addNumber(22.4);
        data.addNumber(28.4);
        data.addNumber(65.9);
        data.addNumber(19.4);
        data.addNumber(198.7);
        data.addNumber(38.8);
        data.addNumber(138.2);
        try {
            assertEquals(data.mean(), 60.32);
        } catch (LinkedListException e) {
            assertTrue(false);
        }
    }
```

## ¿Cómo usar el aplicativo?
1. Copie el enlace proporcionado por el git del proyecto y clone el repositorio en el directorio de su preferencia.

    - git clone https://github.com/Nikolai9906/AREP-LAB-1.git
2. Entre a la carpeta **arep-lab-1**.
3. Compile el proyecto antes de comenzar a utilizar sus funcionalidades.

    - **NOTA:** Recuerde que el proyecto se compila con el comando **mvn package**.
4. Cree un archivo en ese directorio con la lista de números a la cuál le desea calcular la media y la desviación estándar.
5. Ejecute el programa con la lista que creo anteriormente y compare los resultados.

## Ejemplos de uso con maven
Para ello nos dirigimos a la carpeta principal del proyecto, dependiendo de lo que queramos hacer.

Si queremos compilar el proyecto y ver que no tiene fallos, utilizamos el comando **mvn package**.

Si queremos ejecutar las pruebas y ver que todo está perfecto, utilizamos el comando **mvn test**.

**NOTA:** El comando **mvn package** compila y ejecuta las pruebas al mismo tiempo.

## Construido
[IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/) Editor de JAVA donde se puede compilar el proyecto.

## Autor
Steven Nikolai Bermudez Vega - Trabajo Programación AREP 01/28/2021

## Licencia
Este programa es de uso libre, puede ser usado por cualquier persona.

