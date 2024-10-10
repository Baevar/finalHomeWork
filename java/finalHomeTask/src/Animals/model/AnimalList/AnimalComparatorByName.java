package Animals.model.AnimalList;

import Animals.model.Animals;

import java.util.Comparator;

public class AnimalComparatorByName implements Comparator<Animals> {
    @Override
    public int compare(Animals o1, Animals o2) {
        return o1.compareTo(o2);
    }
}
