package Animals.model.PackAnimals;

import Animals.model.Animals;

import java.time.LocalDate;

abstract public class PackAnimals extends Animals {

    public PackAnimals(String name, LocalDate dateBirth, String type) {
        super(name, dateBirth, type);
    }
}
