
public class NumberOfGoals {

    int scores;

    public NumberOfGoals(int i) {
        this.scores = i;
    }

    public int  getGoal() {
        return scores;
    }
    public int setScoreToZero() {
        scores = 0;
        return scores;
    }
    public int setGoal() {
        scores++;
        return scores;
    }
}

