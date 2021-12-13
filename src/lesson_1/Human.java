package geekbrains.lesson_1;

public class Human implements Competitor {
    private int MAX_RUN;
    private int MAX_JUMP;

    public Human(int MAX_RUN, int MAX_JUMP) {
        this.MAX_RUN = MAX_RUN;
        this.MAX_JUMP = MAX_JUMP;
    }

//    public Human() {
//        this(300,1);
//    }

    @Override
    public boolean run(int distance) {
        if (distance <= MAX_RUN){
            System.out.println("Человек смог пробежать " + distance + " метров");
            return true;
        }else {
            System.out.println("Человек не смог пробежать " + distance + " метров");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= MAX_JUMP){
            System.out.println("Человек смог перепрыгнуть " + height + " метра.");
            return true;
        }else {
            System.out.println("Человк не смог перепрыгнуть " + height + " метра.");
            return false;
        }
    }
}
