package neqrofukk.gamedna.controller;

import lombok.RequiredArgsConstructor;
import neqrofukk.gamedna.service.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/game")
@RequiredArgsConstructor
public class GameController {

    private final GameService service;

    @GetMapping(value = "/all")
    public List<String> getAllGames() {
        return service.getAllGames();
    }
}
