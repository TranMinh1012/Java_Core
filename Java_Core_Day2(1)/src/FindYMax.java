import java.util.*;
public class FindYMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        Find(n, x);
    }
    public static void Find(int n, int x){
        long factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        int y = 0;
        while(factorial % x == 0){
            factorial /= x;
            y++;
        }
        System.out.println(y);
    }
}
