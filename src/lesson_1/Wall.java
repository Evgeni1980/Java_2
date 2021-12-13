package geekbrains.lesson_1;

public class Wall implements Let {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean allLet(Competitor c) {
        return c.jump(height);
    }
}
