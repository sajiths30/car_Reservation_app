package com.Car_Reservation_app.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Car_Reservation_app.entity.Car;
import com.Car_Reservation_app.repository.CarRepository;

@Controller
public class CarController {
	
	@Autowired
	private CarRepository carRepo;

	@RequestMapping("/findCar")
	public String findCar(@RequestParam("from")String from,
		 @RequestParam("to")String to,@RequestParam("departureDate")@DateTimeFormat(pattern="MM-dd-yyyy")Date departureDate,Model model)
	{
		List<Car> cars = carRepo.findCar(from,to,departureDate);
		model.addAttribute("cars", cars);
		return "displayCars";
	}
	
}
