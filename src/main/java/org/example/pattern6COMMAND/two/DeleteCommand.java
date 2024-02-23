package org.example.pattern6COMMAND.two;

public class DeleteCommand implements Command {
    Database dataBase;

    public DeleteCommand(Database dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.delete();
    }
}
