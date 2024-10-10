package Animals.model.AnimalBuilder;

import Animals.model.PackAnimals.Donkey;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DonkeyBuilder implements AnimalBuilder {
    private String name;
    private LocalDate dateBirth;
    private String Type;
    private List<String> commands = new ArrayList<>();

    public DonkeyBuilder() {
        super();
    }

    public DonkeyBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DonkeyBuilder setDate(int year, int month, int day) {
        this.dateBirth = LocalDate.of(year, month, day);
        return this;
    }

    public DonkeyBuilder setCommand(String command) {
        this.commands.add(command);
        return this;
    }

    public void clearData(){
        name = null;
        dateBirth = null;
        commands.clear();
    }

    public Donkey build() {
        Donkey donkey = new Donkey(name, dateBirth);
        donkey.addCommands(commands);
        clearData();
        return donkey;
    }

}
