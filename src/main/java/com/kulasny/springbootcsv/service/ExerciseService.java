package com.kulasny.springbootcsv.service;

import com.kulasny.springbootcsv.dto.Result1DTO;
import com.kulasny.springbootcsv.dto.Result2DTO;
import com.kulasny.springbootcsv.dto.Result3DTO;

import java.util.List;

public interface ExerciseService {

    public List<Result1DTO> exercise1();

    public List<Result2DTO> exercise2();

    public Result3DTO exercise3(Integer nrKlienta, Integer kod);

    public Result3DTO exercise4(Integer nrKlienta, Integer kod);

}
