import java.util.Scanner;

public class test17EXam{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int du = sc.nextInt();
        float Sum,UnSum ;
        if ( du <= 120 ){
            Sum = du * 2.10f;
            UnSum = du * 2.10f;
        }else if (du <= 330){
            du = du - 120;
            Sum = 120*2.10f + du * 3.02f;
            UnSum = 120*2.10f + du * 2.68f;
        }else if (du <= 500){
            du = du - 330;
            Sum = 120*2.10f + (330-120)* 3.02f + du * 4.39f;
            UnSum = 120*2.10f + (330-120)*2.68f + du * 3.61f;
        }else if (du <=700){
            du = du - 500;
            Sum = 120*2.10f + 210*3.02f + 170*4.39f + du * 4.97f;
            UnSum = 120*2.10f + 210*2.68f + 170*3.61f + du * 4.01f;
        }else {
            du = du - 700;
            Sum =120*2.10f+210*3.02f+170*4.39f+200*4.97f+du*5.63f;
            UnSum =120*2.10f+ 210*2.68f+170*3.61f +200 *4.01f +du*4.50f;
            System.out.printf("%.2f\n" ,Sum);
            System.out.printf("%.2f\n  ",UnSum);
        }
    }
}