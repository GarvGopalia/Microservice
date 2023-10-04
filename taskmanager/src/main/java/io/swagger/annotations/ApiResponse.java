package io.swagger.annotations;

public @interface ApiResponse {

    String message();

    int code();

    ApiResponse[] value();

}
