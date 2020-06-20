package client.sourse5Lab.commands;

import client.sourse5Lab.mainApp.Result;

import java.util.*;
/*
    Класс , отвечающий за вызов команд и помещение вызванных команд в историю
    умееет добавять новые команды. Сами же команды автоматически добавляются в коллекцию
    при создании. Существует защита от несуществующих команд
 */
public class ControlUnit {
    private Map<String,Command> commandMap;
    private List<String> history;
    public ArrayList<Command> commandList;


    public ControlUnit(){
        commandMap = new HashMap<>();
        history = new ArrayList<>();
        commandList = new ArrayList<>();
    }

    public void addCommand(String name, Command command){
        commandMap.put(name,command);
        commandList.add(command);
    }
    public void saveHistory(String command){
        if( history.size() >= 5){
            history.remove(0);
        }
        history.add(command);
    }

    public String checkHistory(){
        return history.toString();
    }

    public void executeCommand(String query, Result result){
        if(query.equals("")){
            return;
        }
        try {
            List<String> splitQuery = Arrays.asList(query.split(" "));
            if (splitQuery.size() == 1) {
                commandMap.get(splitQuery.get(0)).execute(null, result);
                saveHistory(splitQuery.get(0));
            } else if (splitQuery.size() == 2) {
                commandMap.get(splitQuery.get(0)).execute(splitQuery.get(1), result);
                saveHistory(splitQuery.get(0));
            } else {
                result.writeResult("Команда состоит из двух частей. имя и возможные аргументы.");
            }
        } catch (NullPointerException ex){
            result.writeResult("Такой команды не существует или не указаны аргументы");
        }

    }
    public void executeCommand(String name, String params, Result result){
        commandMap.get(name).execute(params,result);
    }
}
