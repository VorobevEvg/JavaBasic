import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Курс доллара:");
        double dollar =in.nextDouble();
        System.out.println("Кол-во рублей:");
        double quantity =in.nextDouble();
        double count = dollar*quantity;
        double itog = Math.round(count* 100.0)/100.0;
        System.out.println("Итого: "+itog);
    }
}


