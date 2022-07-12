package com.kulasny.springbootcsv.repository;

import com.kulasny.springbootcsv.model.WarehouseIn;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseInRepository extends CrudRepository<WarehouseIn,String> {
}
