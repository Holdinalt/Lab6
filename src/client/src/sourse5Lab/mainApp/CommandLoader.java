package sourse5Lab.mainApp;

import sourse5Lab.commands.*;
import sourse5Lab.commands.Executable;
import sourse5Lab.factories.ConnectionManager;

import java.net.Socket;

public class CommandLoader {
    public CommandLoader(ControlUnit cu, ConnectionManager cm){
       Executable clear = new ClearCommand(cu, cm);
       Executable execute = new ExecuteScriptCommand(cu, cm);
       Executable exit = new ExitCommand(cu, cm);
       Executable help = new HelpCommand(cu);
       Executable history = new HistoryCommand(cu, cm);
       Executable info = new InfoCommand(cu, cm);
       Executable insert = new InsertCommand(cu, cm);
       Executable print = new PrintFieldCommand(cu, cm);
       Executable removeAll = new RemoveAllByCommand(cu, cm);
       Executable remove = new RemoveCommand(cu, cm);
       Executable removeLower = new RemoveLowerKeyCommand(cu, cm);
       Executable save = new SaveCommand(cu, cm);
       Executable scriptAdd = new ScriptAddCommand(cu, cm);
       Executable show = new ShowCommand(cu, cm);
       Executable sum = new SumCommand(cu, cm);
       Executable update = new UpdateCommand(cu, cm);
    }
}
