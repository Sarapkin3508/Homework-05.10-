import java.util.Scanner;

public class StrokyDZ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите основную строку: ");
        String string2 = scanner.nextLine();

        System.out.println("Введите входящую строку: ");
        String string3 = scanner.nextLine();


        String string1 = " " + string2;

        int count = 0;

        for (int i = -1;i < string1.length();i++) {
            int index = string1.indexOf(string3);
            if (index > 0) {
                count++;
            }
            else {
                int g = 2 + 2;
            }
            string1 = string1.replaceFirst(string3, "");
            }
        System.out.println("Слово " + string3 + " встречается " + count + " раз");
        }
    }

