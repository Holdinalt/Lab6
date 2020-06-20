package server.sourse5Lab.commands;

import server.sourse5Lab.collectionWorker.HashMapWrapper;
import server.sourse5Lab.mainApp.Result;

/*
    выводит информацию о админах группы и соритрует по какому-то критерию
 */
public class PrintFieldCommand implements Command {
    private HashMapWrapper hashMapWrapper;
    public PrintFieldCommand(ControlUnit cu, HashMapWrapper hm){
        cu.addCommand("print_admin",this);
        hashMapWrapper = hm;
    }

    @Override
    public void execute(String options, Result result) {
        if(options != null){
            result.writeResult("Данная комада не содержит аргументов! Запрос не будет выполнен");
            return;
        }
        result.writeResult(hashMapWrapper.printAdmins());
    }

    @Override
    public String toString() {
        return "print_admin : вывести значения поля groupAdmin всех элементов в порядке возрастания";
    }
}
