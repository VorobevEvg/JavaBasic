import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String length =in.nextLine();
        String [] result = length.split(" ");
        int count=0;
        for (int i=0; i < result.length; i++)
        {
            if (Pattern.matches("[a-zA-Z]+",result[i])==true)
            {
                System.out.println(result[i]);
                count=count+1;
            }
        }
        System.out.println("Кол-во: "+ count);
    }
}
