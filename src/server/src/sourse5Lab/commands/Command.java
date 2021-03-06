package sourse5Lab.commands;

import server.sourse5Lab.mainApp.Result;

/*
    общий интерфейс для каждой команды. Принимает в себя аргументы и обертку для результата
    Благодаря этому интерфейсу все команды можно поместить в одну мапу
 */
public interface Command {
    void execute(String options, Result result);
}
