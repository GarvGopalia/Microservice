package com.microcoders.taskmanager.data.payloads.requests;

import lombok.Data;

import java.time.LocalDateTime;

import org.antlr.v4.runtime.misc.NotNull;

@Data
public class TaskRequest {
    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @NotBlank
    private String description;
    private  boolean isCompleted;
}