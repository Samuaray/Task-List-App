import java.util.ArrayList;

public class TaskManager {
    
private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }
    public void addTask(Task task) {
        tasks.add(task);
    }
    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }
    public void markTasksAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
        }
    }
    
    public void markTaskAsCompleted(int x) {
            tasks.get(x-1).setCompleted(true); // look out for x value limit
        }
    

    public void displayTasks() {
        {
            if(tasks.isEmpty()){
            System.out.println("No tasks found");
            }
            else
            {
                for(int i = 0; i < tasks.size(); i++)
                {
                    Task task = tasks.get(i); //retrieves the task object at index `i` from the `tasks` ArrayList and assigns it to the variable `task`.
                    System.out.println("|" + (i + 1) + ". " + task.getTitle() + " - " + task.getDescription() + " - " + task.getDueDate() + " - " + (task.isCompleted() ? "Completed" : "Not completed"));
                }
            }
        }
    }

    public void removeTasks(int x){
        tasks.remove(x-1); 
    }
    public ArrayList<Task> getTasks() {
        return tasks;
    }
}
