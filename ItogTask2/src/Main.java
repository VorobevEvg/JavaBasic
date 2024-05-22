import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String array[] = new String[4];
        System.out.println("Ввод:");
        String str = in.next();
        char[] charArray = str.toCharArray();
        int result = 0;
        int x1 = Character.digit(charArray[0], 10);
        int x2 = Character.digit(charArray[2], 10);
        int x3 = Character.digit(charArray[4], 10);
        if (charArray[1] == '-') {
            if (charArray[0] == 'x') {
                result = x2 + x3;
            }
            if (charArray[2] == 'x') {
                result = x1 - x3;
            }
            if (charArray[4] == 'x') {
                result = x1 - x2;
            }
               System.out.println("Вывод: "+result);

        }
    }
}


