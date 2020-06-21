package client.sourse5Lab.commands;

import collectionWorker.HashMapWrapper;
import factories.StudyGroupFactory;
import mainApp.Result;
import sourseDate.StudyGroup;
/*
    обновляет элемент по заданному айди
 */
public class UpdateCommand implements Command {
    private HashMapWrapper hashMapWrapper;
    public UpdateCommand(ControlUnit cu , HashMapWrapper ha){
        cu.addCommand("update", this);
        hashMapWrapper = ha;
    }
    @Override
    public void execute(String options, Result result) {
        if(options == null){
            result.writeResult("Данная команда не работает без аргументов! Запрос не будет выполнен");
            return;
        }
       result.writeResult( hashMapWrapper.updateById(Long.parseLong(options), new StudyGroupFactory().createStudyGroup())) ;
    }

    @Override
    public String toString() {
        return "update id : обновить значение элемента коллекции, id которого равен заданному";
    }
}
