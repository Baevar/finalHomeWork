package Animals.model.AnimalList;
import Animals.model.Animals;

import java.util.Comparator;

public class AnimalComparatorByAge implements Comparator<Animals> {

    @Override
    public int compare(Animals o1, Animals o2) {
        return o1.getDateBirth().compareTo(o2.getDateBirth());

    }
}

