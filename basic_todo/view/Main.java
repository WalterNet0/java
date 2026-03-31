package basic_todo.view;

import basic_todo.controller.TaskManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while(true){
            System.out.println("\nWELCOME TO YOUR ToDo APP!\n");
            System.out.println("1 - Add Task");
            System.out.println("2 - List tasks");
            System.out.println("3 - Complete a task");
            System.out.println("4 - Remove a task");
            System.out.println("0 - Quit");

            System.out.print("\nInsert your option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            System.out.println();

            switch(option){
                case 1:
                    System.out.println("TASK CREATION\n");

                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Description: ");
                    String desc = scanner.nextLine();

                    manager.addTask(title, desc);
                    break;

                case 2:
                    System.out.println("TASK LIST\n");

                    manager.listTasks();
                    break;

                case 3:
                    System.out.println("TASK COMPLETION\n");

                    if(manager.isEmpty()){
                        System.out.println("No tasks registered to complete.");
                        break;
                    }

                    System.out.print("Insert the task id: ");
                    int completeId = scanner.nextInt();

                    manager.completeTask(completeId);
                    break;

                case 4:
                    System.out.println("TASK REMOVAL\n");

                    if(manager.isEmpty()){
                        System.out.println("No tasks registered to remove.");
                        break;
                    }

                    System.out.println("Insert the task id: ");
                    int removeId = scanner.nextInt();

                    manager.removeTask(removeId);
                    break;

                case 0:
                    System.out.println("Quitting.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
