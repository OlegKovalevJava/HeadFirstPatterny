package org.example.pattern6COMMAND.two;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database dataBase = new Database();

        Developer developer = new Developer(
                new InsertCommand(dataBase),
                new UpdateCommand(dataBase),
                new SelectCommand(dataBase),
                new DeleteCommand(dataBase)
        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}
