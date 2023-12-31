package com.microcoders.taskmanager.data.repository;

import com.microcoders.taskmanager.data.models.Task;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Repository
public class TaskRepository extends FaunaRepository<Task> {

    public TaskRepository(){
        super(Task.class, "todos", "tasks");
    }

    @Override
    public CompletableFuture<List<Task>> findAll() {
        return null;
    }

}
