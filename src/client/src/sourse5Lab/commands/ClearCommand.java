package sourse5Lab.commands;

import sourse5Lab.factories.ConnectionManager;
import sourse5Lab.mainApp.Result;

/*
    команда для очистики коллекции
 */
public class ClearCommand extends Command implements Executable {
    private ConnectionManager mainColl;
    public ClearCommand(ControlUnit cu, ConnectionManager cm){
        cu.addCommand("clear", this);
        this.cm = cm;
    }
    @Override
    public void execute(String options, Result result) {
        if(options != null){
            result.writeResult("Данная команда не содержит аргументов! Запрос не будет выполнен");
            return;
        }
        cm.write("clear");
    }

    @Override
    public String toString() {
        return "clear - очистить коллекцию";
    }
}
