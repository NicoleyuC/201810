//取得中文字元萬國碼(Unicode)
import java.util.Scanner;

public class test14EXam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(Integer.toHexString(ch));
    }
}
