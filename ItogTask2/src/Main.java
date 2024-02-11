import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уравнение:");
        String str =in.nextLine();
        //str.matches(".*\\d.*");
        System.out.println("Вывод: "+str.matches(".*\\d.*"));
        /*String [] result = str.split("=");
        String [] result1 = str.split("\\+");
        String res1=result[0];
        String res2=result[1];
        System.out.println("Вывод: "+res2);*/

    }
}


