import java.util.*;
//單位換算：身高及體重 (1磅0.454kg;1吋2.54cm)
public class test5EXam {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int h = s.nextInt(),w = s.nextInt();
        System.out.println(h/2.54d);
        System.out.println(w/0.454d);
    }
}
