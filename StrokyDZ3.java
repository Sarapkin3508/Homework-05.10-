import java.util.Scanner;

public class StrokyDZ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String slovo = scanner.nextLine();
        //String slovo = "лепс спел";

        String reverse = new StringBuffer(slovo).reverse().toString();


        if (slovo.equals(reverse) == true){
            System.out.println("Данная строка - палиндром");

        }
        else {
            System.out.println("Данная строка не является палиндромом");
        }

    }
}

