      public void updateTask(int id, String newTitle){
          for (Task t : taskList) {
              if (t.getId() == id) {
                  t.setTitle(newTitle);
                  System.out.println("Task updated!");
                  return;
              }
          }
          System.out.println("Task not found.");
      }