import java.util.*;
public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstInteger = sc.nextInt();
        int secondInteger = sc.nextInt();
        int thirdInteger =  sc.nextInt();
        int min = firstInteger < secondInteger ? firstInteger : secondInteger;
        min = min < thirdInteger ? min : thirdInteger;
        System.out.println(min);
    }
}
