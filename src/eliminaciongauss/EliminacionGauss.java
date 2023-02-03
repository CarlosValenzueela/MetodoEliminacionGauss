/**
 * Paquete eliminaciongauss
 *
 */
package eliminaciongauss;

/**
 * Imports utilizados en clase
 */
import java.util.Scanner;

/*Nombre del archivo: asignacion07_00000207256
Nombre de alumno: Carlos Antonio Valenzuela Valdez
Matricula: 00000207256
Fecha de creación: 28/09/2020 */
/**
 * El programa EliminaciónGauss ayuda a encontrar los valores según el número de
 * ecuaciones que se ingresan. Muestra el resultado de forma ordenada en una
 * matriz.
 */
/**
 * Pasos a seguir en el programa 1- Solicitud de datos, ingresar los datos de
 * entrada 2- Ordenamiento de matriz 3- Llamada a métodos 4- Resultado de las
 * operaciones
 */
/**
 * Clase main donde se ejecutan los métodos
 *
 * @author Carlos Antonio Valenzuela Valdez
 */
public class EliminacionGauss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("El programa EliminaciónGauss ayuda a encontrar los valores según el número de\n"
                + "ecuaciones que se ingresan. Muestra el resultado de forma ordenada en una\n"
                + "matriz.");
        //Creación de instancia para llamar al método
        EliminacionGauss main = new EliminacionGauss();
        main.leeEcuaciones();
    }

    /**
     * Lee el número de ecuaciones (máximo 10) y después los valores de los
     * coeficientes y término independiente para cada ecuación y los almacena en
     * un arreglo bidimensional
     *
     */
    public void leeEcuaciones() {
        //Declaración de Scanner para ingresar datos de entrada
        Scanner teclado = new Scanner(System.in);

        int cantidadEcuaciones = 0;
        boolean pasar = true;

        //Si las instrucciones no se cumplen, el ciclo se reinicia
        while (pasar) {
            System.out.println("---Solicitud de datos");
            System.out.print("\nIngrese el número de ecuaciones(Máximo 10): ");
            cantidadEcuaciones = teclado.nextInt();

            if (cantidadEcuaciones <= 0 || cantidadEcuaciones > 10) {
                System.out.println("La cantidad de ecucaciones es en un rango de 0 - 10 . \n");
            } else {
                pasar = false;
            }
        }

        //Declaración de arreglo bidimensional
        double arregloEcuaciones[][];
        arregloEcuaciones = new double[cantidadEcuaciones][cantidadEcuaciones + 1];

        System.out.println("\nSolicitud de coeficientes y terminos independientes para cada ecuación: ");
        for (int i = 0; i < cantidadEcuaciones; i++) {
            System.out.print("\nEcuación número " + (i + 1) + "\n");
            for (int j = 0; j < (cantidadEcuaciones + 1); j++) {
                if (j < cantidadEcuaciones) {
                    System.out.print("Ingrese X" + (j + 1) + ": ");
                } else {
                    System.out.print("Ingrese termino independiente: ");

                }
                arregloEcuaciones[i][j] = teclado.nextDouble();

            }

        }
        System.out.println("\nMatriz ingresada: ");
        pivotea(arregloEcuaciones);
        eliminacionGauss(arregloEcuaciones);
        despliegaSolucion(arregloEcuaciones);
    }

    /**
     * Resuelve el sistema de ecuaciones cuyos coeficientes y términos
     * independientes se encuentran en un arreglo bidimensional y guarda la
     * solución en un arreglo.Esta función llama a las funciones
     * eliminacionAdelante() y sustitucionAtras() para hacer su trabajo.
     *
     * @param arreglo Arreglo con el que trabajara el método
     */
    public void eliminacionGauss(double arreglo[][]) {
        eliminacionAdelante(arreglo);
        sustitucionAtras(arreglo);
    }

    /**
     * Implementa la etapa de Eliminación hacia Adelante.Los coeficientes y
     * términos independientes del sistema de ecuaciones se encuentran en un
     * arreglo bidimensional
     *
     * @param arreglo Arreglo con el que trabajara el método
     */
    public void eliminacionAdelante(double arreglo[][]) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {

            }

        }
    }

    /**
     * Reacomoda las ecuaciones a partir de la i-ésima para que el elemento
     * pivote sea el mayor de los elementos hacia abajo en su columna.Los
     * coeficientes y términos independientes del sistema de ecuaciones se
     * encuentran en un arreglo bidimensional
     *
     * @param arregloPivotear Arreglo con el que trabajara el método
     */
    public void pivotea(double arregloPivotear[][]) {

    }

    /**
     * Implementa la etapa de Substitución hacia Atrás.Los coeficientes y
     * términos independientes del sistema de ecuaciones se encuentran en un
     * arreglo bidimensional. La función guarda la solución en un arreglo
     *
     * @param arreglo Arreglo con el que trabajara el método
     */
    public void sustitucionAtras(double arreglo[][]) {

    }

    /**
     * Despliega la solución del sistema de ecuaciones que se encuentra en un
     * arreglo
     *
     * @param arreglo Arreglo con el que trabajara el método
     */
    public void despliegaSolucion(double arreglo[][]) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length + 1; j++) {
                if (j < arreglo.length) {
                    System.out.print(arreglo[i][j] + " X" + (j + 1) + "\t");
//                    System.out.printf("%6.6f X%s ",arreglo[i][j], (j+1));

                } else {
                    System.out.print(" = " + arreglo[i][j] + "\t");
                }

            }
            System.out.println("");

        }
    }

}
