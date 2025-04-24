package org.howard.edu.lspfinal.question2;

import java.util.HashMap;
import java.util.Map;

/**
 * Manages a collection of tasks and their operations.
 */
public class TaskManager {
    private Map<String, Task> tasks = new HashMap<>();

    // Add a new task to the manager
    public void addTask(String name, int priority, String status) throws DuplicateTaskException {
        if (tasks.containsKey(name)) {
            throw new DuplicateTaskException("Task '" + name + "' already exists.");
        }
        tasks.put(name, new Task(name, priority, status));
    }

    // Retrieve a task by its name
    public Task getTaskByName(String name) throws TaskNotFoundException {
        if (!tasks.containsKey(name)) {
            throw new TaskNotFoundException("Task '" + name + "' not found.");
        }
        return tasks.get(name);
    }

    // Update the status of an existing task
    public void updateStatus(String name, String status) throws TaskNotFoundException {
        Task task = getTaskByName(name);
        task.setStatus(status);
    }

    // Print all tasks grouped by their status
    public void printTasksGroupedByStatus() {
        System.out.println("Tasks grouped by status:");
        for (String status : new String[]{"TODO", "IN_PROGRESS", "DONE"}) {
            System.out.println(status + ":");
            for (Task task : tasks.values()) {
                if (task.getStatus().equals(status)) {
                    System.out.println("  " + task);
                }
            }
        }
    }
}


