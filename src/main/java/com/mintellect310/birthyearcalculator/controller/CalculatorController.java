package com.mintellect310.birthyearcalculator.controller;

import org.springframework.web.bind.annotation.*;

import java.time.Year;

@RestController
public class CalculatorController {
    @GetMapping("/")
    public String getBirthYear(@RequestParam(name = "age") String age) {
        try {
            int ageInt = Integer.parseInt(age);
            int curYear = Year.now().getValue();
            int yearInt = curYear - ageInt;
            return Integer.toString(yearInt);
        } catch (NumberFormatException e) {
            return "Provide Valid Age";
        }
    }
}
