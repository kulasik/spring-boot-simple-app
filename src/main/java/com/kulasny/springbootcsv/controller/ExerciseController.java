package com.kulasny.springbootcsv.controller;

import com.kulasny.springbootcsv.dto.Result1DTO;
import com.kulasny.springbootcsv.service.ExerciseService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExerciseController {

    private ExerciseService exerciseService;

    public ExerciseController(ExerciseService exerciseService){
        this.exerciseService = exerciseService;
    }


}
