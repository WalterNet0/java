package basic_todo.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    //Objects
    private int id;
    private String title;
    private String description;
    private boolean completed;
    private final LocalDateTime createdAt;

    //Date FORMATTER
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    //Constructor
    public Task(int id, String title, String description){
        this.id = id;
        this.title = title;
        this.description = description;
        completed = false;
        createdAt = LocalDateTime.now();
    }

    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    public void markAsPending() { this.completed = false; }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    //toString
    @Override
    public String toString() {
        return "Task #" + id +
                "\nTitle: " + title +
                "\nDescription: " + description +
                "\nCompleted: " + completed +
                "\nCreated at: " + createdAt.format(FORMATTER);
    }
}
