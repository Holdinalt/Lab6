package sourse5Lab.commands;

import sourse5Lab.commands.Command;
import sourse5Lab.commands.ControlUnit;
import sourse5Lab.commands.Executable;
import sourse5Lab.factories.ConnectionManager;
import sourse5Lab.mainApp.Result;
/*
    Добавляет новый элемент в коллекцию с помощью фабрики
 */

public class InsertCommand extends Command implements Executable {
    public InsertCommand(ControlUnit cu, ConnectionManager cm){
        cu.addCommand("insert", this);
        this.cm = cm;
    }
    @Override
    public void execute(String options, Result result) {
        if(options != null){
            result.writeResult("Данная комада не содержит аргументов! Запрос не будет выполнен");
            return;
        }
        hashMapWrapper.addElement(new StudyGroupFactory().createStudyGroup());
        result.writeResult("Объект успешно добавлен  в коллекцию!");
    }

    @Override
    public String toString() {
        return "insert : добавить новый элемент в коллекцию";
    }
}
