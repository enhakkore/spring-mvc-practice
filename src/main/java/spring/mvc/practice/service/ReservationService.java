package spring.mvc.practice.service;

import spring.mvc.practice.domain.Reservation;

import java.util.List;

public interface ReservationService {
    public List<Reservation> query(String Name);
}
