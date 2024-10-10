package Animals.model.AnimalBuilder;

import Animals.model.Pets.Dog;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DogBuilder implements AnimalBuilder {
    private String name;
    private LocalDate dateBirth;
    private String Type;
    private List<String> commands  = new ArrayList<>();

    public DogBuilder() {
        super();
    }

    public DogBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DogBuilder setDate(int year, int month, int day) {
        this.dateBirth = LocalDate.of(year, month, day);
        return this;
    }

    public DogBuilder setCommand(String command) {
        this.commands.add(command);
        return this;
    }

    public void clearData(){
        name = null;
        dateBirth = null;
        commands.clear();
    }

    public Dog build() {
        Dog dog = new Dog(name, dateBirth);
        dog.addCommands(commands);
        clearData();
        return dog;
    }

}
