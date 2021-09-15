import java.util.*;
public class FindYMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(Find(n, x));
    }
    public static int Find(int n, int x){
        int y = 0;
        while(n > 0){
            n /= x;
            y += n;
        }
        return y;
    }
}
