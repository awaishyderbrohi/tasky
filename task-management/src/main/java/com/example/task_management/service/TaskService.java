package com.example.task_management.service;

import com.example.task_management.entity.Task;

import java.util.List;

public interface TaskService {

    public Task addTask(Task task);
    public List<Task> showTasks();
    public Task showTaskById(long id);
    public void deleteTaskById(long id);
}
