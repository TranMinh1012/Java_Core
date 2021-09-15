import java.util.*;
public class FindCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        boolean check = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                check = true;
                break;
            }
        }
        if(check) System.out.println("true");
        else System.out.println("false");
    }
}
