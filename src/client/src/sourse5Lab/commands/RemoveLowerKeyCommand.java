package sourse5Lab.commands;

import sourse5Lab.factories.ConnectionManager;
import sourse5Lab.mainApp.Result;

/*
    удаляет все элементы из коллекции , коюч которых ниже заданного
 */
public class RemoveLowerKeyCommand extends Command implements Executable {
    public RemoveLowerKeyCommand(ControlUnit cu, ConnectionManager cm){
        cu.addCommand("remove_lover", this);
        this.cm = cm;
    }
    @Override
    public void execute(String options, Result result) {
        if(options == null){
            result.writeResult("Данная команда должна содержать аргумент. Запрос не будет исполнен");
            return;
        }
        try {
            cm.write("remove_lover " + options);
        } catch (NumberFormatException ex){
            result.writeResult("поступил неверный формат. Запрос не будет исполнен");
        }
    }

    @Override
    public String toString() {
        return "remove_lover lowerKey: удалить из коллекции все элементы, ключ которых меньше, чем заданный";
    }
}
