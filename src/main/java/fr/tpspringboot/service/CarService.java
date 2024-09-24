package fr.tpspringboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.tpspringboot.model.Car;
import fr.tpspringboot.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	private CarRepository carRepository;
	
	public Car getCarByImmatriculation(final String immatriculation)
		{
			return carRepository.findById(immatriculation).orElseThrow( () -> new RuntimeException("Not found"));
		}
	
	public Iterable<Car> getAllCars()
		{
			return carRepository.findAll();
		}
	
	public Car saveCar(Car car)
		{
			return carRepository.save(car);
		}
	
	public Car updateCar(String immatriculation, Car car)
		{
			Car CarExist = carRepository.findById(immatriculation).orElseThrow(() -> new RuntimeException("Not found for Update"));
			CarExist.setEtat(car.getEtat());
			
			carRepository.save(CarExist);
			
			return CarExist;
		}
	
	public Car deleteCar(String immatriculation)
		{
			Car deleteC = carRepository.findById(immatriculation).orElseThrow(() -> new RuntimeException("Not found for delete"));
			carRepository.deleteById(immatriculation);
			
			return deleteC;
		}
	
	/*	public Car saveCar(Car car)
		{
			Car saveCar = carRepository.save(car);
			return saveCar;
		}	*/
	
	/*	public Optional<Car> saveOrUpdate(Car car, String id)
		{
			Optional<Car> saveCar = carRepository.findById(id);
			if(saveCar != null)
				{
					carRepository.save(car);
				}
			
			return saveCar;
		}	
	
	public void deleteCar(final String immatriculation)
		{
			carRepository.deleteById(immatriculation);
		}	*/

}
