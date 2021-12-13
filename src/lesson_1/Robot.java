package geekbrains.lesson_1;

public class Robot implements Competitor {
    private int MAX_RUN;
    private int MAX_JUMP;


    public Robot(int MAX_RUN, int MAX_JUMP) {
        this.MAX_RUN = MAX_RUN;
        this.MAX_JUMP = MAX_JUMP;
    }


    @Override
    public boolean run(int distance) {
        if (distance <= MAX_RUN){
            System.out.println("Робот смог пробежать " + distance + " метров");
            return true;
        }else {
            System.out.println("Робот не смог пробежать " + distance + " метров");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= MAX_JUMP){
            System.out.println("Робот смог перепрыгнуть " + height + " метра.");
            return true;
        }else {
            System.out.println("Робот не смог перепрыгнуть " + height + " метра.");
            return false;
        }
    }
}
