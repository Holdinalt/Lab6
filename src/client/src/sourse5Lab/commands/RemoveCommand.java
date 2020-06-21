package sourse5Lab.commands;

import sourse5Lab.factories.ConnectionManager;
import sourse5Lab.mainApp.Result;

/*
    удаляет элемент из коллекции по его ID
 */
public class RemoveCommand extends Command implements Executable {

    public RemoveCommand(ControlUnit cu, ConnectionManager cm){
        cu.addCommand("remove" , this);
        this.cm = cm;
    }

    @Override
    public void execute(String options, Result result) {
        if(options == null){
            result.writeResult("Данная команда должна содержать аргумент. Запрос не будет исполнен");
            return;
        }
        try {

            cm.write("remove " + options);;
        } catch (NumberFormatException ec){
            result.writeResult("поступил неверный аргумент. Команда не будет исполнена");
        }

    }

    @Override
    public String toString() {
        return "remove id: удаляет элемент по id в аргументе";
    }
}
