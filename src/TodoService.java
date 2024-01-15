/*
* File: App.java
* Author: Szilágyi Levente
* Copyright: 2024, Szilágyi Levente
* Group: Szoft II/1/E
* Date: 2023-01-15
* Github: https://github.com/Levi8383/paclient
* Licenc: GNU GPL
*/

import java.util.ArrayList;
import hu.szit.Convert;

public class TodoService {

    DataService dataService;

    public TodoService() {
        dataService = new DataService();
        getTodos();
    }

    public void getTodos(){        

        String result = dataService.getTodos();
        

        ArrayList<Todos> todosList = Convert.toListObject(result, Todos.class);

        for (Todos todos : todosList){
            System.out.printf("UserID: " + todos.userId + "\n");
            System.out.printf("ID: " + todos.id + "\n");
            System.out.printf("Title: " + todos.title + "\n");
            System.out.printf("Completed: " + todos.completed + "\n");
            System.out.println();
        }
        System.out.println(result);
    }
}
