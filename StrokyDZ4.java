import java.util.Scanner;

public class StrokyDZ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String slovo = scanner.nextLine();

        slovo = slovo.toLowerCase();

        System.out.println(slovo.substring(0, 1).toUpperCase() + slovo.substring(1));
    }
}
