package org.howard.edu.lspfinal.question2;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class TaskManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	private Map<String, Task> taks = new HashMap<>();
	
	public void addTask(String name, int priority, string status) throws DuplicateTaskException {
		if (tasks.containsKey(name)) {
			throw new DuplicateTaskException("Task '" + name + " ' already exists.");
		}
		tasks.put(name, new Task(name, priority, status));
	}
	
	public Task getTaskByName(String name) throws TaskNotFoundException {
		if (!tasks.containskey(name)) {
			throw new TaskNotFoundException("Task '" + name + "' not found.");
		}
		return tasks.get(name);
	}
	
	public void updateStatus(String name, String status) throws TaskNotFoundException {
		Task task = getTaskByName(name);
		task.setStatus(status);
	}
	
	public void printTaskGroupByStatus() {
		Map <String, List<Task>> statusGroups = new HashMap<>();
		for (Task task : tasks.values()) {
			statusGroups
				.computeIfAbsent(task.getStatus(), k -> new ArrayList<>())
				.add(task);
		}
	}
	
	System.out.println("Tasks grouped by status:");
	for (String status : new String[] {"TODO", "IN_PROGRESS", "DONE"}) {
		System.out.println(status + ":");
		List<Task> group = statusGroup.getOrDefault(status, new ArrayList<>());
		for (Task task : group) {
			System.out.println("  " + task);
		}
	}
}


