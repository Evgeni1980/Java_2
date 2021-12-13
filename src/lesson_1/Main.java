package geekbrains.lesson_1;

public class Main {

    public static void main(String[] args) {
        Competitor[] competitors = {
                new Human(250, 1),
                new Cat(200, 2),
                new Robot(300, 3)
        };

        Let[] lets = {
                new Treadmill(250),
                new Wall(3)
        };


        for (int i = 0; i < competitors.length; i++) {
            for (int j = 0; j < lets.length; j++) {
                if (!lets[j].allLet(competitors[i])) {
                    break;

                }
            }
        }


    }
}
