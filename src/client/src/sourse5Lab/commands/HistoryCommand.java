package sourse5Lab.commands;

import client.sourse5Lab.mainApp.Result;
/*
    выводит информацию о последних выполненных командах
 */
public class HistoryCommand implements Command {
    ControlUnit cu;
    public HistoryCommand(ControlUnit controlUnit){
        cu = controlUnit;
        cu.addCommand("history", this);
    }
    @Override
    public void execute(String options, Result result) {
        if(options != null){
            result.writeResult("Данная комада не содержит аргументов! Запрос не будет выполнен");
            return;
        }
        result.writeResult(cu.checkHistory());
    }

    @Override
    public String toString() {
        return "history : вывести последние 5 команд";
    }
}
