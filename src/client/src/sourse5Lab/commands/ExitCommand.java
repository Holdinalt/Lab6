package sourse5Lab.commands;

import sourse5Lab.factories.ConnectionManager;
import sourse5Lab.mainApp.Result;

/*
    насильно завершает работу программы
 */
public class ExitCommand extends Command implements Executable{
    public ExitCommand(ControlUnit cu, ConnectionManager cm){
        this.cm = cm;
        cu.addCommand("exit", this);
    }

    @Override
    public void execute(String options, Result result) {
        if(options != null){
            result.writeResult("Данная комада не содержит аргументов! Запрос не будет выполнен");
            return;
        }
        System.exit(0);
    }

    @Override
    public String toString() {
        return "exit : завершить программу (без сохранения в файл)";
    }
}
