package neqrofukk.gamedna.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    public List<String> getAllGames() {
        return List.of("game1", "game2");
    }
}
