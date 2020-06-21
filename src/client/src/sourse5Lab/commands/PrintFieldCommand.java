package sourse5Lab.commands;

import sourse5Lab.factories.ConnectionManager;
import sourse5Lab.mainApp.Result;

/*
    выводит информацию о админах группы и соритрует по какому-то критерию
 */
public class PrintFieldCommand extends Command implements Executable {
    public PrintFieldCommand(ControlUnit cu, ConnectionManager cm){
        cu.addCommand("print_admin",this);
        this.cm = cm;
    }

    @Override
    public void execute(String options, Result result) {
        if(options != null){
            result.writeResult("Данная комада не содержит аргументов! Запрос не будет выполнен");
            return;
        }
        cm.write("print_admin");
    }

    @Override
    public String toString() {
        return "print_admin : вывести значения поля groupAdmin всех элементов в порядке возрастания";
    }
}
