package com.ub.hoy.main.cont;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ub.hoy.main.pojo.ApiResponse;

@RestController
public class ApiController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/api")
    public ApiResponse getApiResponse(@RequestParam(value="name", defaultValue="World") String name) {
        return new ApiResponse(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
