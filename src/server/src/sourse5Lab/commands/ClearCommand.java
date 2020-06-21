package server.sourse5Lab.commands;

import server.sourse5Lab.collectionWorker.HashMapWrapper;
import server.sourse5Lab.mainApp.Result;

/*
    команда для очистики коллекции
 */
public class ClearCommand implements Command {
    private HashMapWrapper mainColl;
    public ClearCommand(ControlUnit cu, HashMapWrapper hashMapWrapper){
        cu.addCommand("clear", this);
        mainColl = hashMapWrapper;
    }
    @Override
    public void execute(String options, Result result) {
        if(options != null){
            result.writeResult("Данная команда не содержит аргументов! Запрос не будет выполнен");
            return;
        }
        mainColl.clear();
        result.writeResult("Коллекция очищена!");

    }

    @Override
    public String toString() {
        return "clear - очистить коллекцию";
    }
}
