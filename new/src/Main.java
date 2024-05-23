import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы. Кол-во строк:");
        String linesStr = in.nextLine();
        int linesInt = Integer.parseInt(linesStr);
        System.out.println("Введите размерность матрицы. Кол-во столбцов:");
        String columnsStr = in.nextLine();
        int columnsInt = Integer.parseInt(columnsStr);
        System.out.println("Матрица "+linesStr+" x " + columnsStr);

        int [] [] Array = new int [linesInt] [columnsInt];
        for ( int i=0; i<linesInt; i++){
            for (int j=0; j<columnsInt; j++){
                System.out.println("Введите данные в матрицу. Строка "+i+" столбец "+j);
                String dataStr = in.nextLine();
                int dataInt = Integer.parseInt(dataStr);
                Array[i][j]=dataInt;
            }
        }
        System.out.println("Матрица: ");
        for ( int i=0; i<linesInt; i++){
            for (int j=0; j<columnsInt; j++){
                System.out.print(" " +Array[i][j]+" " );
            }
            System.out.println();
        }
        System.out.println("Первая строка матрицы умноженная на 3: ");
        for ( int j=0; j<columnsInt; j++){
            Array[0][j]=Array[0][j]*3;
            System.out.print(" " +Array[0][j]+" " );
        }

    }
}
