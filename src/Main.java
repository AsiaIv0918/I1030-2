import java.util.*;
public class Main {
//計算加班費
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a;
        a=in.nextInt();
        if(a<=40) {
            a = a * 100;
            System.out.printf("%d", a);
        }   else
            a=(a-40)*120+4000;
            System.out.printf("%d",a);
    }
}
