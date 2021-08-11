package com.udacity.pricing.repository;

import com.udacity.pricing.entity.Price;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface PriceRepository extends CrudRepository<Price, Long> {
    Price findByVehiculeId(@Param("vehicleId") Long vehiculeId);
}
