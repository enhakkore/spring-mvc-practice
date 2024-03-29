package spring.mvc.practice.service;

import org.springframework.stereotype.Service;
import spring.mvc.practice.domain.Player;
import spring.mvc.practice.domain.Reservation;
import spring.mvc.practice.domain.SportType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ReservationServiceImpl implements ReservationService {

    public static final SportType TENNIS = new SportType(1, "Tennis");
    public static final SportType SOCCER = new SportType(2, "Soccer");

    private final List<Reservation> reservations = new ArrayList<>();

    public ReservationServiceImpl() {
        reservations.add(new Reservation("Tennis #1", LocalDate.of(2019, 12, 3), 16, new Player("Roger", "N/A"), TENNIS));
        reservations.add(new Reservation("Tennis #2", LocalDate.of(2019, 12, 3), 20, new Player("James", "N/A"), TENNIS));
    }

    @Override
    public List<Reservation> query(String Name) {
        return this.reservations.stream()
                .filter(reservation -> Objects.equals(reservation.getName(), Name))
                .collect(Collectors.toList());
    }

}
