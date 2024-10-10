package Animals.model.PackAnimals;

import java.time.LocalDate;

public class Horse extends PackAnimals {
    public Horse(String name, LocalDate dateBirth) {
        super(name, dateBirth, "Horse");
        addCommand("Галоп");
    }

//    @Override
//    public String toString() {
//        StringBuilder bulider = new StringBuilder();
//        bulider.append("Name: ").append(getName()).append(";");
//        bulider.append("Type: ").append(getType()).append(";");
//        bulider.append("Birthdate: ").append(getDateBirth()).append(";");
//        bulider.append("Commands: ").append(getCommands().toString()).append(";");
//        return bulider.toString();
//    }
}
