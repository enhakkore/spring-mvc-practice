package spring.mvc.practice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@AllArgsConstructor
public class Reservation {

    private String Name;
    private LocalDate Date;
    private int hour;
    private Player player;
    private SportType sportType;

    public String getDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return Date.format(formatter);
    }
}
