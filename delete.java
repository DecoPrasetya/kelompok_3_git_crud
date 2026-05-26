      public void deleteTask(int id){
          taskList.removeIf(t -> t.getId() == id);
          System.out.println("Task deleted (if existed).");
      }