package com.wideside.test.repository;

import com.wideside.test.entity.CarManufacturer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CarManufacturerRepository extends PagingAndSortingRepository<CarManufacturer, Long> {}
