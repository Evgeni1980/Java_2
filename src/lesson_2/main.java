package lesson_2;

public class main {
    public static void main(String[] args) {

        String [][] arr = new String[][]{
                {"1","2","3","4"},
                {"2","3","4","5"},
                {"3","4","5","6"},
                {"4","5","6","7"}
        };

        Massive mas = new Massive();
        mas.summaArray(arr);

    }
}
