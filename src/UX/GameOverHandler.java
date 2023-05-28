package UX;

import UX.Game;
import algorithm.Seed;

public interface GameOverHandler {
    void handleGameIsOver(Game game, Seed winner);
}
