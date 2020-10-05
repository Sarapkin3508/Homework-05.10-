import java.util.Arrays;
import java.util.Scanner;

// Доделаю во вторник (скорее всего), сейчас ничего не работает
public class StrokyDZ1 {
    public static void main(String[] args) {
       String[] fruit = new String[6];
         fruit = new String[]{"Банан", "Яблоко", "Груша", "Ананас", "Персик", "Абрикос"};

         int t = 0;
         do
         {
             Scanner scanner = new Scanner(System.in);

             System.out.println("Выберите действие: ");
             System.out.println("1 -  Вывести БД, 2 - Записать новое слово, 3 - выход");
             int action = scanner.nextInt();
             if (action == 1) {


                 String concatStr = "";
                 for (int i = 0; i < 6; i++) {
                     concatStr = (i + 1) + " - " + fruit[i];
                     System.out.println(concatStr); // Выводит всю БД
                 }
             }

             else if  (action == 2) {
             System.out.println("Какой номер вы хотите перезаписать?");
             int answer = scanner.nextInt();

             System.out.println("Введите название нового фрукта (не должен повторятся с другим): ");
             String fruit2 = scanner.nextLine();
             fruit[answer] = fruit2;
         }
             else if (action == 3)
             {
                 System.out.println("Выход из программы");
            t = 1;
             }
             else{
                 System.out.println("Ошибка, повторите команду снова");
             }
         }while (t != 1);
    }
}
