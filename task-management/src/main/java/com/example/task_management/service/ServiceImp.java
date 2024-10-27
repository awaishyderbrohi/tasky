package com.example.task_management.service;

import com.example.task_management.entity.Task;
import com.example.task_management.repo.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImp implements TaskService {

    private TaskRepository taskRepository;

    @Autowired
    public ServiceImp(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> showTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task showTaskById(long id) {
        return taskRepository.findById(id).get();
    }

    @Override
    public void deleteTaskById(long id) {
        taskRepository.deleteById(id);
    }
}
