import java.util.*;
public class ReverseTheWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.trim();
        for(String words : input.split("\\s")){
            for(int i = words.length()-1; i >= 0; i--){
                System.out.print(words.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
