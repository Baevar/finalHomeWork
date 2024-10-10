package Animals.model.PackAnimals;

import java.time.LocalDate;

public class Camel extends PackAnimals {

    public Camel(String name, LocalDate dateBirth) {
        super(name, dateBirth, "Camel");
        addCommand("Катать");
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
