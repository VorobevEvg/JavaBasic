import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает:");
            for (int i = 1; i < 4; i++) {
                Scanner in = new Scanner(System.in);
                System.out.println("Ответ:");
                String response = in.nextLine();
                boolean result = response.equalsIgnoreCase("Заархивированный вирус");
                boolean help = response.equalsIgnoreCase("Подсказка");
                if (help==true && i==1)
                {
                    System.out.println("Подсказка: 2 слова");
                    System.out.println("Ответ:");
                    String response2 = in.nextLine();
                    boolean result2 = response2.equalsIgnoreCase("Заархивированный вирус");
                    if (result2==true)
                    {
                        System.out.println("Правильно");
                        break;
                    }
                    else
                    {
                        System.out.println("Обидно, приходи в другой раз");
                        break;
                    }

                }
                else {
                if (result == true) {
                    System.out.println("Правильно");
                    break;
                }
                if (i == 1 && result == false || i == 2 && result == false) {
                    System.out.println("Подумай еще!");
                }
                if (i == 2 && help==true || i == 3 && help==true) {
                    System.out.println("Подсказка уже недоступна");
                    
                }
                if (i==3 && result==false)
                {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }}

        }
}


