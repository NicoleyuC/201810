//字串切割 - 法1
import java.util.*;

public class test6EXam {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        char ch = sc.next().charAt(0);
        st = st.replace(ch,'\n');
        System.out.println(st);
   }
}

//字串切割 - 法2
//import java.util.*;
//
//public class test6EXam{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        for(String st_line : str.split("#")){
//            System.out.println(st_line);
//        }
//    }
//}