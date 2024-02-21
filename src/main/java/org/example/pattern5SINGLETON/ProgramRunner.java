package org.example.pattern5SINGLETON;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("лалала");
        ProgramLogger.getProgramLogger().addLogInfo("нанана");
        ProgramLogger.getProgramLogger().addLogInfo("папапа");

        ProgramLogger.getProgramLogger().showLogInfo();

    }
}
