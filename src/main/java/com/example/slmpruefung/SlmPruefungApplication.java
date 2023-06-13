package com.example.slmpruefung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
@RestController
@SpringBootApplication
public class SlmPruefungApplication {

    public static void main(String[] args) {
        SpringApplication.run(SlmPruefungApplication.class, args);
    }

    @RequestMapping(value ={"/digitSum"})
    public int digitSum(@RequestParam int a) {
        int sum = 0;
        int count = 0;
        count++;
        int countSum=count;
        countDigitSum(count);
        while (a > 0) {
            sum += a % 10;
            a = a /  10;
        }
        return sum;

    }
    @RequestMapping(value = "/count")
    public int countDigitSum(int a){
        int count = a;
        count++;
        return count;
    }
}
