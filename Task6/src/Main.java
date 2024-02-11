import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите массу или расстояние 1 - масса, 2 - расстояние:");
        int first =in.nextInt();
        double kg, pud, uncii, gr,metr,mil,yard,fut;
        if (first == 1) {
            System.out.println("Выберите еденицу измерения  1 - киллограмм, 2 - пуды, 3 - унции, 4 - граммы:");
            int second = in.nextInt();
            System.out.println("Введите число:");
            int third = in.nextInt();
                if (second ==1) { kg = third; pud = third*0.061; uncii = third*35.27; gr=third*1000;
                        System.out.println("Результат: " +"Килограммы: "+ kg +" Пуды: "+ pud+" Унции: "+uncii+" Граммы: "+gr);}
                if (second ==2) { kg = third*16.38; pud = third; uncii = third*577.79; gr=third*16380;
                    System.out.println("Результат: " +"Килограммы: "+ kg +" Пуды: "+ pud+" Унции: "+uncii+" Граммы: "+gr);}
                if (second ==3) { kg = third*0.028; pud = third*0.0017; uncii = third; gr=third*28.35;
                    System.out.println("Результат: " +"Килограммы: "+ kg +" Пуды: "+ pud+" Унции: "+uncii+" Граммы: "+gr);}
                if (second ==4) { kg = third*0.001; pud = third*0.000061; uncii = third*0.035; gr=third;
                    System.out.println("Результат: " +"Килограммы: "+ kg +" Пуды: "+ pud+" Унции: "+uncii+" Граммы: "+gr);}

        }
        if (first == 2) {
            System.out.println("Выберите еденицу измерения  1 - метр, 2 - миля, 3 - ярд, 4 - фут:");
            int second = in.nextInt();
            System.out.println("Введите число:");
            int third = in.nextInt();
                if (second ==1) { metr = third; mil = third*0.00062; yard = third*1.0936; fut=third*3.2808;
                    System.out.println("Результат: " +"Метры: "+ metr +" Миля: "+ mil+" Ярд: "+yard+" Фут: "+fut);}
                if (second ==2) { metr = third*1609.344; mil = third; yard = third*1760; fut=third*5280;
                    System.out.println("Результат: " +"Метры: "+ metr +" Миля: "+ mil+" Ярд: "+yard+" Фут: "+fut);}
                if (second ==3) { metr = third*0.9144; mil = third*0.000568; yard = third; fut=third*3;
                    System.out.println("Результат: " +"Метры: "+ metr +" Миля: "+ mil+" Ярд: "+yard+" Фут: "+fut);}
                if (second ==4) { metr = third*0.3048; mil = third*0.000189; yard = third*0.333; fut=third;
                    System.out.println("Результат: " +"Метры: "+ metr +" Миля: "+ mil+" Ярд: "+yard+" Фут: "+fut);}

        }


    }
}


