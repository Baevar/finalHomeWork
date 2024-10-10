package Animals.view;

import Animals.Presenter.Presenter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleUI implements View {
    private Scanner scanner;
    private Presenter presenter;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);

    }

    @Override
    public void start() {
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Добавить животное");
            System.out.println("2. Сортировать животных по имени");
            System.out.println("3. Сортировать животных по возрасту");
            System.out.println("4. Добавить команду животному");
            System.out.println("5. Вывести сколько животных в списке");
            System.out.println("6. Вывести список животных");
            System.out.println("7. Вывести команды животного");
            System.out.println("8. Загрузить список животных");
            System.out.println("9. Сохранить список животных");
            System.out.println("10. Закончить работу");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addAnimal();
                    break;
                case "2":
                    sortByName();
                    break;
                case "3":
                    sortByAge();
                    break;
                case "4":
                    addCommand();
                    break;
                case "5":
                    getNumAnimal();
                    break;
                case "6":
                    showAnimalList();
                    break;
                case "7":
                    getCommands();
                    break;
                case "8":
                    loadFile();
                    break;
                case "9":
                    saveFile();
                    break;
                case "10":
                    return;
                default:
                    error();
                    break;
            }
        }
    }

    public void saveFile() {
        presenter.saveFile();
    }

    public void loadFile() {
        presenter.loadFile();
    }

    private void getCommands() {
        System.out.println("введите имя животного");
        String name = scanner.nextLine();
        printAnswer(presenter.getCommands(name));
    }

    private void showAnimalList() {
        printAnswer(presenter.showAnimalList());
    }

    private void addCommand() {
        System.out.println("Введите имя животного");
        String name = scanner.nextLine();
        System.out.println("Введите команду");
        String command = scanner.nextLine();
        presenter.addCommand(name, command);
    }

    private void sortByAge() {
        presenter.sortByAge();
    }

    private void sortByName() {
        presenter.sortByName();
    }

    private void getNumAnimal() {
        printAnswer("Животных в списке: " + presenter.getNumAnimal());
    }

    private void error() {
        System.out.println("Некорректна выбрана команда");
    }

    private void addAnimal() {
        String choice;
        String name;
        String date;
        int[] dateInt = new int[3];

        while (true) {

            System.out.println("\nВыберите тип животного:");
            System.out.println("1. Cat:");
            System.out.println("2. Dog:");
            System.out.println("3. Hamster:");
            System.out.println("4. Donkey:");
            System.out.println("5. Camel:");
            System.out.println("6. Horse:");
            choice = scanner.nextLine();
            System.out.println("Введите имя животного:");
            name = scanner.nextLine();
            System.out.println("Введите дату рождения (формат yyyy-MM-DD):");
            date = scanner.nextLine();
            if (!isDateCorrect(date)) {
                System.out.println("Ошибка ввода даты рождения животного!\n");
                break;
            }
            dateInt = dateFormat(date);
            switch (choice) {
                case "1":
                    presenter.addCat(name, dateInt[0], dateInt[1], dateInt[2]);
                    return;
                case "2":
                    presenter.addDog(name, dateInt[0], dateInt[1], dateInt[2]);
                    return;
                case "3":
                    presenter.addHamster(name, dateInt[0], dateInt[1], dateInt[2]);
                    return;
                case "4":
                    presenter.addDonkey(name, dateInt[0], dateInt[1], dateInt[2]);
                    return;
                case "5":
                    presenter.addCamel(name, dateInt[0], dateInt[1], dateInt[2]);
                    return;
                case "6":
                    presenter.addHorse(name, dateInt[0], dateInt[1], dateInt[2]);
                    return;
                default:
                    error();
                    break;
            }
        }

    }

    private boolean isDateCorrect(String date) {
        try {
            if (date.isEmpty()) {
                return false;
            }
            if (date.length() != 10 || (date.split("-")).length != 3) {
                return false;
            }
            String[] dateRes = date.split("-");
            int year = Integer.parseInt(dateRes[0]);
            int month = Integer.parseInt(dateRes[1]);
            int day = Integer.parseInt(dateRes[2]);
            if (year < 1 || year > 9999) {
                return false;
            }
            if (month < 1 || month > 12) {
                return false;
            }

            int[] monthLimit = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                monthLimit[1] = 29;
            }
            if (day < 1 || day > monthLimit[month - 1]) {
                return false;
            }
        } catch (InputMismatchException | NumberFormatException | NullPointerException ex) {
            throw ex;
        }
        return true;
    }

    private int[] dateFormat(String date) {
        int[] dateInt = new int[3];
        String str[] = date.split("-");
        dateInt[0] = Integer.parseInt(str[0]);
        dateInt[1] = Integer.parseInt(str[1]);
        dateInt[2] = Integer.parseInt(str[2]);
        return dateInt;
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }


}
