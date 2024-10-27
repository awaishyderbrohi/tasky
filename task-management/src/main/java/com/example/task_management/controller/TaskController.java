package com.example.task_management.controller;

import com.example.task_management.entity.Task;
import com.example.task_management.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tasky/api/v1")
public class TaskController {


    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @PostMapping("/addtask")
    public @ResponseBody Task PostTask(@RequestBody Task task){
       return taskService.addTask(task);
    }

    @GetMapping("/tasks")
    public @ResponseBody List<Task> showTasks(){
        return taskService.showTasks();
    }
}
