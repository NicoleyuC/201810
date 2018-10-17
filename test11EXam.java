import java.util.Scanner;
//輸入三數輸出最大值與最小值
public class test11EXam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),y = sc.nextInt(),z = sc.nextInt();
        System.out.println(Math.max(Math.max(x,y),z));
        System.out.println(Math.min(Math.min(x,y),z));
    }
}
