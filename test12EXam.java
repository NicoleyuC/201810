import java.util.Scanner;

public class test12EXam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(Math.round(x*(Math.pow(10f,n)))/Math.pow(10f,n));
    }
}