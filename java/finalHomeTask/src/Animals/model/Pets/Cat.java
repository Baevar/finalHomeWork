package Animals.model.Pets;
import java.time.LocalDate;


public class Cat extends Pets{
    public Cat(String name, LocalDate dateBirth) {
        super(name, dateBirth, "Cat");
        addCommand("Мяу");
        addCommand("Прыг-скок");
    }

}
