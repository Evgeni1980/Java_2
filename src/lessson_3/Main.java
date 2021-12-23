package lessson_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] arr = {
                "House", "Forest", "Car", "Score",
                "Cat", "Dog", "Car", "Cat", "House",
                "Score"
        };

        List<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.print(list);
        System.out.println();

                    // Вывод уникальных слов.
        Set<String> set;
        set = new HashSet<>(list);
        System.out.print(set);

        System.out.println();

                    // Выывод количества повторений слов.

        Map<String, Integer> repeat = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            Integer count = repeat.getOrDefault(s, 0);
            repeat.put(s, count +1);

        }

        System.out.print(repeat);

    }
}
