package com.wideside.test.repository;

import com.wideside.test.entity.CarModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CarModelRepository extends PagingAndSortingRepository<CarModel, Long> {
    @Query("from CarModel cm where cm.carManufacturer.id = ?1")
    List<CarModel> getModelsByManufacturer(Long cmId);
}
