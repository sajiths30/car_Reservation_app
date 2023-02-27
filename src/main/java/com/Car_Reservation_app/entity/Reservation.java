package com.Car_Reservation_app.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity {
private boolean checkIn;
private int numberOfBags;
@OneToOne
private Passenger passenger;
@OneToOne
private Car car;
public boolean isCheckIn() {
	return checkIn;
}
public void setCheckIn(boolean checkIn) {
	this.checkIn = checkIn;
}
public int getNumberOfBags() {
	return numberOfBags;
}
public void setNumberOfBags(int numberOfBags) {
	this.numberOfBags = numberOfBags;
}
public Passenger getPassenger() {
	return passenger;
}
public void setPassenger(Passenger passenger) {
	this.passenger = passenger;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}

}
