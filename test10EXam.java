import java.util.Scanner;

//字串字元置換
public class test10EXam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        char ca = sc.next().charAt(0);
        System.out.println(str.replace(ch,ca));
    }
}
