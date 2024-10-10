package Animals.model.AnimalBuilder;

import Animals.model.PackAnimals.Horse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HorseBuilder implements AnimalBuilder {
    private String name;
    private LocalDate dateBirth;
    private String Type;
    private List<String> commands  = new ArrayList<>();

    public HorseBuilder() {
        super();
    }

    public HorseBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public HorseBuilder setDate(int year, int month, int day) {
        this.dateBirth = LocalDate.of(year, month, day);
        return this;
    }

    public HorseBuilder setCommand(String command) {
        this.commands.add(command);
        return this;
    }

    public void clearData(){
        name = null;
        dateBirth = null;
        commands.clear();
    }

    public Horse build() {
        Horse horse = new Horse(name, dateBirth);
        horse.addCommands(commands);
        clearData();
        return horse;
    }

}
