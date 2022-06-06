package todo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class todoTest {
    @Test
    public void testToDoWithEmpptyAndHasAsizeOfZero(){
        Todo newToDo = new Todo();
        ArrayList<String> result = newToDo.getTasks();
        assertEquals(result.size(),0);
    }

    @Test
    public void testToDoThatHasSizeOfOneAfterOneEntry(){
        Todo newToDo = new Todo();
        String toDo1="Get Milk";
        newToDo.addTask(toDo1);
        ArrayList<String> result = newToDo.getTasks();
        assertEquals(result.size(),1);
    }

    @Test
    public void testToDoListReturnsTheListOfToDos(){
        Todo newToDo = new Todo();
        String toDo1="Get Milk";
        newToDo.addTask(toDo1);
        List<String> dummyArray = Arrays.asList("Get Milk");
        assertEquals(newToDo.getTasks(),dummyArray);
    }
}
