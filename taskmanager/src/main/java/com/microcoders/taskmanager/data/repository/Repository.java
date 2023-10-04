package com.microcoders.taskmanager.data.repository;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import com.microcoders.taskmanager.data.models.Task;

public interface Repository<T extends Task> {

    CompletableFuture<T> save(T entity);

    CompletableFuture<Optional<T>> find(String id);

    CompletableFuture<Optional<T>> remove(String id);
}

