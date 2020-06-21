package sourse5Lab.commands;

import sourse5Lab.factories.ConnectionManager;
import sourse5Lab.mainApp.Result;

/*
    сохраняет коллекцию в файл
 */
public class SaveCommand extends Command implements Executable {
    public SaveCommand(ControlUnit cu , ConnectionManager cm){
        cu.addCommand("save",this);
        this.cm = cm;
    }
    @Override
    public void execute(String options, Result result) {
        cm.write("save");
    }

    @Override
    public String toString() {
        return "save : сохранить коллекцию в файл";
    }
}
