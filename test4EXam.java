import java.util.*;
//總分及平均成績

public class test4EXam {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int chi = sc.nextInt(),eng = sc.nextInt(),mat = sc.nextInt();
        System.out.println( chi + eng + mat );
        System.out.println( ( chi + eng + mat )/3 );
    }
}
