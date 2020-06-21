package client.sourse5Lab.commands;

import client.sourse5Lab.collectionWorker.HashMapWrapper;
import client.sourse5Lab.mainApp.Result;
import client.sourse5Lab.factories.StudyGroupFactory;
/*
    Добавляет новый элемент в коллекцию с помощью фабрики
 */

public class InsertCommand implements Command {
    private HashMapWrapper hashMapWrapper;
    public InsertCommand(ControlUnit cu, HashMapWrapper hmw){
        cu.addCommand("insert", this);
        hashMapWrapper = hmw;
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
