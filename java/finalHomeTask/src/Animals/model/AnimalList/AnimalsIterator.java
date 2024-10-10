package Animals.model.AnimalList;

import Animals.model.Animals;

import java.util.Iterator;
import java.util.List;

public class AnimalsIterator implements Iterator {
    private int indexCount;
    private List<Animals> animalList;

    public AnimalsIterator (List<Animals> animalList){
        this.animalList = animalList;
    }

    @Override
    public boolean hasNext() {
        return animalList.size() > indexCount;
    }

    @Override
    public Object next() {
        return animalList.get(indexCount++);
    }
}
