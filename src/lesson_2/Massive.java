package lesson_2;

public class Massive {
    public void summaArray(String [][] a) {
        int summa = 0;
        if(a.length != 4){
            throw new MyArraySizeException ("Не правильный размер строки");
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i].length != 4){
                throw new MyArraySizeException ("Не правильный размер столбца");
            }
            for (int j = 0; j < a[i].length; j++) {
                try {
                    summa += Integer.parseInt(a[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException ("Ошибка преобразования: ["+ i +"]["+j+"]");
                }
            }
        }
        System.out.println("Сумма массива: " + summa);
    }
}
