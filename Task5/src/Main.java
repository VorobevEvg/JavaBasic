import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int x =in.nextInt();
        System.out.println("Введите второе число:");
        int y =in.nextInt();
        System.out.println("Введите символ +, -, * или /:");
        String operation =in.next();
        char c = operation.charAt(0);
        if (c == '+')
        {
            System.out.println("Результат : "+x+"+"+y+"="+(x+y));
        }
        if (c == '-')
        {
            System.out.println("Результат : "+x+"-"+y+"="+(x-y));
        }
        if (c == '*')
        {
            System.out.println("Результат : "+x+"*"+y+"="+(x*y));
        }
        if (c == '/')
        {
            System.out.println("Результат : "+x+"/"+y+"="+(x/y));
        }
        }
    }
