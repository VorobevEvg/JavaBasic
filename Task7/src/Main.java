import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Размер массива:");
        int length =in.nextInt();
        int [] myArray = new int [length];
        for (int i=0; i< length; i++)
        {
            System.out.println("Введите "+(i+1)+" значение:" );
            int y =in.nextInt();
            myArray[i]=y;
        }
        System.out.println("Введите константу x:");
        int x =in.nextInt();
        System.out.println("Введите константу y:");
        int y =in.nextInt();
        System.out.println("Введите константу z:");
        int z =in.nextInt();
        for (int j=0; j< length; j++) {
            if (x==myArray[j]||y==myArray[j]||z==myArray[j])
                {
                System.out.println("Данное значение имеется в константах");
                }
            }
        }
        }


