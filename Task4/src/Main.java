import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x:");
        int x =in.nextInt();
        System.out.println("Введите y:");
        int y =in.nextInt();
        System.out.println("Введите z:");
        int z =in.nextInt();
        System.out.println("Среднее арифмитическое: "+((x+y+z)/3));
        double res = Math.floor(((x+y+z)/3)/2);
        if (res == 3 ) System.out.println("Программа выполнена корректно");
    }
}
