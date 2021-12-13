package geekbrains.lesson_1;

public class Treadmill implements Let {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean allLet(Competitor c) {
        return c.run(distance);
    }
}
