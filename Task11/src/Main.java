import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        String first =in.next();
        System.out.println("Введите второе число:");
        Integer second =in.nextInt();
        Integer intFirst = Integer.parseInt(first);
        if (intFirst > second)
        {
            System.out.println("Большее число: "+first);
            double doubleSecond = second.doubleValue();
            System.out.println("Меньшее число: "+doubleSecond);
        }
        else {
            {
                System.out.println("Большее число: "+second);
                double doubleFirst = intFirst.doubleValue();
                System.out.println("Меньшее число: "+doubleFirst);
            }
        }

    }
}