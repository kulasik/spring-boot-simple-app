package com.kulasny.springbootcsv.repository;

import com.kulasny.springbootcsv.model.WarehouseOut;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseOutRepository extends CrudRepository<WarehouseOut,String> {
}
