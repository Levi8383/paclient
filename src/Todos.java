/*
* File: App.java
* Author: Szilágyi Levente
* Copyright: 2024, Szilágyi Levente
* Group: Szoft II/1/E
* Date: 2023-01-15
* Github: https://github.com/Levi8383/paclient
* Licenc: GNU GPL
*/

public class Todos {

    int userId;
    int id;
    String title;
    String completed;

    public Todos() {}

    public Todos(String title) {
        this.title = title;
    }

    public Todos( String title, String completed) {
        this.title = title;
        this.completed = completed;
    }

    public Todos(int userId, int id, String title, String completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }


}
