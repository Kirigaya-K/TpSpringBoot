package fr.tpspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.tpspringboot.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, String>{

}
