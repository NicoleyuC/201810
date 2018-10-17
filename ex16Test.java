//圓柱體積計算
import java.lang.*;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeMath.PI;

public class ex16Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat(), h = sc.nextFloat();
        System.out.println(PI*r*r*h);
    }
}
