import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StrokyDZ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dlina1 = 0;
        int dlina2 = 0;
        int j = 0;
        int t = 0;
        int biggest = 0;

        System.out.println("Введите предложение: ");
        String string2 = scanner.nextLine();
        for (String slovo : string2.split(" ")) { //Запоминаем кол-во слов
            t++;
        }
            String[] fraza = new String[t];


            for (String sentence : string2.split(" ")) { //Записываем слова в массив
                fraza[j] = sentence;
                j++;

            }
        int[] count = new int[t];
            for (int i =0;i < t;i++) { //Считаем длину каждого слова
                count[i] = fraza[i].length();
            }
         for (int z =1;z < t;z++) { //Находим индекс самого длиного слова
            if (count[z-1] < count[z])
            {
                 biggest = z;
            }
            else {
              int  g = 2 + 2;
            }
            }


            System.out.println("Слово с наибольшим числом символов: " + fraza[biggest]);


        }
    }


