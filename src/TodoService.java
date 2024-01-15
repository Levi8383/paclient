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
