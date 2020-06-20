package server.sourse5Lab.commands;

import server.sourse5Lab.collectionWorker.HashMapWrapper;
import server.sourse5Lab.mainApp.Result;

/*
    удаляет что-то из коллекции по определенному критерию
 */
public class RemoveAllByCommand implements Command {
    private HashMapWrapper hashMapWrapper;
    public RemoveAllByCommand(ControlUnit cu, HashMapWrapper hashMapWrapper){
        cu.addCommand("remove_by_sbe", this);
        this.hashMapWrapper = hashMapWrapper;
    }
    @Override
    public void execute(String options, Result result) {
        if(options == null){
            result.writeResult("Данная команда должна содержать аргумент. Запрос не будет исполнен");
            return;
        }
        try {

            result.writeResult(hashMapWrapper.removeBySBE(Integer.parseInt(options)));
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
