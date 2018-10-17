//單位換算：公升轉加侖 1l = 0.26418 美加侖
import java.util.*;
import static java.lang.Math.round;

public class test8Exam {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    float x = sc.nextFloat();
	    float y = 0.26418f * x;
        System.out.println(round(y*10)/10f);
    }
}
