package UX;

public class Score {
    private final Pos pos;
    private final int scorePoints;

    public Pos getPos() {
        return pos;
    }

    public int getScorePoints() {
        return scorePoints;
    }

    public Score(Pos pos, int scorePoints) {
        this.pos = pos;
        this.scorePoints = scorePoints;
    }
}
