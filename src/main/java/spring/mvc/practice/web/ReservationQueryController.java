package spring.mvc.practice.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.mvc.practice.domain.Reservation;
import spring.mvc.practice.service.ReservationService;

import java.util.List;

@Controller
@RequestMapping("/reservationQuery")
public class ReservationQueryController {

    private final ReservationService reservationService;

    public ReservationQueryController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public void setupForm() {}

    @PostMapping
    public String submitForm(@RequestParam("chimneyName") String chimneyName, Model model) {
        List<Reservation> reservations = java.util.Collections.emptyList();
        if(chimneyName != null) {
            reservations = reservationService.query(chimneyName);
        }

        model.addAttribute("reservations", reservations);
        return "reservationQuery";
    }
}
