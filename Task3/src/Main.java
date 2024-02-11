import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задайте массив из 5 любых целых чисел
        int [] myArray = new int []{5,7,12,3,20};
        System.out.println("Заданный массив:");
        for (int i=0; i< myArray.length; i++)
        {
            System.out.print(" "+myArray[i]);
        }
        //Поменяйте местами первый и последний элемент в массиве
        System.out.println("\n Поменять местами первый и последний элемент в массиве:");
        int firstValue = myArray[0];
        myArray[0] = myArray[myArray.length-1];
        myArray[myArray.length-1] = firstValue;
        for (int i=0; i< myArray.length; i++)
        {
            System.out.print(" "+myArray[i]);
        }
        //Вывести в консоль результат суммы первого и среднего элемента
        System.out.println("\n Сумма первого и среднего элемента:");
        int sum =myArray[0]+myArray[myArray.length/2];
        System.out.print(sum);
    }
}
