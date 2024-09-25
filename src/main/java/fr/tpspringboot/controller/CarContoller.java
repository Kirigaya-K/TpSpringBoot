package fr.tpspringboot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.tpspringboot.model.Car;
import fr.tpspringboot.service.CarService;

@RestController
public class CarContoller {
	
	@Autowired
	private CarService carService;
	
	@GetMapping("/cars/{immatriculation}")
	public Car getCar(@PathVariable String immatriculation)
		{	
			return carService.getCarByImmatriculation(immatriculation);
		}
	
	@GetMapping("/cars")
	public Iterable<Car> getAllCar()
		{
			return carService.getAllCars();
		}
	
	@PostMapping("/cars")
	public ResponseEntity<Car> saveCar(@RequestBody Car car)
		{
			Car saveC = carService.saveCar(car);
			return new ResponseEntity<>(saveC, HttpStatus.CREATED);
		}
	
	@PutMapping("/cars/{immatriculation}")
	public ResponseEntity<Car> updateCar(@PathVariable String immatriculation, @RequestBody Car car)
		{
			Car updateC = carService.updateCar(immatriculation, car);
			return new ResponseEntity<Car>(updateC, HttpStatus.OK);
		}
	
	@DeleteMapping("/cars/{immatriculation}")
	public ResponseEntity<Car> deleteCar(@PathVariable String immatriculation)
		{
			Car deleteC = carService.deleteCar(immatriculation);
			return new ResponseEntity<Car>(deleteC, HttpStatus.OK);
		}

}
