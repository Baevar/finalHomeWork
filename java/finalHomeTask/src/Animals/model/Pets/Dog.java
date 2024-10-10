package Animals.model.Pets;

import java.time.LocalDate;

public class Dog extends Pets {

    public Dog(String name, LocalDate dateBirth) {
        super(name, dateBirth, "Dog");
        addCommand("Гав");
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
