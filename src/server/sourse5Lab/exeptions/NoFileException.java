package server.sourse5Lab.exeptions;

public class NoFileException extends Exception  {
    public NoFileException(){
        super("Файл не найден");
    }
}
