package Animals.Presenter;

import Animals.model.service.Service;
import Animals.view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }


    public void addCat(String name, int year, int month, int day) {
        service.addCat(name, year, month, day);
        view.printAnswer(showAnimalList());
    }

    public void addDog(String name, int year, int month, int day) {
        service.addDog(name, year, month, day);
        view.printAnswer(showAnimalList());
    }

    public void addHamster(String name, int year, int month, int day) {
        service.addHamster(name, year, month, day);
        view.printAnswer(showAnimalList());
    }

    public void addHorse(String name, int year, int month, int day) {
        service.addHorse(name, year, month, day);
        view.printAnswer(showAnimalList());
    }

    public void addDonkey(String name, int year, int month, int day) {
        service.addDonkey(name, year, month, day);
        view.printAnswer(showAnimalList());
    }

    public void addCamel(String name, int year, int month, int day) {
        service.addCamel(name, year, month, day);
        view.printAnswer(showAnimalList());
    }

    public String getNumAnimal() {
        return service.getNumAnimal();
    }

    public void sortByName() {
        service.sortByName();
        view.printAnswer(showAnimalList());
    }

    public void sortByAge() {
        service.sortByAge();
        view.printAnswer(showAnimalList());
    }

    public void addCommand(String name,String command) {
       service.addCommand(name,command);
        view.printAnswer(showAnimalList());
    }

    public String showAnimalList() {
        return service.showAnimalList();
    }

    public String getCommands(String name) {
        return service.getCommands(name);
    }



    public void saveFile() {
        try {
            service.saveFile("src/AnimalList.txt");
            view.printAnswer("Программа успешно сохранена");
        } catch (Exception e) {
            view.printAnswer("Ошибка сохранения");
        } finally {
            view.printAnswer(showAnimalList());
        }
    }

    public void loadFile() {
        try {
            service.openFile("src/AnimalList.txt");

            view.printAnswer("Семейное древо успешно загружено");
            view.printAnswer(showAnimalList());
        } catch (Exception e) {
            view.printAnswer("Ошибка открытия");
        }
    }

}

