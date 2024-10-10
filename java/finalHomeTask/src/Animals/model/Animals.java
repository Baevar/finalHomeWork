
package Animals.model;

import Animals.model.FileHandler.FileHandler;
import Animals.model.FileHandler.Writer;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

abstract public class Animals implements Comparable<Animals>, Serializable {
    private String name;
    private LocalDate dateBirth;
    private String type;
    private List<String> commands = new ArrayList<>();


    public Animals() {
        super();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Animals(String name, LocalDate dateBirth, String type) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.type = type;
    }

    public String getCommands() {
        return commands.toString().replace("[", "").replace("]", "");
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void addCommand(String command) {
        this.commands.add(command);

    }

    public void addCommands(List<String> commandList) {
        for (String s : commandList) {
            if (!commands.contains(s))
                this.commands.add(s);
        }
    }

       @Override
    public int compareTo(Animals o) {
        return name.compareTo(o.name);
    }


    @Override
    public String toString(){
        StringBuilder bulider = new StringBuilder();
        bulider.append("Name: ").append(getName()).append("; ");
        bulider.append("Type: ").append(getType()).append("; ");
        bulider.append("Birthdate: ").append(getDateBirth()).append("; ");
        bulider.append("Commands: ").append(getCommands().toString().replace("[", "").replace("]", "")).append("; ");
        return bulider.toString();
    };
}
