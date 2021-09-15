import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstInteger = sc.nextInt();
        int secondInteger = sc.nextInt();
        firstInteger = firstInteger + secondInteger;
        secondInteger = firstInteger - secondInteger;
        firstInteger = firstInteger - secondInteger;
        System.out.println("firstInteger = " + firstInteger);
        System.out.println("secondInteger = " + secondInteger);
    }
}
