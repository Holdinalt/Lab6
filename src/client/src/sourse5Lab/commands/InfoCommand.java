package sourse5Lab.commands;

import sourse5Lab.factories.ConnectionManager;
import sourse5Lab.mainApp.Result;

/*
    команда, которая выводит информацию о коллекции
 */
public class InfoCommand extends Command implements Executable {
    public InfoCommand(ControlUnit controlUnit, ConnectionManager cm){
        controlUnit.addCommand("info", this);
        this.cm = cm;
    }
    @Override
    public void execute(String options, Result result) {
        if(options != null){
            result.writeResult("Данная комада не содержит аргументов! Запрос не будет выполнен");
            return;
        }
        cm.write("info");
    }

    @Override
    public String toString() {
        return "info : вывести в стандартный поток вывода информацию о коллекции";
    }
}
