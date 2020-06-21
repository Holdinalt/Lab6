package sourse5Lab.commands;

import sourse5Lab.factories.ConnectionManager;
import sourse5Lab.mainApp.Result;

/*
    удаляет что-то из коллекции по определенному критерию
 */
public class RemoveAllByCommand extends Command implements Executable {
    public RemoveAllByCommand(ControlUnit cu, ConnectionManager cm){
        cu.addCommand("remove_by_sbe", this);
        this.cm = cm;
    }
    @Override
    public void execute(String options, Result result) {
        if(options == null){
            result.writeResult("Данная команда должна содержать аргумент. Запрос не будет исполнен");
            return;
        }
        try {

            cm.write("remove_by_sbe " + options);
        } catch (NumberFormatException ec){
            result.writeResult("поступил неверный аргумент. Команда не будет исполнена");
        }
    }

    @Override
    public String toString() {
        return "remove_by_sbe shouldBeExpelled: удалить из коллекции все элементы," + System.lineSeparator() +
                " значение поля shouldBeExpelled которого эквивалентно заданному";
    }
}
