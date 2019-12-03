package spring.mvc.practice.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Reservation {

    private String Name;
    private Date Date;
    private int hour;
    private Player player;
    private SportType sportType;
}
