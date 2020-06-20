package client.sourse5Lab.commands;

import collectionWorker.HashMapWrapper;
import factories.StudyGroupFactory;
import mainApp.Result;
/*
    черная магия скрипта
 */
public class ScriptAddCommand implements Command {
    private HashMapWrapper hashMapWrapper;
    public ScriptAddCommand(ControlUnit cu, HashMapWrapper hmw){
        cu.addCommand("script_add", this);
        hashMapWrapper = hmw;
    }
    @Override
    public void execute(String options, Result result) {
        hashMapWrapper.addElement(new StudyGroupFactory().createStudyGroupWithParams(options));
        result.writeResult("Объект успешно добавлен в коллекцию!");
    }

    @Override
    public String toString() {
        return "script_add : команда раработчика";
    }
}
