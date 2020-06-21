package sourse5Lab.commands;

import sourse5Lab.factories.ConnectionManager;
import sourse5Lab.mainApp.Result;

/*
    выводит все элементы коллекции
 */
public class ShowCommand extends Command implements Executable {
    public ShowCommand(ControlUnit controlUnit, ConnectionManager cm){
        controlUnit.addCommand("show", this);
        this.cm = cm;
    }
    @Override
    public void execute(String options, Result result) {
        if(options != null){
            result.writeResult("Данная комада не содержит аргументов! Запрос не будет выполнен");
            return;
        }
        cm.write("show");
    }

    @Override
    public String toString() {
        return "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }
}
