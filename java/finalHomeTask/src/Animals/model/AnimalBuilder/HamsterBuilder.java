package Animals.model.AnimalBuilder;

import Animals.model.Pets.Hamster;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HamsterBuilder implements AnimalBuilder {
    private String name;
    private LocalDate dateBirth;
    private String Type;
    private List<String> commands = new ArrayList<>();

    public HamsterBuilder() {
        super();
    }

    public HamsterBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public HamsterBuilder setDate(int year, int month, int day) {
        this.dateBirth = LocalDate.of(year, month, day);
        return this;
    }

    public HamsterBuilder setCommand(String command) {
        this.commands.add(command);
        return this;
    }

    public void clearData(){
        name = null;
        dateBirth = null;
        commands.clear();
    }

    public Hamster build() {
        Hamster hamster = new Hamster(name, dateBirth);
        hamster.addCommands(commands);
        clearData();
        return hamster;
    }

}
