package server.sourse5Lab.fileWorker;


import server.sourse5Lab.mainApp.Result;

/*
    интерфейс для сохранения значений коллекции
 */
public interface IOInterface {
    void write(Result result);
    void read (Result result);
}
