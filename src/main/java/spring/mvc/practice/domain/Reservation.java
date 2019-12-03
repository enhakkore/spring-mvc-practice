package spring.mvc.practice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Reservation {

    private String Name;
    private LocalDate Date;
    private int hour;
    private Player player;
    private SportType sportType;
}
