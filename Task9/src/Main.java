import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Размер массива:");
        int length =in.nextInt();
        double sum = 0.0;
        double [] myArray = new double [length];
        for (int i=0; i< length; i++)
        {
            System.out.println("Введите "+(i+1)+" значение:" );
            double y =in.nextDouble();
            myArray[i]=y;
            sum = sum + myArray[i];
        }
        double avg = sum/length;
        for (int j=0; j< length; j++)
        {
            System.out.print(myArray[j]*avg+" ");
        }
        }
}


