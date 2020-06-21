package sourse5Lab.factories;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ConnectionManager {

    private Socket clientSocket; //сокет для общения
    private BufferedReader in; // поток чтения из сокета
    private BufferedWriter out; // поток записи в сокет
    private boolean status = false;

    public ConnectionManager(){
        try {
            makeConnection();
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        } catch (IOException e) {
            System.out.println("Что-то пошло не так cо свзязью с сервером");
        }
    }

        public boolean getStatus(){
        return status;
    }

    public String read(){
        String serverWord = null;
        try{
            serverWord =  in.readLine();
        } catch (IOException e){
            System.out.println("Что-то случилось с потоком считывания данных с сервера, возможен разрыв соеденения");
        }
        return serverWord;
    }

    public void write(String string){
        try{
            out.write(string + "\n"); // отправляем сообщение на сервер
            out.flush();
        } catch (IOException e){
            System.out.println("Что-то случилось с потоком записи, возможен разрыв соеденения");
        }
    }

    private void connect(String hostName, int port){
        try {
            clientSocket = new Socket(hostName, port);
        } catch (IOException e) {
                System.err.println("Не удалось установить соеденение");
        }
    }

    public void makeConnection(){
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите IP адресс");
            String hostName = scanner.nextLine();
            System.out.println("Порт");
            int port = scanner.nextInt();
            connect(hostName, port);
            if (clientSocket.isBound()) {
                status = true;
                System.out.println("Соеденение успешно установленно");
                break;
            }
        }
    }
}
