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
