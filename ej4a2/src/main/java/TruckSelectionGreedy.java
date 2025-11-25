import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

/**
 * ENUNCIADO:
 *
 * Una empresa de transportes tiene una flota de camiones.
 * Cada camión dispone de un depósito con una capacidad específica de litros de combustible
 * y puede recorrer una cantidad concreta de kilómetros con ese combustible.
 *
 * Debido a una crisis de abastecimiento, solo se dispone de una cantidad limitada de combustible.
 * El objetivo es seleccionar qué camiones pueden salir a hacer repartos,
 * maximizando la distancia total recorrida sin superar el combustible total disponible.
 *
 * El criterio es seleccionar primero los camiones más eficientes, es decir,
 * aquellos que recorren más kilómetros por litro (eficiencia = km / litros).
 *
 * VARIABLES DE ENTRADA:
 * - kilometers[] → kilómetros que recorre cada camión con su depósito lleno
 * - tankLiters[] → capacidad del depósito de cada camión (litros)
 * - totalFuel    → litros de combustible disponibles
 *
 * TABLA DE CAMIONES:
 *
 * | Nº | Kilómetros (km) | Combustible (L) |
 * |----|------------------|-----------------|
 * | 1  | 400              | 100             |
 * | 2  | 600              | 100             |
 * | 3  | 1200             | 300             |
 * | 4  | 1000             | 500             |
 *
 * ENTRADA:
 * kilometers = {400, 600, 1200, 1000}
 * tankLiters = {100, 100, 300, 500}
 * totalFuel = 500
 *
 * SALIDA:
 * Selected: [2, 1, 3]
 *
 * ENUNCIAT:
 *
 * Una empresa de transports té una flota de camions.
 * Cada camió disposa d’un dipòsit amb una capacitat específica de litres de combustible
 * i pot recórrer una quantitat concreta de quilòmetres amb aquest combustible.
 *
 * A causa d’una crisi de subministrament, només es disposa d’una quantitat limitada de combustible.
 * L’objectiu és seleccionar quins camions poden sortir a fer repartiments,
 * maximitzant la distància total recorreguda sense superar el combustible total disponible.
 *
 * El criteri és seleccionar primer els camions més eficients, és a dir,
 * aquells que recorren més quilòmetres per litre (eficiència = km / litres).
 *
 * VARIABLES D’ENTRADA:
 * - kilometers[] → quilòmetres que recorre cada camió amb el dipòsit ple
 * - tankLiters[] → capacitat del dipòsit de cada camió (litres)
 * - totalFuel    → litres de combustible disponibles
 *
 * TAULA DE CAMIONS:
 *
 * | Nº | Quilòmetres (km) | Combustible (L) |
 * |----|-------------------|-----------------|
 * | 1  | 400               | 100             |
 * | 2  | 600               | 100             |
 * | 3  | 1200              | 300             |
 * | 4  | 1000              | 500             |
 *
 * ENTRADA:
 * kilometers = {400, 600, 1200, 1000}
 * tankLiters = {100, 100, 300, 500}
 * totalFuel = 500
 *
 * SORTIDA ESPERADA:
 * Selected: [2, 1, 3]
 */
public class TruckSelectionGreedy {

    public static List<Integer> selectTrucksGreedy(int[] kilometers, int[] tankLiters, int totalFuel) 
    {
        // TODO: Implement greedy algorithm prioritizing efficiency (km/l)
        int n = kilometers.length;
        Integer[] trucks = new Integer[kilometers.length];
        for (int i = 0; i < trucks.length; i++) trucks[i] = i;
            
        // Sort trucks by efficiency in descending order
        Arrays.sort(trucks, (a, b) -> {
            double efficiencyA = (double) kilometers[a] / tankLiters[a];
            double efficiencyB = (double) kilometers[b] / tankLiters[b];
            return Double.compare(efficiencyB, efficiencyA);
        });
        List<Integer> selectedTrucks = new ArrayList<>();
        int remainingFuel = totalFuel;
        int i=0;
        while((i<n && remainingFuel >= tankLiters[trucks[i]]))
        {
            selectedTrucks.add(trucks[i]+1);
            remainingFuel -= tankLiters[trucks[i]];
            i++;
        }
        
        return selectedTrucks;
       
    }

    
    public static void main(String[] args) 
    {
        int[] kilometers = {400, 600, 1200, 1000};
        int[] tankLiters = {100, 100, 300, 500};
        int totalFuel = 500;

        List<Integer> selected = selectTrucksGreedy(kilometers, tankLiters, totalFuel);
        System.out.println("Selected: " + selected);
    }
    
}


