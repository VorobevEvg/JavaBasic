public class Main {
    public static void main(String[] args) {
    String str = ("I like Java!!!");
    boolean result1, result2, result3, result4;
    result1 = str.contains("Java");
    result2 = str.startsWith("I like");
    result3 = str.endsWith("!!!");
    if (result1==true && result2==true && result3==true)
    {
        System.out.println(str.toUpperCase());
    }
    str = str.replace('a','o');
    System.out.println(str.substring(7,11));
    }
}