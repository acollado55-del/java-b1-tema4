/**
 * ENUNCIADO:
 *
 * Una tienda tiene una lista de clientes que han hecho pedidos, y se desea ordenarlos
 * por el tiempo de espera, de menor a mayor, para almacenarlos en una base de datos.
 *
 * Como los datos están muy desordenados, se requiere un algoritmo eficiente y estable
 * como Merge Sort, que garantiza un buen rendimiento incluso en el peor de los casos.
 *
 * El objetivo es implementar el algoritmo de ordenación Merge Sort en orden ascendente.
 *
 * Cada cliente tiene asociado un tiempo de espera (en minutos).
 *
 * VARIABLES DE ENTRADA:
 * - tiempos[] (int[]): tiempos de espera de cada cliente (en minutos)
 *
 * TABLA DE CLIENTES:
 *
 * | Nº | Cliente         | Tiempo de espera (minutos) |
 * |----|------------------|----------------------------|
 * | 1  | Laura            | 12                         |
 * | 2  | Marcos           | 5                          |
 * | 3  | Irene            | 8                          |
 * | 4  | Carlos           | 3                          |
 * | 5  | Sofía            | 15                         |
 * | 6  | David            | 7                          |
 * | 7  | Nuria            | 2                          |
 * | 8  | Andrés           | 10                         |
 * | 9  | Marta            | 6                          |
 * | 10 | Pablo            | 4                          *
 *
 * SALIDA (tiempos ordenados):
 * 2 3 4 5 6 7 8 10 12 15
 *
 * ENUNCIAT:
 *
 * Una botiga té una llista de clients que han fet comandes, i es vol ordenar-los
 * pel temps d'espera, de menor a major, per enmagatzemar-los en una base de dades.
 *
 * Com que les dades estan molt desordenades, es necessita un algorisme eficient i estable
 * com el Merge Sort, que garanteix un bon rendiment fins i tot en el pitjor dels casos.
 *
 * L’objectiu és implementar l’algorisme de ordenació Merge Sort en ordre ascendent.
 *
 * Cada client té un temps d'espera associat (en minuts).
 *
 * VARIABLES D'ENTRADA:
 * - temps[] (int[]): temps d'espera de cada client (en minuts)
 *
 * TAULA DE CLIENTS:
 *
 * | Nº | Client           | Temps d’espera (minuts)   |
 * |----|------------------|---------------------------|
 * | 1  | Laura            | 12                         |
 * | 2  | Marcos           | 5                          |
 * | 3  | Irene            | 8                          |
 * | 4  | Carlos           | 3                          |
 * | 5  | Sofia            | 15                         |
 * | 6  | David            | 7                          |
 * | 7  | Núria            | 2                          |
 * | 8  | Andreu           | 10                         |
 * | 9  | Marta            | 6                          |
 * | 10 | Pau              | 4                          *
 */
 
public class MergeSortClients {

    // This function recursively divides the array and merges the sorted parts
    public static void mergeSort(int[] arr, int left, int right) {
        // TODO: Implement recursive division and call merge
    }

    // This function merges two sorted subarrays
    public static void merge(int[] arr, int left, int mid, int right) {
        // TODO: Create temporary arrays and merge them in sorted order
    }

    // -------------------------------------------------------------
    // Manual test using IDE
    // -------------------------------------------------------------
    /*
    public static void main(String[] args) {
        int[] tiempos = {12, 5, 8, 3, 15, 7, 2, 10, 6, 4};
        mergeSort(tiempos, 0, tiempos.length - 1);

        System.out.println("Tiempos de espera ordenados:");
        for (int t : tiempos) {
            System.out.print(t + " ");
        }
    }
    */
	// Torna a comentar aquest main quan vulguis executar els tests amb maven test
    // Vuelve a comentar este main cuando quieras ejecutar los tests con:
    // mvn test
	// -------------------------------------------------------------
}
