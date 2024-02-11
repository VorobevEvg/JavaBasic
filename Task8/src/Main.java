import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число:");
        int length =in.nextInt();
        int sum = 0;
        for (int i=1; i<= length; i++)
        {
            if (i%2!=0)
            {
                sum = sum+i;
            }
        }
        System.out.println("Сумма нечетных чисел = "+sum);
    }
}


