package Animals.model.Pets;
import Animals.model.Animals;
import java.time.LocalDate;

abstract class Pets extends Animals {

    public Pets(String name, LocalDate dateBirth, String type) {
        super(name, dateBirth, type);
    }
}


