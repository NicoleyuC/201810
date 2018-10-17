import java.util.Scanner;

//取得16進制萬國碼(Unicode)對應中文字
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int x = Integer.valueOf(st,16);
        System.out.println((char) x);
    }
}
