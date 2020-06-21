package sourse5Lab.commands;

import sourse5Lab.factories.ConnectionManager;
import sourse5Lab.mainApp.Result;

/*
    обновляет элемент по заданному айди
 */
public class UpdateCommand extends Command implements Executable {
    public UpdateCommand(ControlUnit cu , ConnectionManager cm){
        cu.addCommand("update", this);
        this.cm = cm;
    }
    @Override
    public void execute(String options, Result result) {
        if(options == null){
            result.writeResult("Данная команда не работает без аргументов! Запрос не будет выполнен");
            return;
        }
       cm.write("update " + options);
    }

    @Override
    public String toString() {
        return "update id : обновить значение элемента коллекции, id которого равен заданному";
    }
}
