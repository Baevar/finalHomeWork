package Animals.model.service;

import Animals.model.AnimalBuilder.*;
import Animals.model.AnimalList.AnimalList;
import Animals.model.FileHandler.FileHandler;
import Animals.model.FileHandler.Writer;

public class Service {
    CatBuilder cat;
    CamelBuilder camel;
    DonkeyBuilder donkey;
    DogBuilder dog;
    HamsterBuilder hamster;
    HorseBuilder horse;
    AnimalList animalList;

    public Service() {
        animalList = new AnimalList();
    }

    public void addCat(String name, int year, int month, int day) {
        cat = new CatBuilder();
        animalList.addAnimal(cat.setName(name).setDate(year, month, day).build());
    }

    public void addDog(String name, int year, int month, int day) {
        dog = new DogBuilder();
        animalList.addAnimal(dog.setName(name).setDate(year, month, day).build());
    }

    public void addCamel(String name, int year, int month, int day) {
        camel = new CamelBuilder();
        animalList.addAnimal(camel.setName(name).setDate(year, month, day).build());
    }

    public void addDonkey(String name, int year, int month, int day) {
        donkey = new DonkeyBuilder();
        animalList.addAnimal(donkey.setName(name).setDate(year, month, day).build());
    }

    public void addHamster(String name, int year, int month, int day) {
        hamster = new HamsterBuilder();
        animalList.addAnimal(hamster.setName(name).setDate(year, month, day).build());
    }

    public void addHorse(String name, int year, int month, int day) {
        horse = new HorseBuilder();
        animalList.addAnimal(horse.setName(name).setDate(year, month, day).build());
    }

    public void addCommand(String name, String command) {
        animalList.addCommand(name,command);
    }


    public void sortByName() {
        animalList.sortByName();
    }

    public void sortByAge() {
        animalList.sortByAge();
    }

    public String getNumAnimal() {
        return "Количество животных в списке: " + animalList.getNumAnimal();
    }

    public String showAnimalList() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список животных:").append("\n");
        for (Object animal : animalList) {
            stringBuilder.append(animal.toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    public String getCommands(String name) {
        return animalList.getCommand(name);
    }

    public boolean openFile(String fileName) {
        try {
            Writer fileHandler = new FileHandler();
            fileHandler.setFileName(fileName);
            animalList = (AnimalList) fileHandler.openFile();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean saveFile(String fileName) {
        try {
            Writer fileHandler = new FileHandler();
            fileHandler.setFileName(fileName);
            fileHandler.saveFile(animalList);
            return true;
        } catch (Exception ex) {
            System.out.println("Ошибка сохранения");
            return false;
        }
    }

}
