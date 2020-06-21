package sourse5Lab.commands;

import sourse5Lab.factories.ConnectionManager;
import sourse5Lab.mainApp.Result;

/*
    общий интерфейс для каждой команды. Принимает в себя аргументы и обертку для результата
    Благодаря этому интерфейсу все команды можно поместить в одну мапу
 */
public interface Executable {
    void execute(String options, Result result);
}
