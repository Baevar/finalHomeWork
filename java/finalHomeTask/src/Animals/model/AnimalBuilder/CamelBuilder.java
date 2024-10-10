package Animals.model.AnimalBuilder;

import Animals.model.PackAnimals.Camel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CamelBuilder implements AnimalBuilder {
    private String name;
    private LocalDate dateBirth;
    private String Type;
    private List<String> commands  = new ArrayList<>();

    public CamelBuilder() {
        super();
    }

    public CamelBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CamelBuilder setDate(int year, int month, int day) {
        this.dateBirth = LocalDate.of(year, month, day);
        return this;
    }
    public CamelBuilder setCommand(String command) {
        this.commands.add(command);
        return this;
    }

    public void clearData(){
        name = null;
        dateBirth = null;
        commands.clear();
    }

    public Camel build() {
        Camel camel = new Camel(name, dateBirth);
        camel.addCommands(commands);
        clearData();
        return camel;
    }

}
