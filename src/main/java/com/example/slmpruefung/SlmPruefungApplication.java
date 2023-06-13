package com.example.slmpruefung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class SlmPruefungApplication {

    public static void main(String[] args) {
        SpringApplication.run(SlmPruefungApplication.class, args);

    }

    @RequestMapping("/slmPruefungApplication")
    @RequestParam(int a)
    public int digitSum(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a = a % 10;
        }
        return sum;
    }
}
