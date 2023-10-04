package com.microcoders.taskmanager.data.repository;

import java.util.concurrent.CompletableFuture;

public interface IdentityFactory {

    CompletableFuture<String> nextId();
}