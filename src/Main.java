import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) throws Exception {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false; 


    
        while (!exit) {
            System.out.println("(1): Add task");
            System.out.println("(2): Delete task");
            System.out.println("(3): Mark task as completed");
            System.out.println("(4): Display tasks");
            System.out.println("(5): Save tasks");
            System.out.println("(6): Load tasks");
            System.out.println("(0): Exit\n");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
        
            switch (choice) {
                case 1:
                System.out.println("Enter task title:");
                String title = scanner.nextLine();
                System.out.println("Enter task description:");
                String description = scanner.nextLine();
                System.out.println("Enter task due date:");
                String dueDate = scanner.nextLine();
                System.out.println("\n");
                Task task = new Task(title, description, dueDate, false);
                taskManager.addTask(task);
                    break;
                case 2:
                    // Delete 
                    taskManager.displayTasks();
                    System.out.println("Which task do you want to delete?");
                    int d = scanner.nextInt();
                    taskManager.removeTasks(d);
                    System.out.println("\n");
                    break;
                case 3:
                    // Mark task as completed
                    int x = scanner.nextInt();
                    taskManager.markTaskAsCompleted(x);
                    break;
                case 4:
                    // Display tasks
                    taskManager.displayTasks();
                    break;
                case 5:
                    // Save tasks, java file interaction stuff
                    break;
                case 6:
                    // Load tasks, java file interaction stuff
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

















    }
}
