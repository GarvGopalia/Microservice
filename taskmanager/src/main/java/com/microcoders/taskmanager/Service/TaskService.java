package com.microcoders.taskmanager.Service;

import com.microcoders.taskmanager.data.models.Task;
import com.microcoders.taskmanager.data.payloads.requests.TaskRequest;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Component;

@Component
public interface TaskService {
    CompletableFuture<Task> createTask(TaskRequest taskRequest);
    CompletableFuture<Optional<Task>> updateTask(String id, TaskRequest taskRequest);
    CompletableFuture<Optional<Task>> deleteTask(String id);
    CompletableFuture<Optional<Task>> getTask(String id);

}
