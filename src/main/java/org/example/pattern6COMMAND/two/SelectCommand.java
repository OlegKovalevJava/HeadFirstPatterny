package org.example.pattern6COMMAND.two;

public class SelectCommand implements Command {
    Database dataBase;

    public SelectCommand(Database dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.select();
    }
}
