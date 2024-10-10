package Animals.model.AnimalList;

import Animals.model.Animals;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AnimalList implements Iterable<Animals>, Serializable {

    List<Animals> animalList = new ArrayList<>();

    public List<Animals> addAnimal(Animals animal) {
        this.animalList.add(animal);
        return animalList;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Animals animals : this.animalList) {
            builder.append(animals.toString()).append("\n");
        }
        return builder.toString();
    }

    public int getNumAnimal() {
        int countnimal = 0;
        for (Animals animals : this.animalList) {
            countnimal++;
        }
        return countnimal;
    }

    public String deleteAnimal(String name){
        name = name.toLowerCase();
        for (int i = 0; i < animalList.size(); i++) {
            if (name.equals(animalList.get(i).getName().toLowerCase())) {
                 animalList.remove(i);
                 return "Животное удалено!";
            }
        }
        return "Животное не найдено!";
    }

    public void addCommand(String name, String command) {
        name = name.toLowerCase();
        for (Animals animal : animalList) {
            if (name.equals(animal.getName().toLowerCase())) {
                animal.addCommand(command);
            }
        }
    }


    public String getCommand(String name) {
        name = name.toLowerCase();
        for (Animals animal : animalList) {
            if (name.equals(animal.getName().toLowerCase())) {
               return animal.getCommands();
            }
        }
        return "Животное не найдено!";
    }


    public void sortByName() {
        Collections.sort(animalList, new AnimalComparatorByName());
    }

   public void sortByAge() {
        Collections.sort(animalList, new AnimalComparatorByAge());
    }

    @Override
    public Iterator iterator() {
        return new AnimalsIterator(animalList);
    }
}
