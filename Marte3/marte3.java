import java.util.Scanner;

public class marte3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x, y, n;
        x = s.nextInt();
        y = s.nextInt();
        n = s.nextInt();
        System.out.println(n / (x * y));
        System.out.println((n % (x * y)) / y);
        System.out.println(n % (x * y) % y);
    }
}
