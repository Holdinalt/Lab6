package sourse5Lab.commands;


import sourse5Lab.factories.ConnectionManager;
import sourse5Lab.mainApp.Result;

/*
    черная магия скрипта
 */
public class ScriptAddCommand extends Command implements Executable {
    public ScriptAddCommand(ControlUnit cu, ConnectionManager cm){
        cu.addCommand("script_add", this);
        this.cm = cm;
    }
    @Override
    public void execute(String options, Result result) {
        cm.write("script_add " + options);
    }

    @Override
    public String toString() {
        return "script_add : команда раработчика";
    }
}
