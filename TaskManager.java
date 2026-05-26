import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> taskList = new ArrayList<>();

    // CREATE
    public void addTask(Task task) {
        if (task == null) {
            System.out.println("failed to add task: Task cannot be null.");
            return;
        }
        taskList.add(task);
        System.out.println("Task added successfully!");
    }

    // READ
    public void viewAllTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (Task t : taskList) {
            System.out.println(t.toString());
        }
    }

    // UPDATE
    public void updateTask(int id, String newTitle) {
        for (Task t : taskList) {
            if (t.getId() == id) {
                t.setTitle(newTitle);
                System.out.println("Task updated!");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    // DELETE
    public void deleteTask(int id) {
        int sizeBefore = taskList.size();
        taskList.removeIf(t -> t.getId() == id);
        
        if (taskList.size() < sizeBefore) {
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Task ID not found. No task deleted.");
        }
    }
}