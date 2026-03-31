package basic_todo.controller;

import basic_todo.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    //Objects
    private final List<Task> tasks;
    private int nextId; //id generator;

    //Constructor
    public TaskManager() {
        this.tasks = new ArrayList<>();
        this.nextId = 1;
    }

    //Methods
    public void addTask(String title, String description){
        Task task = new Task(nextId, title, description);
        tasks.add(task);
        nextId++;

        System.out.println("Task successfully added!");
    }

    public void listTasks(){
        if(tasks.isEmpty()){
            System.out.println("No tasks were registered.");
            return;
        }

        for(Task task : tasks){
            System.out.println(task);
            System.out.println();
        }
    }

    public Task findTaskById(int id){
        for(Task task : tasks){
            if(task.getId() == id){
                return task;
            }
        }

        return null;
    }

    public void completeTask(int id){
        Task task = findTaskById(id);

        if(task != null){
            task.markAsCompleted();

            System.out.printf("Task %d has been finished!\n", task.getId());
        }

        else{
            System.out.println("Task not found.");
        }
    }

    public void removeTask(int id) {
        Task task = findTaskById(id);

        if (task != null) {
            tasks.remove(task);

            System.out.printf("Task %d has been deleted.\n", task.getId());
        } else {
            System.out.println("Task not found.");
        }
    }

    public boolean isEmpty() {
        return tasks.isEmpty();
    }
}
