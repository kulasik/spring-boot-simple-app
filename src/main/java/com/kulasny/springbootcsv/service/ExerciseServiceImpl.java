package com.kulasny.springbootcsv.service;

import com.kulasny.springbootcsv.dto.Result1DTO;
import com.kulasny.springbootcsv.dto.Result2DTO;
import com.kulasny.springbootcsv.dto.Result3DTO;
import com.kulasny.springbootcsv.model.WarehouseIn;
import com.kulasny.springbootcsv.model.WarehouseOut;
import com.kulasny.springbootcsv.repository.WarehouseInRepository;
import com.kulasny.springbootcsv.repository.WarehouseOutRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseServiceImpl implements ExerciseService{

    private WarehouseInRepository warehouseInRepository;
    private WarehouseOutRepository warehouseOutRepository;

    public ExerciseServiceImpl(WarehouseInRepository warehouseInRepository,
                               WarehouseOutRepository warehouseOutRepository
    ) {
        this.warehouseInRepository = warehouseInRepository;
        this.warehouseOutRepository = warehouseOutRepository;
    }

    @Override
    public List<Result1DTO> exercise1() {
        return null;
    }

    @Override
    public List<Result2DTO> exercise2() {
        return null;
    }

    @Override
    public Result3DTO exercise3(Integer nrKlienta, Integer kod) {
        return null;
    }

    @Override
    public Result3DTO exercise4(Integer nrKlienta, Integer kod) {
        return null;
    }
}
