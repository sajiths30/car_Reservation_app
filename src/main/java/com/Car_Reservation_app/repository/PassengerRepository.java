package com.Car_Reservation_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Car_Reservation_app.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
