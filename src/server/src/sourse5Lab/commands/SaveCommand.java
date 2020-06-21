package server.sourse5Lab.commands;

import server.sourse5Lab.fileWorker.FileManager;
import server.sourse5Lab.mainApp.Result;

/*
    сохраняет коллекцию в файл
 */
public class SaveCommand implements Command {
    FileManager fileManager;
    public SaveCommand(ControlUnit cu , FileManager fileManager){
        cu.addCommand("save",this);
        this.fileManager = fileManager;
    }
    @Override
    public void execute(String options, Result result) {
        fileManager.write(result);
    }

    @Override
    public String toString() {
        return "save : сохранить коллекцию в файл";
    }
}
