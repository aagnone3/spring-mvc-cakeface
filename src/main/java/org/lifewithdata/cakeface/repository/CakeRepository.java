package org.lifewithdata.cakeface.repository;

import org.springframework.data.repository.CrudRepository;

import org.lifewithdata.cakeface.model.Cake;

public interface CakeRepository extends CrudRepository<Cake, Long> {
    
}
