import java.util.*;
public class CheckFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        long[] f = new long[94];
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;
        if(input==0 || input==1){
            System.out.println("This number is the Fibonacci number");
        } else {
            boolean checkFibonacci = false;
            for(int i = 3; i <= 93; i++){
                f[i] = f[i-1] + f[i-2];
                if(f[i]==input){
                    System.out.println("This number is the Fibonacci number");
                    checkFibonacci = true;
                    break;
                }
            }
            if(!checkFibonacci){
                System.out.println("This number is not a Fibonacci number");
            }
        }
    }
}
