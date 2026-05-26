  import java.util.Scanner;

  public class Main{
      public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          TaskManager manager = new TaskManager();
          boolean isRunning = true;

          while (isRunning) {
              System.out.println("\n--- PROJECT MANAGEMENT MENU ---");
              System.out.println("1. Add Task");
              System.out.println("2. View Tasks");
              System.out.println("3. Update Task");
              System.out.println("4. Delete Task");
              System.out.println("5. Exit");
              System.out.print("Choose an option: ");

              int choice = scanner.nextInt();
              scanner.nextLine(); // Consume newline

              switch (choice) {
                  case 1:
                      System.out.print("Enter Task ID: ");
                      int id = scanner.nextInt();
                      scanner.nextLine();
                      System.out.print("Enter Task Title: ");
                      String title = scanner.nextLine();
                      manager.addTask(new Task(id, title));
                      break;
                  case 2:
                      manager.viewAllTasks();
                      break;
                  case 3:
                      System.out.print("Enter Task ID to update: ");
                      int updateId = scanner.nextInt();
                      scanner.nextLine();
                      System.out.print("Enter new Title: ");
                      String newTitle = scanner.nextLine();
                      manager.updateTask(updateId, newTitle);
                      break;
                  case 4:
                      System.out.print("Enter Task ID to delete: ");
                      int deleteId = scanner.nextInt();
                      manager.deleteTask(deleteId);
                      break;
                  case 5:
                      isRunning = false;
                      System.out.println("Exiting system. Goodbye!");
                      break;
                  default:
                      System.out.println("Invalid choice. Try again.");
              }
          }
          scanner.close();
      }
  }