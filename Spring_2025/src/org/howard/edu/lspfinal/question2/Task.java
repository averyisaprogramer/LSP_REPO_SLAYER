package org.howard.edu.lspfinal.question2;

/**
 * Represents a Task with a name, priority, and status.
 */
public class Task {
    private String name;
    private int priority;
    private String status;

    /**
     * Constructor to create a Task.
     * 
     * @param name     The name of the task.
     * @param priority The priority of the task (lower number means higher priority).
     * @param status   The status of the task.
     */
    public Task(String name, int priority, String status) {
        this.name = name;
        this.priority = priority;
        this.status = status;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    // Setter for status
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + ", status='" + status + "'}";
    }
}
/* code sourced from chat gpt
 */
