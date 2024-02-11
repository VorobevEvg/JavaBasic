import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int min=20;
        int max=-20;
        int [] myArray = new int [15];
        System.out.println("Заданный массив:");
        for (int i=0; i< 15; i++)
        {
            double random = Math.random()*(20+20)-20;
            int intRandom = (int)random;
            myArray[i]=intRandom;
            System.out.print(myArray[i]+" ");
            if (min>myArray[i])
            {
                min=myArray[i];
            }
            if (max<myArray[i])
            {
                max=myArray[i];
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент массива: "+max);
        System.out.println("Минимальный элемент массива: "+min);
        if (Math.abs(max)>Math.abs(min))
        {
            System.out.println("Наибольшее по модулю: "+max);
        }
        if (Math.abs(max)<Math.abs(min))
        {
            System.out.println("Наибольшее по модулю: "+min);
        }
        if (Math.abs(max)==Math.abs(min))
        {
            System.out.println("По модулю равны ");
        }
    }
}
