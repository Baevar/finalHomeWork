package Animals.model.AnimalBuilder;

import Animals.model.Animals;

public interface AnimalBuilder {

    AnimalBuilder setName(String name);

    AnimalBuilder setDate(int year, int month, int day);

    AnimalBuilder setCommand(String command);

    Animals build();
}
