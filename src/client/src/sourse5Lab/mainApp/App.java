package sourse5Lab.mainApp;

package mainApp;

import collectionWorker.HashMapWrapper;
import commands.*;
import exceptions.NoFileException;
import factories.IdGenerator;
import factories.StudyGroupFactory;
import fileWorker.FileManager;
import sourse5Lab.commands.ControlUnit;
import sourse5Lab.factories.ConnectionManager;
import sourseDate.Semester;
import sourseDate.StudyGroup;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import com.google.gson.Gson;
/*

 */
public class App {

    public static void main(String[] args){
        ConnectionManager cm = new ConnectionManager();
        ControlUnit cu = new ControlUnit();
        CommandLoader commandLoader = new CommandLoader(cu, cm);
        Result result = new Result();
        System.out.println("Добро пожаловать!  Введите команду");
        cu.executeCommand("load", result);
        System.out.println(result.checkResult());
        while (true) {
            System.out.print("> ");
            result.clear();
            String request = new Scanner(System.in).nextLine();
            if(request.equals("")){
                continue;
            }
            cu.executeCommand(request, result);
            System.out.println(result.checkResult());
        }


    }
}

