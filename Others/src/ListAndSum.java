import java.math.*;
import java.util.*;
import java.util.Set;
import java.util.HashSet;
public class ListAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger input = new BigInteger(sc.next());
        BigInteger valueToDivide = new BigInteger("10");
        BigInteger sumOfElements = new BigInteger("0");
        Set<BigInteger> ListOfNumbers = new HashSet<BigInteger>();
        while(input.toString().equals("0") == false){
            BigInteger splitElement = input.mod(valueToDivide);
            ListOfNumbers.add(splitElement);
            sumOfElements = sumOfElements.add(splitElement);
            input = input.divide(valueToDivide);
        }
        System.out.println(ListOfNumbers);
        System.out.println(sumOfElements);
    }
}
