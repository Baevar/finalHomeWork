package Animals.model.AnimalBuilder;

import Animals.model.Pets.Cat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CatBuilder implements AnimalBuilder {
    private String name;
    private LocalDate dateBirth;
    private String Type;
    private List<String> commands = new ArrayList<>();

    public CatBuilder() {
        super();

    }

    public CatBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CatBuilder setDate(int year, int month, int day) {
        this.dateBirth = LocalDate.of(year, month, day);
        return this;
    }

    public CatBuilder setCommand(String command) {
        this.commands.add(command);
        return this;
    }

    public void clearData(){
        name = null;
        dateBirth = null;
        commands.clear();
    }

        public Cat build() {

        Cat cat = new Cat(name, dateBirth);
        cat.addCommands(commands);
        clearData();
        return cat;
    }

}
