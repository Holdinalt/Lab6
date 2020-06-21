package sourse5Lab.commands;

import sourse5Lab.factories.ConnectionManager;
import sourse5Lab.mainApp.Result;

public class SumCommand extends Command implements Executable {
    public SumCommand(ControlUnit cu, ConnectionManager cm){
        cu.addCommand("sum_sbe", this);
        this.cm =cm;
    }
    @Override
    public void execute(String options, Result result) {
        if(options != null){
            result.writeResult("Данная комада не содержит аргументов! Запрос не будет выполнен");
            return;
        }
        cm.write("sum_sbe");
    }

    @Override
    public String toString() {
        return "sum_sbe shouldBeExpelled: вывести сумму значений поля shouldBeExpelled для всех элементов коллекции";
    }
}
