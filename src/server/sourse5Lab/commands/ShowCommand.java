package server.sourse5Lab.commands;

import server.sourse5Lab.collectionWorker.HashMapWrapper;
import server.sourse5Lab.mainApp.Result;

/*
    выводит все элементы коллекции
 */
public class ShowCommand implements Command {
    public HashMapWrapper hashMapWrapper;
    public ShowCommand(ControlUnit controlUnit, HashMapWrapper hashMapWrapper){
        controlUnit.addCommand("show", this);
        this.hashMapWrapper = hashMapWrapper;
    }
    @Override
    public void execute(String options, Result result) {
        if(options != null){
            result.writeResult("Данная комада не содержит аргументов! Запрос не будет выполнен");
            return;
        }
        result.writeResult(hashMapWrapper.show());
    }

    @Override
    public String toString() {
        return "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }
}
