package sourse5Lab.commands;


import sourse5Lab.factories.ConnectionManager;
import sourse5Lab.mainApp.Result;

/*
    выводит информацию о последних выполненных командах
 */
public class HistoryCommand extends Command implements Executable {
    public HistoryCommand(ControlUnit controlUnit, ConnectionManager cm){
        this.cu = controlUnit;
        cu.addCommand("history", this);
        this.cm = cm;

    }
    @Override
    public void execute(String options, Result result) {
        if(options != null){
            result.writeResult("Данная комада не содержит аргументов! Запрос не будет выполнен");
            return;
        }
        cm.write("history");
    }

    @Override
    public String toString() {
        return "history : вывести последние 5 команд";
    }
}
