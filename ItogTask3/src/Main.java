import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Введите количество строк: ");
        Scanner first = new Scanner(System.in);
        n = first.nextInt();
        String[] str = new String[n];
        Scanner second = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            System.out.println("Введите строку: ");
            str[i] = second.nextLine();
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        int[] count = new int[n];

        for (int i = 0; i < str.length; i++) {
            for (int j = i; j < str[i].length(); j++) {
                char temp = ' ';
                for (int z = j; z < str[i].length(); z++) {
                    if (str[i].charAt(j) != str[i].charAt(z) && temp != str[i].charAt(z)) {
                        temp = str[i].charAt(z);
                        count[i]++;
                    }
                }
            }
        }
        int max = 0;
        String result = "";
        for (int i = 0; i < count.length; i++) {
            if (max <= count[i]) {
                max = count[i];
                result = str[i];
            }
        }

        System.out.println("Ответ: "+result);
    }
}