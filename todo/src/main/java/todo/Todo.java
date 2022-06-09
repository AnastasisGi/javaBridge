package todo;
import java.util.ArrayList;

public class Todo {

    public ArrayList<String> todoList;


        public Todo(){
            this.todoList = new ArrayList<>();
        }

        public ArrayList<String> getTasks(){
            return todoList;
        }
        public void addTask(String toDo1) {
        todoList.add(toDo1);
    }
}



