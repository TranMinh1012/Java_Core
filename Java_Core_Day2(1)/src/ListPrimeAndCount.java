import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ListPrimeAndCount {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("input.txt"));
        int[] arr = new int[1000];
        int increment = 0;
        while(scanner.hasNextInt()){
            arr[increment++] = scanner.nextInt();
            if(increment >= 1000){
                break;
            }
        }
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            temp[i] = 1;
        }
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == 0){
                break;
            }
            int count = 1;
            if(temp[i]==1){
                temp[i] = 0;
                for(int j = i+1; j < arr.length; j++){
                    if(arr[i] == arr[j]){
                        temp[j] = 0;
                        count++;
                    }
                }
                if(AllIsPrime(arr[i])){
                    System.out.println(arr[i] + " " + count);
                }
            }
        }
    /*    for(int number: arr){
            if(number == 0){
                break;
            }
            if(AllIsPrime(number)){
                System.out.print(number + " ");
            }
        } */
    }
    public static boolean CheckPrime(int n){
        if(n<2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int LengthOfElements(int n){
        int count = 0;
        while(n>0){
            count++;
            n /= 10;
        }
        return count;
    }
    public static boolean AllIsPrime(int n){
        int count = 0;
        int m = n;
        while(m>0){
            if(CheckPrime(m%10)){
                count++;
            }
            m /= 10;
        }
        if(count != LengthOfElements(n)){
            return false;
        }
        return true;
    }
}
