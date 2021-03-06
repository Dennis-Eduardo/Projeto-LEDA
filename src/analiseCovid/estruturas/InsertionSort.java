package analiseCovid.estruturas;

import analiseCovid.adicionais.CovidData;
import analiseCovid.adicionais.Vector;

import java.text.Collator;

public class InsertionSort {

    public static void ordenarPorObitos(Vector<CovidData> vector) {
        for(int unsortedElementIndex = 1; unsortedElementIndex < vector.size(); unsortedElementIndex++) {
            CovidData unsortedElement = vector.findWithIndex(unsortedElementIndex);
            int currentSortedElementIndex  = unsortedElementIndex - 1;
            while (currentSortedElementIndex >= 0 && vector.findWithIndex(currentSortedElementIndex).getMortes() > unsortedElement.getMortes()) {
                vector.insert(vector.findWithIndex(currentSortedElementIndex), currentSortedElementIndex + 1);
                currentSortedElementIndex--;
            }
            vector.insert(unsortedElement, currentSortedElementIndex + 1);
        }
    }

    public static void ordenarPorCasos(Vector<CovidData> vector) {
        for(int unsortedElementIndex=1; unsortedElementIndex < vector.size(); unsortedElementIndex++){
            CovidData unsortedElement = vector.findWithIndex(unsortedElementIndex);
            int currentSortedElementIndex  = unsortedElementIndex - 1;
            while (currentSortedElementIndex >= 0 && vector.findWithIndex(currentSortedElementIndex).getCasosConfirmados() > unsortedElement.getCasosConfirmados()) {
                vector.insert(vector.findWithIndex(currentSortedElementIndex), currentSortedElementIndex + 1);
                currentSortedElementIndex--;
            }
            vector.insert(unsortedElement, currentSortedElementIndex + 1);
        }
    }

    public static void ordenarPorNomeDasCidades(Vector<CovidData> vector) {

        Collator collator = Collator.getInstance();
        collator.setStrength(Collator.NO_DECOMPOSITION);

        for(int unsortedElementIndex = 1; unsortedElementIndex < vector.size(); unsortedElementIndex++) {
            CovidData unsortedElement = vector.findWithIndex(unsortedElementIndex);
            int currentSortedElementIndex  = unsortedElementIndex - 1;
            while (currentSortedElementIndex >= 0 &&
                    (collator.compare(vector.findWithIndex(currentSortedElementIndex).getCidade(), unsortedElement.getCidade()) > 0)) {
                vector.insert(vector.findWithIndex(currentSortedElementIndex), currentSortedElementIndex + 1);
                currentSortedElementIndex--;
            }
            vector.insert(unsortedElement, currentSortedElementIndex + 1);
        }
    }
}
