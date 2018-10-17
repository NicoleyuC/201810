//單位換算：稱斤論兩

import java.util.Scanner;
public class test9EXam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        System.out.println((Math.round(x/600f*10))/10f);
    }
}
