package com.ub.hoy.main.pojo;

public class ApiResponse {

    private final long id;
    private final String content;

    public ApiResponse(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
